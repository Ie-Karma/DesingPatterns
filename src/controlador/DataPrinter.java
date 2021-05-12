package controlador;

import java.util.Scanner;

import abstract_factory.EnemyController;
import decorator.*;

public class DataPrinter {

	int num;	
	boolean coraza = false;
	boolean gafas = false;
	boolean martillo = false;
	
	public int PrintInfo() {

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
			   + "╠ VIDA:         150                ║\n"
			   + "╠ ATAQUE:        15                ║\n"
			   + "╠ DESTREZA:     70%                ║\n"
			   + "╠ MUNDO:      CALLE                ║\n"
			   + "║                                  ║\n"
			   + "╠════════════<  DARIO >════════════╣\n"
			   + "║                                  ║\n"
			   + "╠ VIDA:         200                ║\n"
			   + "╠ ATAQUE:        10                ║\n"
			   + "╠ DESTREZA:     50%                ║\n"
			   + "╠ MUNDO:     JUNGLA                ║\n"
			   + "║                                  ║\n"
			   + "╠════════════< CHEETO >════════════╣\n"
			   + "║                                  ║\n"
			   + "╠ VIDA:         250                ║\n"
			   + "╠ ATAQUE:        10                ║\n"
			   + "╠ DESTREZA:     30%                ║\n"
			   + "╠ MUNDO:      PLAYA                ║\n"
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
		num = cha - 1;
		
		return (num);
		
	}

	public void VentajaMundo() {
		
		System.out.print
		("╔══════════════════════════════════╗\n"
	   + "║                                  ║\n"
	   + "║    « ESTAS EN TU TERRITORIO »    ║\n"
	   + "║                                  ║\n"
	   + "║  Luchas en tu propio territorio  ║\n"
	   + "║       eso te proporciona :       ║\n"
	   + "║                                  ║\n");
		
		switch (num) {
		
		case 0:
			System.out.print
				( "║          +5 de ataque            ║\n"
				+ "║                                  ║\n"
				+ "╚══════════════════════════════════╝\n");
			break;
		case 1:
			System.out.print
			   	( "║           +20 de vida            ║\n"
			   	+ "║                                  ║\n"
			   	+ "╚══════════════════════════════════╝\n");
			break;
		case 2:
			System.out.print
				( "║          +3 de destreza          ║\n"
				+ "║                                  ║\n"
				+ "╚══════════════════════════════════╝\n");
			break;
		
		}
		
	}
	
	public void InfoMundo(int n) {
		
		System.out.print
		("╔══════════════════════════════════╗\n"
	   + "║                                  ║\n"
	   + "║        TE ENCUENTRAS EN          ║\n");
		
		switch (n) {
		
		case 0:
			System.out.print
			( "║          « LA CALLE »            ║\n"
			+ "║                                  ║\n"
			+ "╠══════════════════════════════════╣\n"
			+ "║  Territorio con contaminacion,   ║\n"
			+ "║    mucho ruido y muy poblado     ║\n"
			+ "╠══════════════════════════════════╣\n"
			+ "║      En el destaca Orslok        ║\n"
			+ "╠══════════════════════════════════╣\n"
			+ "║ Hay que tener mucho cuidado con  ║\n"
			+ "║            los MDLR              ║\n"
			+ "║   muy peligrosos en La Calle     ║\n"
			+ "║                                  ║\n"
			+ "╚══════════════════════════════════╝\n");
			break;
		case 1:
			System.out.print
			( "║          « LA JUNGLA »           ║\n"
			+ "║                                  ║\n"
			+ "╠══════════════════════════════════╣\n"
			+ "║      Territorio desconocido      ║\n"
			+ "║    solo se escuchan animales     ║\n"
			+ "║         no hay personas          ║\n"
			+ "╠══════════════════════════════════╣\n"
			+ "║      En el destaca Dario         ║\n"
			+ "╠══════════════════════════════════╣\n"
			+ "║ Hay que tener mucho cuidado con  ║\n"
			+ "║        Frank de la jungla        ║\n"
			+ "║   se conoce La Jungla entera     ║\n"
			+ "║                                  ║\n"
			+ "╚══════════════════════════════════╝\n");
			break;
		case 2:
			System.out.print
			( "║          « LA PLAYA »            ║\n"
			+ "║                                  ║\n"
			+ "╠══════════════════════════════════╣\n"
			+ "║    Territorio muy caluroso,      ║\n"
			+ "║    mucho ruido y muy poblado     ║\n"
			+ "╠══════════════════════════════════╣\n"
			+ "║      En el destaca Cheeto        ║\n"
			+ "╠══════════════════════════════════╣\n"
			+ "║ Hay que tener mucho cuidado con  ║\n"
			+ "║           los Guiris             ║\n"
			+ "║      maestros del despiste       ║\n"
			+ "║                                  ║\n"
			+ "╚══════════════════════════════════╝\n");
			break;
		
		}
		
	}
	
