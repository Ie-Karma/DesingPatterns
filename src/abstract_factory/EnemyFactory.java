package abstract_factory;

public interface EnemyFactory {

	MDLR creaMDLR(int vida, int ataque, int destreza);
	Frank creaFrank(int vida, int ataque, int destreza);
	Guiri creaGuiri(int vida, int ataque, int destreza);

}
