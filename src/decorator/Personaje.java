package decorator;

public interface Personaje {
	
	//Usamos esta interfaz para definir todas las funciones
	//que tendran los distintos personajes al implementarla
	public String getNombre();
	public String getEstado();
	public String getMundo();
	public int getVida();
	public int getAtaque();
	public int getDestreza();
	
	public void setStats(int n,int a);
	public void setEstado(String estado);
	
	public int atacar();
	public int recibir(int n);
	public int esquivar();
	
}