	public void Accion() {
			
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
			   );
	break;
case 1:
	System.out.print
	
	   ( "╠ <4>     COMER SOPA DO MACACO     ║\n"
			   );
	break;
case 2:
	System.out.print
	
	   ( "╠ <4>       COCINAR ALGO           ║\n"
			   );
	break;

}
System.out.println

   ( 	   
	 "╠ <5>       COGER OBJETO           ║\n"
	+"╠ <6>       STATS                  ║\n"
   + "╠ <7>       TERMINAR               ║\n"
   + "║                                  ║\n"
   + "╚══════════════════════════════════╝\n"
   );
			
}

	public void Stats(Personaje a) {
		
		int n;
		
		n = a.getVida();
		System.out.printf(
					 "╔══════════════════════════════════╗\n"
				   + "║            « STATS »             ║\n"
				   + "║                                  ║\n"
				   + "╠ VIDA <%03d>                       ║\n"
				   + "║ "
				,n);
		
		for(int i = 0; i<32;i++) {
			
			if(i<(a.getVida()/10)) {System.out.print("*");}
			else {System.out.print(" ");}
			
		}
		n = a.getAtaque();
		System.out.printf(
						 " ║\n"
						+ "╠ ATAQUE <%02d>                      ║\n",n);
		n = a.getDestreza();
		System.out.printf( "╠ DESTREZA <%02d>                    ║\n",n);
				
		switch(a.getEstado()) {
		
		case ("Activo"):
			System.out.print( "╠ ESTADO <ACTIVO>                  ║\n");
			break;
		case ("Herido"):
			System.out.print( "╠ ESTADO <HERIDO>                  ║\n");
			break;
		case ("Paralizado"):
			System.out.print( "╠ ESTADO <PARALIZADO>              ║\n");
			break;
		
		}
		
		System.out.print(
						  "║                                  ║\n"
						+ "╚══════════════════════════════════╝\n"
				);
	}

	public void EnemyStats(EnemyController e) {
		
		System.out.printf(
				 "╔══════════════════════════════════╗\n"
			   + "║         « ENEMY STATS »          ║\n"
			   + "║                                  ║\n"
			   + "╠ VIDA <%03d>                       ║\n"
			   + "║ ",e.Stats(false, 0, 0));
		for(int i = 0; i<32;i++) {
			
			if(i<(e.Stats(false, 0, 0)/10)) {System.out.print("*");}
			else {System.out.print(" ");}
			
		}
		System.out.printf(
				" ║\n"
			   + "╠ ATAQUE <%02d>                      ║\n"
		       + "╠ DESTREZA <%02d>                    ║\n"
			   + "║                                  ║\n"
			   + "╚══════════════════════════════════╝\n"
			,e.Stats(false, 1, 0),e.Stats(false, 2, 0));
		
	}
	
	public int Objetos() {
		
	    @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int sel = 0;
		
		System.out.print
		("╔══════════════════════════════════╗\n"
	   + "║      « OBJETOS DISPONIBLES »     ║\n"
	   + "║                                  ║\n");
		
		if(coraza == false) {
			System.out.print("║ <1> CORAZA            +2 defensa ║\n");
		}
		
		if(gafas == false) {
			System.out.print("║ <2> GAFAS            +2 destreza ║\n");
		}
		
		if(martillo == false) {
			System.out.print("║ <3> MARTILLO           +2 ataque ║\n");
		}
		
		System.out.print
		("║ <4> NINGUNO                      ║\n"
		+"║                                  ║\n"
	   + "╚══════════════════════════════════╝\n");
		
		sel = scanner.nextInt();
 
		sel -= 1;
		
		switch (sel) {
		
		case 0:
			if(coraza) {sel = 4;}
			break;
		case 1:
			if(gafas) {sel = 4;}
			break;
		case 2:
			if(martillo) {sel = 4;}
			break;
		
		}
		
		setObj(sel);
		
		return sel;
		
	}
	
	private void setObj(int n) {
		
		switch (n) {
		
		case 0:
			coraza = true;
			break;
		case 1:
			gafas = true;
			break;
		case 2:
			martillo = true;
			break;
		
		}
		
	}
	
	public void AccionParalizado() {
		
		
		System.out.print
		("╔══════════════════════════════════╗\n"
	   + "║           « ACCIONES »           ║\n"
	   + "║                                  ║\n"
	   + "╠ <1>      ~ATACAR~                ║\n"
	   + "╠ <2>      ~ESQUIVAR~              ║\n"
	   + "╠ <3>      ~BEBER MAHOU~           ║\n"

);

switch(num) {

case 0:
System.out.print

   ( "╠ <4>       VAPEAR                 ║\n"
		   );
break;
case 1:
System.out.print

   ( "╠ <4>     COMER SOPA DO MACACO     ║\n"
		   );
break;
case 2:
System.out.print

   ( "╠ <4>       COCINAR ALGO           ║\n"
		   );
break;

}
System.out.println

( 	   
  "╠ <5>      ~COGER OBJETO~          ║\n"
+ "╠ <6>       STATS                  ║\n"
+ "╠ <7>       TERMINAR               ║\n"
+ "║                                  ║\n"
+ "╚══════════════════════════════════╝\n"
);

		
	}
	
	public void InfoMahou(Personaje a) {
		
		int n;
		
		n = a.getVida();
		System.out.printf(
					 "╔══════════════════════════════════╗\n"
				   + "║            « SANADO »            ║\n"
				   + "║                                  ║\n"
				   + "║  Con esta accion te has sanado   ║\n"
				   + "║          +20 pts de vida         ║\n"
				   + "║   Pero te has quedado borracho   ║\n"
				   + "║         VIDA <%03d + 10>          ║\n"
				   + "║        ESTADO: Paralizado        ║\n"
				   + "╚══════════════════════════════════╝\n"
				,n);
		
		a.setStats(0, n+20);
		
	}
	
	public void InfoSanadora(Personaje a) {
		
		if(a.getEstado() != "Paralizado") {
			
			int n;
			
			n = a.getVida();
			System.out.printf(
						 "╔══════════════════════════════════╗\n"
					   + "║            « SANADO »            ║\n"
					   + "║                                  ║\n"
					   + "║  Con esta accion te has sanado   ║\n"
					   + "║          +10 pts de vida         ║\n"
					   + "║         VIDA <%03d + 10>          ║\n"
					   + "╚══════════════════════════════════╝\n"
					,n);
			
			a.setStats(0, n+10);
			
		}else {
			
			System.out.print(
					 "╔══════════════════════════════════╗\n"
				   + "║            « SANADO »            ║\n"
				   + "║                                  ║\n"
				   + "║  Con esta accion te has sanado   ║\n"
				   + "║      Ya no estas paralizado      ║\n"
				   + "╚══════════════════════════════════╝\n"
				);
			
		}
		
	}

	public void InfoParalizado() {
		
		System.out.print(
				 "╔══════════════════════════════════╗\n"
			   + "║          « PARALIZADO »          ║\n"
			   + "║                                  ║\n"
			   + "║     Te encuentras paralizado     ║\n"
			   + "║    Usa tu habilidad sanadora     ║\n"
			   + "║               <4>                ║\n"
			   + "║           Para volver            ║\n"
			   + "╚══════════════════════════════════╝\n"
			);
		
	}
	
	public void End() {
		
		System.out.print
		("╔══════════════════════════════════╗\n"
	   + "║           « THE END »            ║\n"
	   + "╚══════════════════════════════════╝\n");
		
		System.exit(0);
		
	}
	
	public void EnemigoEliminado() {
		System.out.print
		("╔══════════════════════════════════╗\n"
	   + "║          « A KNOCKOUT »          ║\n"
	   + "║                                  ║\n"
	   + "║       Eliminaste al enemigo      ║\n"
	   + "║            ¡Bien hecho!          ║\n"
	   + "║   Pasando a la siguiente ronda   ║\n"
	   + "╚══════════════════════════════════╝\n");
	}

	public void PersonajeEliminado() {
		
		System.out.print
		("╔══════════════════════════════════╗\n"
	   + "║          « YOU DIED! »           ║\n"
	   + "║                                  ║\n"
	   + "║   Te has quedado sin vida crack  ║\n"
	   + "╚══════════════════════════════════╝\n");
		
		End();
	}

	public int MonedaAzar() {
		
	    @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf(
				 "╔══════════════════════════════════╗\n"
			   + "║        « ¿Quien empieza? »       ║\n"
			   + "║                                  ║\n"
			   + "║    Se lanza una moneda al aire   ║\n"
			   + "║           ¿Que escoges?          ║\n"
			   + "║                                  ║\n"
			   + "║             <1> Cara             ║\n"
			   + "║             <2> Cruz             ║\n"
			   + "╚══════════════════════════════════╝\n"
			);
		
		int cha = scanner.nextInt();

		switch(cha) {
		
		case 1:
			System.out.printf(
					 "╔══════════════════════════════════╗\n"
				   + "║           Escoges Cara           ║\n"
				);
			break;
			
		case 2:
			System.out.printf(
					 "╔══════════════════════════════════╗\n"
				   + "║           Escoges Cruz           ║\n"
				);
			break;
		}

		int random = (int)(Math.random()*2 + 1);
		
		for(int i = 0; i<3; i++) {
			
			System.out.printf(
					 "╠══════════════════════════════════╣\n"
				   + "║               Cara               ║\n"		 
				);
			espera(300);
			System.out.printf(
					 "╠══════════════════════════════════╣\n"
				   + "║               Cruz               ║\n"		 
				);
			espera(300);

		}

		switch(random) {
		
		case 1:
			System.out.printf(
					 "╠══════════════════════════════════╣\n"
				   + "║             « Cara »             ║\n"	
				   + "╚══════════════════════════════════╝\n"

				);
			break;
			
		case 2:
			System.out.printf(
					 "╠══════════════════════════════════╣\n"
				   + "║               Cara               ║\n"		 
				);
			espera(300);
			System.out.printf(
					 "╠══════════════════════════════════╣\n"
				   + "║             « Cruz »             ║\n"	
				   + "╚══════════════════════════════════╝\n"
				);
			break;
		
		}
		
		espera(100);

		
		if(random == cha) {
			
			System.out.printf(
					 "╔══════════════════════════════════╗\n"
				   + "║           « Acertaste »          ║\n"	
				   + "║                                  ║\n"
				   + "║            Empiezas tu           ║\n"
				   + "╚══════════════════════════════════╝\n"
				);
			
			cha = 1;
			
		}else {
			
			System.out.printf(
					 "╔══════════════════════════════════╗\n"
				   + "║           « Fallaste »           ║\n"	
				   + "║                                  ║\n"
				   + "║        Empieza el enemigo        ║\n"
				   + "╚══════════════════════════════════╝\n"
				);
			
			cha = 0;
			
		}
		
		return cha;
		
	}

	public void espera(int n) {
		
		try {
			Thread.sleep(n);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void Nmundo(int n) {
		
		System.out.printf(
				 "╔══════════════════════════════════╗\n"
			   + "║          « Mundo N%02d »           ║\n"	
			   + "╚══════════════════════════════════╝\n",n
			);
		espera(1000);
		
	}
	
	public void Nronda(int n) {
		
		System.out.printf(
				 "╔══════════════════════════════════╗\n"
			   + "║          « Ronda N%02d »           ║\n"	
			   + "╚══════════════════════════════════╝\n",n
			);
		espera(1000);

	}
	
}
