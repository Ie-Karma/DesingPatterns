package decorator;
import state.*;

public class PersonajeBase implements Personaje{
		
	// Stats inciales {vida, ataque, destreza}
	public int statsOrslok[] = {150,15,7};
	public int statsDario[] = {200,10,5};
	public int statsCheeto[] = {250,20,3};
	
	
	// Atributos del Personaje
	int num;
	private String mundo;
	private String nombre;
	private String estado;
	private int vida;
	private int ataque;
	private int destreza;
	
	protected EstadoPersonaje estadoPersonaje;
	
	public PersonajeBase(int per) {
				
		num = per;
		
		switch (per){
		case 0:
			vida = statsOrslok[0];
			nombre = "Orslok";
			mundo = "Calle";
			break;
		case 1:
			vida = statsDario[0];
			nombre = "Dario";
			mundo = "Jungla";
			break;
		case 2:
			vida = statsCheeto[0];
			nombre = "Cheeto";
			mundo = "Playa";
			break;			
		}
		
		estadoPersonaje = new PersonajeActivo(this);
		setEstado("Activo");
		
	}
	
	public String getNombre() {
		return nombre;	
	}
	
	public String getEstado() {
		return estado;
	}
	
	public int getVida() {
		return vida;		
	}
	
	public int getAtaque() {
		return ataque;		
	}
	
	public int getDestreza() {
		return destreza;		
	}
	
	@Override
	public void setStats(int n,int val) {

		switch (n){
			case 0:  vida = val;
			break;
			case 1:  ataque = val;
			break;
			case 2:
				destreza = val;
				if(destreza >= 10) {
					destreza = 10;
				}
				if(destreza < 0) {
					destreza = 0;
				}
			break;
		}		
		
	}
	
	public void setEstado(String estado) {
		
		switch(estado) {
		
		case ("Activo"):
			estadoPersonaje = estadoPersonaje.estadoActivo();
			estadoPersonaje.setEstadoActivo();
			break;
		case ("Herido"):
			estadoPersonaje = estadoPersonaje.estadoHerido();
			estadoPersonaje.setEstadoHerido();
			break;
		case ("Paralizado"):
			estadoPersonaje = estadoPersonaje.estadoParalizado();
			estadoPersonaje.setEstadoParalizado();
			break;
		
		}
		
		this.estado = estado;
		
	}
	
	@Override
	public int atacar() {
		return ataque;
	}

	@Override
	public int recibir(int n) {
		vida -= n;
		
		switch (num) {
		
		case 0:
			statsOrslok[0] = vida;
			break;
		case 1:
			statsDario[0] = vida;
			break;
		case 2:
			statsCheeto[0] = vida;
			break;
		}
		
		return vida;
	}

	@Override
	public int esquivar() {
		return destreza;
	}

	public String getMundo() {
		return mundo;
	}
}
