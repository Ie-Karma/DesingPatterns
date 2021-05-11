package strategy;

public class ContextStrategy {
	private Strategy estrategia;
	
	public ContextStrategy(Strategy estrategia){
		this.estrategia = estrategia;
	}
	
	public String estrategia() {
		return estrategia.tipo();
	}
}
