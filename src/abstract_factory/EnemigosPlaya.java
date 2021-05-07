package abstract_factory;

import enemys.FrankPlaya;
import enemys.GuiriPlaya;
import enemys.MDLRPlaya;

public class EnemigosPlaya implements EnemyFactory{

	@Override
	public MDLR creaMDLR(int vida, int ataque, int destreza) {
		return new MDLRPlaya(vida,ataque,destreza);
	}

	@Override
	public Frank creaFrank(int vida, int ataque, int destreza) {
		return new FrankPlaya(vida,ataque,destreza);
	}

	@Override
	public Guiri creaGuiri(int vida, int ataque, int destreza) {
		return new GuiriPlaya(vida,ataque,destreza);
	}


}
