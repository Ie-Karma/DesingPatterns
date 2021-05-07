package abstract_factory;

public class GameController {
	
	EnemyFactory enemy;
	private MDLR mdlr;
	private Frank frank;
	private Guiri guiri;
	private int num;
	
	public GameController(int n,EnemyFactory e) {
		
		num = n;
		enemy = e;
				
		switch(num) {
		
		case 0:
			mdlr = e.creaMDLR(70, 10, 5);
			break;
		case 1:
			frank = e.creaFrank(100, 8, 6);
			break;
		case 2:
			guiri = e.creaGuiri(60, 6, 3);
			break;
		}
			
	}
	
	public void Info() {
		
		switch(num) {

		case 0:
			mdlr.Info();
			break;
		case 1:
			frank.Info();
			break;
		case 2:
			guiri.Info();
			break;
		}
		
	}
	
	public int Stats(boolean cha, int p, int v) {
		
		int ret = 0;
		
		switch(num) {

		case 0:
			ret = mdlr.Stats(cha, p, v);
			break;
		case 1:
			ret = frank.Stats(cha, p, v);
			break;
		case 2:
			ret = guiri.Stats(cha, p, v);
			break;
		}

		return ret;
	}
	
}
