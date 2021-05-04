package decorator;

public interface Personaje {
	
	public String getNombre();
	public String getAccion(int a);
	public void setStats(int n,int a);
	public int atacar();
	public int recibir(int n);
	public int esquivar();
	
}
