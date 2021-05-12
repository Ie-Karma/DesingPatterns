package controlador;
import java.util.Scanner;

import abstract_factory.*;
import decorator.*;
import singleton.Singleton;
import strategy.*;
import template_method.*;

public class main_ivan_mario {

	private static Personaje personaje;
	private static DataPrinter data;
	private static int per;
	private static String mundo;
	private static EnemyController enemy;
	@SuppressWarnings("unused")
	private static TemplateAcciones accionesEnemigo;
	@SuppressWarnings("unused")
	private static Strategy estrategia;
	private static Singleton calcular;
	private static int esqui = 0;
	private static int esqui2 = 0;
	private static int herido = 0;
	private static int NMundo = 0;
	
	public static void main(String[] args) {		
			
		data = new DataPrinter();
		int n = data.printInfo();
		personaje = new PersonajeBase(n);
		per = n;
		calcular = Singleton.getCalculadora();
		
		while(personaje.getVida() > 0) {
			partida();
		}
		
	}

	public static void partida() {		
		
		personaje.setEstado("Activo");
		NMundo++;
		data.nMundo(NMundo);
		mundo();
		enemigo();
		data.espera(1000);
				
		turno(data.monedaAzar());
		
	}

	private static void compro(int esqui) {
		
		if(esqui == 0) {calcular.setPerEsquiva(false);}
		else {esqui--;}
		if(esqui2 == 0) {calcular.setEneEsquiva(false);}
		else {esqui2--;}
		if(herido == 0 && personaje.getEstado() == "Herido") {personaje.setEstado("Activo");}
		else {if(herido>0) {personaje.setEstado("Herido");herido--;data.espera(1000);}}
		
	}
		
	private static void cogerObjeto() {
		
		switch (data.objetos()) {
		
		case 0:
			personaje = new PersonajeCoraza(personaje);
			turno(0);
			break;
		case 1:
			personaje = new PersonajeGafas(personaje);
			turno(0);
			break;
		case 2:
			personaje = new PersonajeMartillo(personaje);
			turno(0);
			break;
		case 3:
			turno(1);
			break;
		}
		
	}
	
	private static void turno(int n) {
		
		if(n == 1) {
			accionesPer();
		}else {
			eleccionEnemy();
		}
		
	}
	
	private static void switchAcciones(int sel){
		
		switch(sel){
		
		case 1://ATACAR
			calcular.ataque(true);
			calcular.setEneEsquiva(false);
			if( enemy.stats(false, 0, 0) <= 0) {break;}
			turno(0);
			break;
			
		case 2://ESQUIVAR
			calcular.setPerEsquiva(true);
			esqui = 1;
			turno(0);
			break;
			
		case 3://BEBER MAHOU
			data.infoMahou(personaje);
			personaje.setEstado("Paralizado");
			turno(0);
			break;
			
		case 4://VAPEAR
			data.infoSanadora(personaje);
			turno(0);
			break;
			
		case 5://COGER OBJETO
			cogerObjeto();
			turno(0);
			break;
			
		case 6://STATS
			data.stats(personaje);
			data.enemyStats(enemy);
			turno(1);
			break;
			
		case 7:
				data.end();
				break;
		}

	}
	
	private static void switchAccionesPara(int sel) {
		
		switch(sel){
		
		case 4://VAPEAR
			data.infoSanadora(personaje);
			personaje.setEstado("Activo");
			turno(0);
			break;			
		case 6://STATS
			data.stats(personaje);
			data.enemyStats(enemy);
			turno(1);
			break;
			
		case 7:
			data.end();
			break;
		}
		
	}
	
	@SuppressWarnings({ "resource" })
	private static void accionesPer(){
		
	    Scanner scanner = new Scanner(System.in);
		esqui = 0;
		
			do {
				
				compro(esqui);
				calcular.setPersonaje(personaje);
				calcular.setEnemy(enemy);
								
				if( enemy.stats(false, 0, 0) <= 0) {break;}
				
				if(personaje.getEstado() != "Paralizado") {
					
					data.accion();
					switchAcciones(scanner.nextInt());
					
				}else {
					
					data.accionParalizado();
					switchAccionesPara(scanner.nextInt());
					
				}
							
			}while(enemy.stats(false, 0, 0)>0);
			
			data.espera(1000);
			data.enemigoEliminado();
			data.espera(1000);
			partida();
				
	}
	
	private static void enemigo() {
							
		//abstract factory
				
		EnemyFactory loc = null;
		
		switch(mundo) {
		
		case "Calle":
			loc = new EnemigosCalle();
			break;
		case "Jungla":
			loc = new EnemigosJungla();
			break;
		case "Playa":
			loc = new EnemigosPlaya();
			break;
		}
				
		enemy = new EnemyController((int)(Math.random()*3),loc);
		enemy.info();
			
	}
	
	private static void mundo() {
		
		String munrand[] = {"Calle","Jungla","Playa"};
		
		int rand = (int)(Math.random()*3);
		mundo = munrand[rand];
					
		data.infoMundo(rand);
		
		data.espera(1000);
		
		if(mundo == personaje.getMundo()) {
			
			data.ventajaMundo();
			
			switch(per) {
			
			case 0:
				personaje.setStats(1, 20);
				break;
			case 1:
				personaje.setStats(0, 220);
				break;
			case 2:
				personaje.setStats(2, 6);
				break;
			}
			
		}
			
	}
	
	private static void eleccionEnemy() {
		
		data.espera(1000);
		
		enemy.setAccion();
		enemy.getAccion().Actuar();
		
		if(enemy.getAccion().info() == 1) {
			
			int a = calcular.ataque(false);
			if(personaje.getVida() <= 0) {data.espera(1000);data.personajeEliminado();}
			calcular.setPerEsquiva(false);
			if(a==1) {
				
				System.out.printf(
						 "╠══════════════════════════════════╣\n"
					   + "║         « Tipo de ataque »       ║\n"
					   + "║                                  ║\n"
					   + "║   El ataque enmigo era de tipo:  ║\n");
				
				switch(enemy.getEstrategia().tipo()) {
				
				case "Paralizado":
					System.out.printf(
						     "║            « Helado »            ║\n"
						   + "║                                  ║\n"
						   + "║       Este ataque te paraliza    ║\n"
						   + "╚══════════════════════════════════╝\n");
					personaje.setEstado(enemy.getEstrategia().tipo());
					break;
				case "Herido":
					System.out.printf(
						     "║           « Veneno »             ║\n"
						   + "║                                  ║\n"
						   + "║    Este ataque te deja herido    ║\n"
						   + "║        Recibes 5 de danio        ║\n"
						   + "║         Durante 2 turnos         ║\n"
						   + "╚══════════════════════════════════╝\n");
					herido = 2;
					break;
				case "Activo":
					System.out.printf(
						     "║            « Normal »            ║\n"
						   + "║                                  ║\n"
						   + "║   Este ataque no tiene efectos   ║\n"
						   + "╚══════════════════════════════════╝\n");
					break;
				
				}
				
			}
			
		}else {
			calcular.setEneEsquiva(true);
			esqui2 = 1;
		}
		
		data.espera(1000);
		turno(1);
		
	}
	
}
