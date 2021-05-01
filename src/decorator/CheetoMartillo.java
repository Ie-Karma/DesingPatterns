package decorator;

public class CheetoMartillo extends Decorator{

	public CheetoMartillo(Personaje a) {
		
		super(a);
		a.setStats(1,a.getStats(1)+2);
		
	}

	@Override
	public String getNombre() {
		return null;
	}

	@Override
	public void stats() {
		
	}

	@Override
	public String getAccion(int a) {
		return null;
	}

	@Override
	public void accion() {
		
	}

	@Override
	public int getStats(int n) {
		return 0;
	}

	@Override
	public void setStats(int n,int a) {
		// TODO Auto-generated method stub
		
	}

}
