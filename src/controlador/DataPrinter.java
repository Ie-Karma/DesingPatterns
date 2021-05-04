package controlador;

import decorator.*;

public class DataPrinter {

	int num;	
	boolean obj = false;
	
	public DataPrinter(int n) {
		
		num = n;
		
	}
	
	public void Accion() {

		if(obj == false) {
			
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
	   + "╠ <5>       COGER GAFAS            ║\n"
			   );
	break;
case 2:
	System.out.print
	
	   ( "╠ <4>       COCINAR ALGO           ║\n"
	   + "╠ <5>       COGER MARTILLO         ║\n"
			   );
	break;

}
System.out.println

   ( "╠ <6>       STATS                  ║\n"
   + "╠ <7>       TERMINAR               ║\n"
   + "║                                  ║\n"
   + "╚══════════════════════════════════╝\n"
   );
			
		}else {
			
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
	   + "╠ <5>      ~ROBAR ALGO~            ║\n"
			   );
	break;
case 1:
	System.out.print
	
	   ( "╠ <4>       HABLAR PORTUGUES       ║\n"
	   + "╠ <5>      ~COGER GAFAS~           ║\n"
			   );
	break;
case 2:
	System.out.print
	
	   ( "╠ <4>       COCINAR ALGO           ║\n"
	   + "╠ <5>      ~COGER MARTILLO~        ║\n"
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

	public void setObj(boolean a) {
		obj = a;
	}
	public boolean getObj() {
		return obj;
	}
	
}
