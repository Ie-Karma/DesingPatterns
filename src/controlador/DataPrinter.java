package controlador;

import java.util.Scanner;

import decorator.*;

public class DataPrinter {

	int num;	
	boolean coraza = false;
	boolean gafas = false;
	boolean martillo = false;
	
	public DataPrinter(int n) {
		
		num = n;
		
	}
	
	public DataPrinter() {
				
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
	
}
