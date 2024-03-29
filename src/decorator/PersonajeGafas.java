package decorator;

public class PersonajeGafas extends Decorator{

	//tipo de clase que extiende del decorador para cambiar las distintas funciones y/o atributos del personaje
	//en este caso el personaje gana 2 puntos de destreza
	//esto se define en la funcion esquivar()+2
	
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
		getPersonaje().setEstado(estado);
	}

	@Override
	public int atacar() {
		return getPersonaje().atacar();
	}

	@Override
	public int recibir(int n) {
		return getPersonaje().recibir(n);
	}

	@Override
	public int esquivar() {
		return getPersonaje().esquivar()+2;
	}
	
	@Override
	public String getMundo() {
		return getPersonaje().getMundo();
	}
	
}
