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
		return getPersonaje().getNombre();
	}
	
	@Override
	public String getEstado() {
		return getPersonaje().getEstado();
	}

	@Override
	public int getVida() {
		return getPersonaje().getVida();
	}

	@Override
	public int getAtaque() {
		return getPersonaje().getAtaque();
	}

	@Override
	public int getDestreza() {
		return getPersonaje().getDestreza();
	}

	@Override
	public void setStats(int n, int a) {
		getPersonaje().setStats(n,a);		
	}
	
	public void setEstado(String estado) {
	}

	@Override
	public int atacar() {
		return getPersonaje().atacar() + 2;
	}

	@Override
	public int recibir(int n) {
		return getPersonaje().recibir(n);
	}

	@Override
	public int esquivar() {
		return getPersonaje().esquivar();
	}


}
