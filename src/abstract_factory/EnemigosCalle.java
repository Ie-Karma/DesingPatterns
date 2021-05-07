package abstract_factory;

import enemys.FrankCalle;
import enemys.GuiriCalle;
import enemys.MDLRCalle;

public class EnemigosCalle implements EnemyFactory{

	//inicializamos los distintos enemigos con su variacion dependiendo del mundo
	
	@Override
	public MDLR creaMDLR(int vida, int ataque, int destreza) {
		return new MDLRCalle(vida,ataque,destreza);
	}

	@Override
	public Frank creaFrank(int vida, int ataque, int destreza) {
		return new FrankCalle(vida,ataque,destreza);
	}

	@Override
	public Guiri creaGuiri(int vida, int ataque, int destreza) {
		return new GuiriCalle(vida,ataque,destreza);
	}

}
