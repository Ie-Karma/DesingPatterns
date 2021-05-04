package decorator;

public interface Personaje {
	
	public String getNombre();
	public void stats();
	public String getAccion(int a);
	public void accion();
	public int getStats(int n);
	public void setStats(int n,int a);
	public int atacar();
	public int recibir(int n);
	
}
