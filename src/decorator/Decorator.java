package decorator;

public abstract class Decorator implements Personaje{

	private Personaje personaje;
	
	public Decorator(Personaje a) {
		
		this.personaje = a;		
	}
	
	protected Personaje getPersonaje() {

		return personaje;
	}
}

