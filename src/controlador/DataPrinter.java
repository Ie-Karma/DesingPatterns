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
	
	   ( "╠ <4>       HABLAR PORTUGUES       ║\n"
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
		
		System.out.print(
					 "╔══════════════════════════════════╗\n"
				   + "║            « STATS »             ║\n"
				   + "║                                  ║\n"
				   + "╠ VIDA <"+a.recibir(0)+">                        ║\n"
				   + "║ "
				);
		
		for(int i = 0; i<32;i++) {
			
			if(i<a.recibir(0)) {System.out.print("*");}
			else {System.out.print(" ");}
			
		}
		
		System.out.print(
						 " ║\n"
						+ "╠ ATAQUE <"+a.atacar()+">                       ║\n"
						+ "╠ DESTREZA <"+a.esquivar()+">                     ║\n"
						+ "╠ ESTADO <NINGUNO>                 ║\n"
						+ "║                                  ║\n"
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
		("║                                  ║\n"
	   + "╚══════════════════════════════════╝\n");
		
		sel = scanner.nextInt();
 
		sel -= 1;
		
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
	
}
