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
	
	public int ataque(boolean prin) {
		
		int sat = 0;
		
		if(prin) {
			
			if((enemy.stats(false, 2, 0)<=(Math.random()*10)) && eneEsquiva) {
				
				System.out.printf(
						 "╔══════════════════════════════════╗\n"
					   + "║           « Esquivado »          ║\n"
					   + "║                                  ║\n"
					   + "║      El enemigo ha esquivado     ║\n"
					   + "║             tu ataque            ║\n"
					   + "╚══════════════════════════════════╝\n"
					);
				
			}else {
				
				enemy.recibir(personaje.atacar());
				sat = 1;
				
				System.out.printf(
						 "╔══════════════════════════════════╗\n"
					   + "║           « Acertado »           ║\n"
					   + "║                                  ║\n"
					   + "║       Has acertado tu ataque     ║\n"
					   + "║  le haces %02d de danio al enemigo ║\n"
					   + "╚══════════════════════════════════╝\n"
					,personaje.atacar());
				
			}
			
		}else {
			
			if((personaje.esquivar()<=(Math.random()*10)) && perEsquiva) {
				
				System.out.printf(
						 "╔══════════════════════════════════╗\n"
					   + "║           « Esquivado »          ║\n"
					   + "║                                  ║\n"
					   + "║        Has logrado esquivar      ║\n"
					   + "║          el ataque enemigo       ║\n"
					   + "╚══════════════════════════════════╝\n"
					);
				
			}else {
				
				personaje.recibir(enemy.stats(false, 1, 0));
				sat = 1;
				
				System.out.printf(
						 "╔══════════════════════════════════╗\n"
					   + "║           « Acertado »           ║\n"
					   + "║                                  ║\n"
					   + "║    No has logrado esquivarlo     ║\n"
					   + "║  el enemigo te hace %02d de danio  ║\n"
					   + "╠══════════════════════════════════╣\n"
					,enemy.stats(false, 1, 0));
				
			}
			
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
