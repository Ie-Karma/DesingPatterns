package decorator;

public class PersonajeBase implements Personaje{

	int num;
	int vida;
	int ataque;
	int destreza;
	String nombre;
	String acciones[] = new String[7];
	
	public PersonajeBase(int per) {
		
		num = per;
		
		acciones[0] = "Atacar";
		acciones[1] = "Esquivar";
		acciones[2] = "Beber Mahou";
		acciones[5] = "Stats";
		acciones[6] = "Terminar";

		switch (per){
		
			case 0:
				vida = 10;
				ataque = 5;
				destreza = 6;
				nombre = "Orslok";
				acciones[3] = "Vapear";
				acciones[4] = "Robar algo";
				break;
				
			case 1:
				vida = 15;
				ataque = 2;
				destreza = 4;
				nombre = "Dario";
				acciones[3] = "Hablar Portugues";
				acciones[4] = "Coger Gafas";
				break;
				
			case 2:
				vida = 20;
				ataque = 4;
				destreza = 3;
				nombre = "Cheeto";
				acciones[3] = "Cocinar algo";
				acciones[4] = "Coger martillo";
				break;
				
		}
		
	}
	
	public String getNombre() {
		
		return nombre;
		
	}
	
	@Override
	public String getAccion(int a) {
		return acciones[a];
	}

	@Override
	public void setStats(int n,int a) {

		switch (n){
		
			case 0:  vida = a;
			break;
			case 1:  ataque = a;
			break;
			case 2:  destreza = a;
			break;
	
		}
		
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

/*

0-Orslok V-20 A-5 D-10
1-Dario	V-30 A-2 D-6
2-Cheeto V-35 A-4 D-4

*/