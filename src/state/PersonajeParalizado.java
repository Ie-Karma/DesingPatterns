package state;
import decorator.*;

public class PersonajeParalizado extends EstadoPersonaje{
	
	public PersonajeParalizado(PersonajeBase personaje) {
		super(personaje);
	}
	
	public void setEstadoActivo() {
		
	}
	
	public void setEstadoHerido() {
		
	}
	
	public void setEstadoParalizado() {
		
		personaje.setEstado("Estado Paralizado");
		personaje.setStats(1, 0); 
		personaje.setStats(2, 0);	
	}
	
	public EstadoPersonaje estadoActivo() {
		return new PersonajeActivo(personaje);
	}
	
	public EstadoPersonaje estadoHerido() {
		return new PersonajeHerido(personaje);
	}
	
	public EstadoPersonaje estadoParalizado() {
		return this;
	}
}
