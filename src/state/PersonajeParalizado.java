package state;
import controlador.DataPrinter;
import decorator.*;

public class PersonajeParalizado extends EstadoPersonaje{
	
	public PersonajeParalizado(PersonajeBase personaje) {
		super(personaje);
		DataPrinter data = new DataPrinter();
		data.infoParalizado();
	}
	
	public void setEstadoActivo() {
		
	}
	
	public void setEstadoHerido() {
		
	}
	
	public void setEstadoParalizado() {
		
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
