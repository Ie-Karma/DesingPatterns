package decorator;

public class CheetoMartillo extends Decorator{

	public CheetoMartillo(Personaje a) {
		
		super(a);
	}

	@Override
	public String getNombre() {
		return GetPersonaje().getNombre();
	}

	@Override
	public void stats() {
		
		System.out.print(
					 "╔══════════════════════════════════╗\n"
				   + "║            « STATS »             ║\n"
				   + "║                                  ║\n"
				   + "╠ VIDA <"+getStats(0)+">                        ║\n"
				   + "║ "
				);
		
		for(int i = 0; i<32;i++) {
			
			if(i<getStats(0)) {System.out.print("*");}
			else {System.out.print(" ");}
			
		}
		
		System.out.print(
						 " ║\n"
						+ "╠ ATAQUE <"+atacar()+">             MARTILLO  ║\n"
						+ "╠ DESTREZA <"+getStats(2)+">                     ║\n"
						+ "╠ ESTADO <NINGUNO>                 ║\n"
						+ "║                                  ║\n"
						+ "╚══════════════════════════════════╝\n"
				);
	}

	@Override
	public String getAccion(int a) {
		return GetPersonaje().getAccion(a);
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
		

			System.out.print
			
			   ( "╠ <4>       COCINAR ALGO           ║\n"
			   + "╠ <5>      ~COGER MARTILLO~        ║\n"
					   );
		
		System.out.println
	
		   ( "╠ <6>       STATS                  ║\n"
		   + "╠ <7>       TERMINAR               ║\n"
		   + "║                                  ║\n"
		   + "╚══════════════════════════════════╝\n"
		   );	}

	@Override
	public int getStats(int n) {
		return GetPersonaje().getStats(n);
	}

	@Override
	public void setStats(int n, int a) {
		GetPersonaje().setStats(n,a);		
	}

	@Override
	public int atacar() {
		return GetPersonaje().atacar() + 3;
	}

	@Override
	public int recibir(int n) {
		return GetPersonaje().recibir(n);
	}


}
