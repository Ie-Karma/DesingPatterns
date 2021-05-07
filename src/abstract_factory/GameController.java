package abstract_factory;

public class GameController {
	
	//creamos los distintos tipos de enemigos de forma general
	EnemyFactory enemy;
	private MDLR mdlr;
	private Frank frank;
	private Guiri guiri;
	private int num;
	
	public GameController(int n,EnemyFactory e) {
		
		//recibimos un EnemyFactory en el que se especifica la localizacion
		//dada esa Factoria podemos crear el enemigo solicitado mediante int n
		
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
		
		//extension del metodo Info() de los enemigos
		
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
		
		//extension del metodo Stats() de los enemigos
		
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
