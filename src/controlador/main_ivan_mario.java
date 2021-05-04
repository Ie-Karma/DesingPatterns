package controlador;
import java.util.Scanner;
import decorator.*;

public class main_ivan_mario {

	static Personaje personaje;
	
	public static void main(String[] args) {
				
		personaje = new PersonajeBase(printInfo());
		
		
		
		prueba();
				
	}

	public static void prueba() {		
		
		enemigo();
		eleccion();
		
	}

	private static int printInfo() {

	    @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println
		
				("╔══════════════════════════════════╗\n"
			   + "║                                  ║\n"
			   + "║           YO INTERNETO           ║\n"
			   + "║            -THE GAME-            ║\n"
			   + "║                                  ║\n"
			   + "║                BY                ║\n"
			   + "║                                  ║\n"
			   + "║ Mario Gallego      Ivan Zabaleta ║\n"
			   + "║                                  ║\n"
			   + "╠══════════════════════════════════╣\n"
			   + "║                                  ║\n"
			   + "║          « PERSONAJES »          ║\n"
			   + "║                                  ║\n"
			   + "╠════════════< ORSLOK >════════════╣\n"
			   + "║                                  ║\n"
			   + "╠ VIDA:          20                ║\n"
			   + "╠ ATAQUE:         5                ║\n"
			   + "╠ DESTREZA:      10                ║\n"
			   + "║                                  ║\n"
			   + "╠════════════<  DARIO >════════════╣\n"
			   + "║                                  ║\n"
			   + "╠ VIDA:          30                ║\n"
			   + "╠ ATAQUE:         2                ║\n"
			   + "╠ DESTREZA:       6                ║\n"
			   + "║                                  ║\n"
			   + "╠════════════< CHEETO >════════════╣\n"
			   + "║                                  ║\n"
			   + "╠ VIDA:          35                ║\n"
			   + "╠ ATAQUE:         4                ║\n"
			   + "╠ DESTREZA:       4                ║\n"
			   + "║                                  ║\n"
			   + "╚══════════════════════════════════╝\n"
			   + "╔══════════════════════════════════╗\n"
			   + "║                                  ║\n"
			   + "║       « SELECCIONA UNO »         ║\n"
			   + "║                                  ║\n"
			   + "╠ ORSLOK       < 1 >               ║\n"
			   + "╠ DARIO        < 2 >               ║\n"
			   + "╠ CHEETO       < 3 >               ║\n"
			   + "║                                  ║\n"
			   + "╚══════════════════════════════════╝\n"
			   );
		
		int cha = scanner.nextInt();
		return (cha-1);
	}

	@SuppressWarnings({ "resource" })
	private static void eleccion(){
		
	    Scanner scanner = new Scanner(System.in);

		int sel = 0;
		
		do {
			
			System.out.println("\n¿Qué deseas hacer?");

			personaje.accion();
			
			sel = scanner.nextInt();
			
			switch(sel){
				
			case 1:atacar();
			break;
			case 2:beber();
			break;
			case 3:ayuda();
			break;
			case 4:
			break;
			case 5:
				personaje = new CheetoMartillo(personaje);
			break;
			case 6:personaje.stats();
			break;

				
			}
			
		}while(sel != 7);
		
	}
	
	private static void enemigo() {
		
		String enemigo[] = {"lobo","girafa","perro","gato"};
		
		int ene;
		ene = (int)(Math.random()*3);
			
		//abstract factory
		System.out.println("\nte toca luchar contra " + enemigo[ene] + "\n");
			
	}

	private static void atacar() {
		
		//strategy
		System.out.println("atacas");
		
	}
	
	private static void beber() {
		
		//decorator
		System.out.println("bebes una mahou");
		
	}
	
	private static void ayuda() {
		
		System.out.println("casio te pone musica epica");
		
	}
	
}
