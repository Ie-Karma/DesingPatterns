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
				
		//definimos un tipo de personaje con sus propias Stats 
		//en funcion del elegido por el usuario
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
		
		//Definimos tambien sus estado activo para empezar la partida
		estadoPersonaje = new PersonajeActivo(this);
		setEstado("Activo");
		
	}
	
	public void setPara() {
		
		ataque = 0;
		destreza = 0;
		
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
	
	public void setStats(int n,int val) {

		//usamos este metodo para cambiar los valores de los parametros principales del personaje
		//en el primer int n definimos el parametro a cambiar 
		//y en el segundo int val definimos el nuevo valor
		switch (n){
			case 0:  vida = val;
					statsOrslok[0] = vida;
					statsDario[0] = vida;
					statsCheeto[0] = vida;

			break;
			case 1: ataque = val;
					statsOrslok[1] = ataque;
					statsDario[1] = ataque;
					statsCheeto[1] = ataque;
			break;
			case 2:
				destreza = val;
				if(destreza >= 10) {
					destreza = 10;
				}
				if(destreza < 0) {
					destreza = 0;
				}
				statsOrslok[2] = destreza;
				statsDario[2] = destreza;
				statsCheeto[2] = destreza;
			break;
		}		
		
	}
	
	public void setEstado(String estado) {
		
		//igualamos el estado del personaje al nuevo estado enviado desde el Main
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
		
		//Usamos este metodo para restarle una cantidad de vida al personaje
		//Restamos esa cantidad directamente en el array de stats 
		//para que cuando cambie de estados no vuelva a resetearse
		vida -= n;
		
		statsOrslok[0] = vida;
		statsDario[0] = vida;
		statsCheeto[0] = vida;
		
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
