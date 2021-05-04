package decorator;

public class PersonajeCoraza extends Decorator{

	public PersonajeCoraza(Personaje a) {
		
		super(a);
		System.out.print
		("╔══════════════════════════════════╗\n"
	   + "║      AHORA TIENES UNA CORAZA     ║\n"
	   + "║                                  ║\n"
	   + "║       LA PERDIA DE VIDA SE       ║\n"
	   + "║   REBAJA EN 2 PUNTOS POR ATAQUE  ║\n"
	   + "╚══════════════════════════════════╝\n"
				);
		
	}

	@Override
	public String getNombre() {
		return GetPersonaje().getNombre();
	}

	@Override
	public void setStats(int n, int a) {
		GetPersonaje().setStats(n,a);		
	}

	@Override
	public int atacar() {
		return GetPersonaje().atacar();
	}

	@Override
	public int recibir(int n) {
		return GetPersonaje().recibir(n-2);
	}

	@Override
	public int esquivar() {
		return GetPersonaje().esquivar();
	}


}
