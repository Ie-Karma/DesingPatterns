package singleton;

import abstract_factory.EnemyController;
import decorator.Personaje;

public final class Singleton {
	
	private static Singleton instancia;
	
	private Personaje personaje;
	private EnemyController enemy;
	private boolean perEsquiva = false;
	private boolean eneEsquiva = false;
	
	private Singleton() {
		
	}
	
	public static Singleton getCalculadora() {
		
		if(instancia == null) {
			
			instancia = new Singleton();
			
		}
		return instancia;
	}

	public Personaje getPersonaje() {
		return personaje;
	}

	public void setPersonaje(Personaje personaje) {
		this.personaje = personaje;
	}

	public EnemyController getEnemy() {
		return enemy;
	}

	public void setEnemy(EnemyController enemy) {
		this.enemy = enemy;
	}
	
	private void enemigoEsquiva() {
		
		System.out.printf(
				 "╔══════════════════════════════════╗\n"
			   + "║           « Esquivado »          ║\n"
			   + "║                                  ║\n"
			   + "║      El enemigo ha esquivado     ║\n"
			   + "║             tu ataque            ║\n"
			   + "╚══════════════════════════════════╝\n"
			);
		
	}
	
	private void enemigoAcierta() {
		
		enemy.recibir(personaje.atacar());
		
		System.out.printf(
				 "╔══════════════════════════════════╗\n"
			   + "║           « Acertado »           ║\n"
			   + "║                                  ║\n"
			   + "║       Has acertado tu ataque     ║\n"
			   + "║  le haces %02d de danio al enemigo ║\n"
			   + "╚══════════════════════════════════╝\n"
			,personaje.atacar());
	}
	
	private void personajeEsquiva(){
		System.out.printf(
				 "╔══════════════════════════════════╗\n"
			   + "║           « Esquivado »          ║\n"
			   + "║                                  ║\n"
			   + "║        Has logrado esquivar      ║\n"
			   + "║          el ataque enemigo       ║\n"
			   + "╚══════════════════════════════════╝\n"
			);
	}
	
	private void personajeAcierta() {
		personaje.recibir(enemy.stats(false, 1, 0));
		
		System.out.printf(
				 "╔══════════════════════════════════╗\n"
			   + "║           « Acertado »           ║\n"
			   + "║                                  ║\n"
			   + "║    No has logrado esquivarlo     ║\n"
			   + "║  el enemigo te hace %02d de danio  ║\n"
			   + "╠══════════════════════════════════╣\n"
			,enemy.stats(false, 1, 0));
	}
	
	private int ataqueEnemigo() {
		
		int sat = 0;
		
		if((enemy.stats(false, 2, 0)<=(Math.random()*10)) && eneEsquiva) {
			
			enemigoEsquiva();
			
		}else {
			
			sat = 1;
			enemigoAcierta();
			
		}
		
		return sat;
		
	}
	
	private int ataquePersonaje() {
		
		int sat = 0;
		
		if((personaje.esquivar()<=(Math.random()*10)) && perEsquiva) {
			
			personajeEsquiva();
			
		}else {
			
			sat = 1;
			personajeAcierta();
			
		}
		
		return sat;
		
	}
	
	public int ataque(boolean prin) {
		
		int sat = 0;
		
		if(prin) {
			
			sat = ataqueEnemigo();
			
		}else {
			
			sat = ataquePersonaje();
			
		}
		
		return sat;
		
	}
	
	public void setPerEsquiva(boolean a) {
		perEsquiva = a;
	}
	
	public void setEneEsquiva(boolean a) {
		eneEsquiva = a;
	}

}
