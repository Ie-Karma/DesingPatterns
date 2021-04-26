package decorator;

public class PersonajeBase implements Personaje{

	int num = 0;
	String nombre;
	int vida;
	int ataque;
	int destreza;
	String acciones[] = new String[7];
	
	public PersonajeBase(int per) {
		
		num = per;
		
		acciones[0] = "Atacar";
		acciones[1] = "Esquivar";
		acciones[2] = "Beber Mahou";
		acciones[5] = "Stats";
		acciones[6] = "Terminar";

		switch (per){
			case 0:
				vida = 10;
				ataque = 5;
				destreza = 8;
				nombre = "Orslok";
				acciones[3] = "Vapear";
				acciones[4] = "Robar algo";
				break;
			case 1:
				vida = 15;
				ataque = 2;
				destreza = 6;
				nombre = "Dario";
				acciones[3] = "Hablar Portugues";
				acciones[4] = "Incomodar";
				break;
			case 2:
				vida = 20;
				ataque = 4;
				destreza = 4;
				nombre = "Cheeto";
				acciones[3] = "Lanzar martillo";
				acciones[4] = "Cocinar algo";
				break;
		}
		
	}
	
	public String getNombre() {
		
		return nombre;
		
	}

	@Override
	public void stats() {
		
		System.out.print
					("╔══════════════════════════════════╗\n"
				   + "║            « STATS »             ║\n"
				   + "║                                  ║\n"
				   + "╠ VIDA <"+vida+">                        ║\n"
				   +"║ "
				);
		for(int i = 0; i<32;i++) {
			
			if(i<vida) {System.out.print("*");}
			else {System.out.print(" ");}
			
		}
		
		System.out.print(
				" ║\n"
						+ "╠ ATAQUE <"+ataque+">                       ║\n"
						+ "╠ DESTREZA <"+destreza+">                     ║\n"
						+ "╠ ESTADO <NINGUNO>                 ║\n"
						+ "║                                  ║\n"
						+ "╚══════════════════════════════════╝\n"
				);

	}

	@Override
	public String getAccion(int a) {
		return acciones[a];
	}

	@Override
	public void accion() {

		System.out.print
					("╔══════════════════════════════════╗\n"
				   + "║           « ACCIONES »           ║\n"
				   + "║                                  ║\n"
				   + "╠ <1>       ATACAR                 ║\n"
				   + "╠ <2>       ESQUIVAR               ║\n"
				   + "╠ <3>       BEBER MAHOU            ║\n"

		);
		
		switch(num) {
		
		case 0:
			System.out.print
			
			   ( "╠ <4>       VAPEAR                 ║\n"
			   + "╠ <5>       ROBAR ALGO             ║\n"
					   );
			break;
		case 1:
			System.out.print
			
			   ( "╠ <4>       HABLAR PORTUGUES       ║\n"
			   + "╠ <5>       INCOMODAR              ║\n"
					   );
			break;
		case 2:
			System.out.print
			
			   ( "╠ <4>       LANZAR MARTILLO        ║\n"
			   + "╠ <5>       COCINAR ALGO           ║\n"
					   );
			break;
		
		}
		System.out.println
	
		   ( "╠ <6>       STATS                  ║\n"
		   + "╠ <7>       TERMINAR               ║\n"
		   + "║                                  ║\n"
		   + "╚══════════════════════════════════╝\n"
		   );
		
	}

}

/*

0-Orslok V-20 A-5 D-10
1-Dario	V-30 A-2 D-6
2-Cheeto V-35 A-4 D-4

*/