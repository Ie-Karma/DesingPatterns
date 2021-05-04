package state;
import decorator.PersonajeBase;

public abstract class EstadoPersonaje {
	
	protected PersonajeBase personaje;
	
	public EstadoPersonaje(PersonajeBase personaje) {
		this.personaje = personaje;
	}
	
	public abstract void setEstadoActivo();
	public abstract void setEstadoHerido();
	public abstract void setEstadoParalizado();
	
	public abstract EstadoPersonaje estadoActivo();
	public abstract EstadoPersonaje estadoHerido();
	public abstract EstadoPersonaje estadoParalizado();
}
