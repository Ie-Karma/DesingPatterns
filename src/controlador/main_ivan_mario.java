package controlador;
import java.util.Scanner;
import decorator.*;
import state.*;

public class main_ivan_mario {

	static Personaje personaje;
	static DataPrinter data;
	static int per;
	
	public static void main(String[] args) {
				
		int n = printInfo();
		personaje = new PersonajeBase(n);
		data = new DataPrinter(n);
		per = n;
		
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
					break;
					
				}
				
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
	
}
