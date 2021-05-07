package decorator;

public abstract class Decorator implements Personaje{

	//definimos un Personaje
	private Personaje personaje;
	
	public Decorator(Personaje a) {
		
		//igualamos el personaje pasado por parametro
		this.personaje = a;		
		
	}
	
	protected Personaje getPersonaje() {

		return personaje;
	}
}

