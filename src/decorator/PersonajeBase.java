package decorator;
import state.*;

public class PersonajeBase implements Personaje{
	
	private int num;
	
	// Stats inciales {vida, ataque, destreza}
	public int statsOrslok[] = {150,15,20};
	public int statsDario[] = {200,10,15};
	public int statsCheeto[] = {250,20,10};
	
	// Atributos del Personaje
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
			break;
		case 1:
			vida = statsDario[0];
			nombre = "Dario";
			break;
		case 2:
			vida = statsCheeto[0];
			nombre = "Cheeto";
			break;			
		}
		
		estadoPersonaje = new PersonajeActivo(this);
		
		/* CAMBIO: El estado activo del personaje establece sus stats ataque y destreza por defecto
		 * 
		switch (per){
			case 0:
				vida = statsOrslok[0];
				ataque = statsOrslok[1];
				destreza = statsOrslok[2];
				nombre = "Orslok";
				break;
			case 1:
				vida = statsDario[0];
				ataque = statsDario[1];
				destreza = statsDario[2];
				nombre = "Dario";
				break;
			case 2:
				vida = statsCheeto[0];
				ataque = statsCheeto[1];
				destreza = statsCheeto[2];
				nombre = "Cheeto";
				break;			
		}
		*/	
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
			case 2:  destreza = val;
			break;
		}		
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	@Override
	public int atacar() {
		return ataque;
	}

	@Override
	public int recibir(int n) {
		vida -= n;
		return vida;
	}

	@Override
	public int esquivar() {
		return destreza;
	}
}
