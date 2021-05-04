package state;
import decorator.*;

public class PersonajeHerido extends EstadoPersonaje {
	
	public PersonajeHerido(PersonajeBase personaje) {
		super(personaje);
	}
	
	public void setEstadoActivo() {
	
	}
	
	public void setEstadoHerido() {
		
		int tmp;
		
		personaje.setEstado("Estado Herido");

		tmp = personaje.getAtaque()-5;
		personaje.setStats(1, tmp);
		
		tmp = personaje.getDestreza()-5; 
		personaje.setStats(2, tmp);	
	}
	
	public void setEstadoParalizado() {
		
	}
	
	public EstadoPersonaje estadoActivo() {
		return new PersonajeActivo(personaje);
	}
	
	public EstadoPersonaje estadoHerido() {
		return this;
	}
	
	public EstadoPersonaje estadoParalizado() {
		return new PersonajeParalizado(personaje);
	}
}
