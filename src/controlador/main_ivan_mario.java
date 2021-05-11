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
	private static int esqui2 = 0;
	private static int herido = 0;
	
	public static void main(String[] args) {		
			
		data = new DataPrinter();
		int n = data.PrintInfo();
		personaje = new PersonajeBase(n);
		per = n;
		calcular = Singleton.getCalculadora();
		
		while(personaje.getVida() > 0) {
			Partida();
		}
		
	}

	public static void Partida() {		
		
		Mundo();
		espera(1000);
		Enemigo();
		espera(1000);
		Eleccion();
		
	}

	@SuppressWarnings({ "resource" })
	private static void Eleccion(){
		
	    Scanner scanner = new Scanner(System.in);

		int sel = 0;
		int esqui = 0;
		
			do {
				
				if(esqui == 0) {calcular.setPerEsquiva(false);}
				else {esqui--;}
				if(esqui2 == 0) {calcular.setEneEsquiva(false);}
				else {esqui2--;}
				if(herido == 0 && personaje.getEstado() == "Herido") {personaje.setEstado("Activo");}
				else {if(herido>0) {personaje.setEstado("Herido");herido--;espera(1000);}}
				
				calcular.setPersonaje(personaje);
				calcular.setEnemy(enemy);
								
				if( enemy.Stats(false, 0, 0) <= 0) {break;}
				
				System.out.println("\n¿Qué deseas hacer?");

				if(personaje.getEstado() != "Paralizado") {
					
					data.Accion();
					
					sel = scanner.nextInt();
					
					switch(sel){
						
					case 1://ATACAR
						calcular.Ataque(true);
						calcular.setEneEsquiva(false);
						if( enemy.Stats(false, 0, 0) <= 0) {break;}
						eleccionEnemy();
						break;
					case 2://ESQUIVAR
						calcular.setPerEsquiva(true);
						esqui = 1;
						eleccionEnemy();
						break;
					case 3://BEBER MAHOU
						data.InfoMahou(personaje);
						personaje.setEstado("Paralizado");
						eleccionEnemy();
						break;
					case 4://VAPEAR
						data.InfoSanadora(personaje);
						eleccionEnemy();
						break;
					case 5://COGER OBJETO
						
						switch (data.Objetos()) {
						
						case 0:
							personaje = new PersonajeCoraza(personaje);
							break;
						case 1:
							personaje = new PersonajeGafas(personaje);
							break;
						case 2:
							personaje = new PersonajeMartillo(personaje);
							break;
						
						}
						eleccionEnemy();	
						break;
					case 6://STATS
						data.Stats(personaje);
						data.EnemyStats(enemy);
						break;
						
					}
					
				}else {
					
					data.AccionParalizado();
					
					sel = scanner.nextInt();
					
					switch(sel){
					
					case 4://VAPEAR
						data.InfoSanadora(personaje);
						personaje.setEstado("Activo");
						eleccionEnemy();
						break;			
					case 6://STATS
						data.Stats(personaje);
						data.EnemyStats(enemy);
						break;
						
					}
					
				}
							
			}while(sel != 7 );
			
			espera(1000);
			data.EnemigoEliminado();
			espera(1000);
				
	}
	
	private static void Enemigo() {
							
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
		enemy.Info();
			
	}
	
	private static void Mundo() {
		
		String munrand[] = {"Calle","Jungla","Playa"};
		
		int rand = (int)(Math.random()*3);
		mundo = munrand[rand];
					
		data.InfoMundo(rand);
		
		espera(1000);
		
		if(mundo == personaje.getMundo()) {
			
			data.VentajaMundo();
			
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
		
		espera(1000);
		
		enemy.setAccion();
		enemy.getAccion().Actuar();
		
		if(enemy.getAccion().Info() == 1) {
			
			int a = calcular.Ataque(false);
			if(personaje.getVida() <= 0) {espera(1000);data.PersonajeEliminado();}
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
		
		espera(1000);
		
	}
	
	public static void espera(int n) {
		
		try {
			Thread.sleep(n);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
