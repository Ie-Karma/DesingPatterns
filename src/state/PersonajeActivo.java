package state;
import decorator.*;

public class PersonajeActivo extends EstadoPersonaje {

	public PersonajeActivo(PersonajeBase personaje) {	
		super(personaje);	
	}
	
	public void setEstadoActivo() {
		
		personaje.setEstado("Estado Activo");
		
		if(personaje.getNombre() == "Orslok") {
			personaje.setStats(1, personaje.statsOrslok[1]);
			personaje.setStats(2, personaje.statsOrslok[2]);
		}
		
		if(personaje.getNombre() == "Dario") {
			personaje.setStats(1, personaje.statsDario[1]);
			personaje.setStats(2, personaje.statsDario[2]);
		}
		
		if(personaje.getNombre() == "Cheeto") {
			personaje.setStats(1, personaje.statsCheeto[1]);
			personaje.setStats(2, personaje.statsCheeto[2]);
		}
	}
	
	public void setEstadoHerido() {
		
	}
	
	public void setEstadoParalizado() {
		
	}
	
	public EstadoPersonaje estadoActivo() {
		return this;
	}
	
	public EstadoPersonaje estadoHerido() {
		return new PersonajeHerido(personaje);
	}
	
	public EstadoPersonaje estadoParalizado() {
		return new PersonajeParalizado(personaje);
	}
}
