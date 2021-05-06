package decorator;

public interface Personaje {
	
	public String getNombre();
	public String getEstado();
	public int getVida();
	public int getAtaque();
	public int getDestreza();
	
	public void setStats(int n,int a);
	public void setEstado(String estado);
	
	// DUDA: ¿Modificarlo/Eliminarlo?
	public int atacar();
	public int recibir(int n);
	public int esquivar();
	
}
