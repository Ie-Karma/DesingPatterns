package decorator;

public class PersonajeBase implements Personaje{

	String nombre;
	int vida = 20;
	int ataque = 1;
	
	public PersonajeBase(String n, int v, int a) {
		
		vida = v;
		ataque = a;
		nombre = n;
		
	}
	
	@Override
	public void info() {
		
		System.out.println(nombre);
		
	}

	@Override
	public void stats() {
		
		System.out.println("Vida: " + vida+ "\n" + "Ataque: " + ataque);
		
	}

}
