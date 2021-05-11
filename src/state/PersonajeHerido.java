package state;
import decorator.*;

public class PersonajeHerido extends EstadoPersonaje {
	
	public PersonajeHerido(PersonajeBase personaje) {
		super(personaje);
	}
	
	public void setEstadoActivo() {
	
	}
	
	public void setEstadoHerido() {
		
		personaje.recibir(5);
		
		System.out.print
		("╔══════════════════════════════════╗\n"
	   + "║            « Veneno »            ║\n"
	   + "║                                  ║\n"
	   + "║    El veneno te hizo 5 puntos    ║\n"
	   + "║             de danio             ║\n"
	   + "╚══════════════════════════════════╝\n");
		
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
