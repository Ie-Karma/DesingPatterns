package state;

import decorator.*;

public abstract class EstadoPersonaje {
	
	protected Personaje personaje;
	
	public EstadoPersonaje(Personaje personaje) {
		this.personaje = personaje;
	}
	
	// TODO : Repercusion de los estados
	
}
