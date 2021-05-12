package abstract_factory;

public interface Guiri {

	//Print simple para denotar la entrada del Enemigo al juego
	//Muestra su Stats: vida, ataque y destreza, a parte de una linea del personaje
	//y te informa de sus ventajas o desventajas frente al terreno en el que luchais
	void info();
	
	//Metodo multi-funcional
	//Usamos este metodo en todos los enemigos con diversas funciones
	//Dicho metodo sirve tanto como Get como Set
	//en el primer parametro (bool cha) definimos true = set, false = get
	//en el segundo parametro (int pos) definimos si queremos cambiar/ver la vida, ataque o destreza (0,1,2 respectivamente)
	//el ultimo parameto sera el valor por el que cambiemos el parametro anterior
	int stats(boolean cha, int pos, int val);
	
}
