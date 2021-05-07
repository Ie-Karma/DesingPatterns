package controlador;
import java.util.Scanner;

import abstract_factory.*;
import decorator.*;

public class main_ivan_mario {

	static Personaje personaje;
	static DataPrinter data;
	static int per;
	static String mundo;
	static EnemyFactory enemy;
	static GameController juego;
	
	public static void main(String[] args) {		
			
		data = new DataPrinter();
		int n = data.PrintInfo();
		personaje = new PersonajeBase(n);
		per = n;
		
		Prueba();
				
	}

	public static void Prueba() {		
		
		Mundo();
		Enemigo();
		Eleccion();
		
	}

	@SuppressWarnings({ "resource" })
	private static void Eleccion(){
		
	    Scanner scanner = new Scanner(System.in);

		int sel = 0;
		
		do {
			
			System.out.println("\n¿Qué deseas hacer?");

			if(personaje.getEstado() != "Paralizado") {
				
				data.Accion();
				
				sel = scanner.nextInt();
				
				switch(sel){
					
				case 1://ATACAR
					break;
				case 2://ESQUIVAR
					break;
				case 3://BEBER MAHOU
					personaje.setEstado("Paralizado");
					break;
				case 4://VAPEAR
					data.InfoSanadora(personaje);
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
									
					break;
				case 6://STATS
					data.Stats(personaje);
					data.EnemyStats(juego);
					break;
					
				}
				
			}else {
				
				data.AccionParalizado();
				
				sel = scanner.nextInt();
				
				switch(sel){
				
				case 4://VAPEAR
					data.InfoSanadora(personaje);
					personaje.setEstado("Activo");
					break;			
				case 6://STATS
					data.Stats(personaje);
					data.EnemyStats(juego);
					break;
					
				}
				
			}

		}while(sel != 7);
		
	}
	
	private static void Enemigo() {
							
		//abstract factory
				
		switch(mundo) {
		
		case "Calle":
			enemy = new EnemigosCalle();
			break;
		case "Jungla":
			enemy = new EnemigosJungla();
			break;
		case "Playa":
			enemy = new EnemigosPlaya();
			break;
		}
				
		juego = new GameController((int)(Math.random()*3),enemy);
		juego.Info();
			
	}
	
	private static void Mundo() {
		
		String munrand[] = {"Calle","Jungla","Playa"};
		
		int rand = (int)(Math.random()*3);
		mundo = munrand[rand];
					
		data.InfoMundo(rand);
		
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
	
}
