package abstract_factory;

import enemys.FrankJungla;
import enemys.GuiriJungla;
import enemys.MDLRJungla;

public class EnemigosJungla implements EnemyFactory{

	@Override
	public MDLR creaMDLR(int vida, int ataque, int destreza) {
		return new MDLRJungla(vida,ataque,destreza);
	}

	@Override
	public Frank creaFrank(int vida, int ataque, int destreza) {
		return new FrankJungla(vida,ataque,destreza);
	}

	@Override
	public Guiri creaGuiri(int vida, int ataque, int destreza) {
		return new GuiriJungla(vida,ataque,destreza);
	}


}
