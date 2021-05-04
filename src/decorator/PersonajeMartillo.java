package decorator;

public class PersonajeMartillo extends Decorator{

	public PersonajeMartillo(Personaje a) {
		
		super(a);
		
		System.out.print
		("╔══════════════════════════════════╗\n"
	   + "║     AHORA TIENES UN MARTILLO     ║\n"
	   + "║                                  ║\n"
	   + "║       TUS ATAQUES AUMENTAN       ║\n"
	   + "║   	 2 PUNTOS POR ATAQUE       ║\n"
	   + "╚══════════════════════════════════╝\n"
				);
		
	}

	@Override
	public String getNombre() {
		return GetPersonaje().getNombre();
	}

	@Override
	public String getAccion(int a) {
		return GetPersonaje().getAccion(a);
	}

	@Override
	public void setStats(int n, int a) {
		GetPersonaje().setStats(n,a);		
	}

	@Override
	public int atacar() {
		return GetPersonaje().atacar() + 2;
	}

	@Override
	public int recibir(int n) {
		return GetPersonaje().recibir(n);
	}

	@Override
	public int esquivar() {
		return GetPersonaje().esquivar();
	}


}
