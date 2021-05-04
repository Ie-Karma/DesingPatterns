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
	public void setEstado(String estado) {
	}

	@Override
	public void setStats(int n, int a) {
		getPersonaje().setStats(n,a);		
	}

	@Override
	public int atacar() {
		return getPersonaje().atacar();
	}

	@Override
	public int recibir(int n) {
		return getPersonaje().recibir(n-2);
	}

	@Override
	public int esquivar() {
		return getPersonaje().esquivar();
	}
	
}
