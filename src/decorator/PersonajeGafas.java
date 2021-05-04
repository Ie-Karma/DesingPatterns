package decorator;

public class PersonajeGafas extends Decorator{

	public PersonajeGafas(Personaje a) {
		
		super(a);
		System.out.print
		("╔══════════════════════════════════╗\n"
	   + "║      AHORA TIENES UNAS GAFAS     ║\n"
	   + "║                                  ║\n"
	   + "║          VES MUCHO MEJOR         ║\n"
	   + "║  AUMENTA TU DESTREZA EN 2 PUNTOS ║\n"
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
		return GetPersonaje().atacar();
	}

	@Override
	public int recibir(int n) {
		return GetPersonaje().recibir(n);
	}

	@Override
	public int esquivar() {
		return GetPersonaje().esquivar()+2;
	}


}
