package template_method;

public abstract class TemplateAcciones {
	
	public final void Actuar() {
		
		InicioTurno();
		espera(1000);
		Esquivar();
		Atacar();
		
	}

	public abstract void Esquivar();
	public abstract void Atacar();
	public abstract int Info();
	
	private final void espera(int n) {
		try {
			Thread.sleep(n);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private final void InicioTurno() {
		
		System.out.printf(
				 "╔══════════════════════════════════╗\n"
			   + "║         « Turno enemigo »        ║\n"
			   + "║                                  ║\n"
			   + "║          \"Me toca a mi\"          ║\n"
			   + "╚══════════════════════════════════╝\n"
			);		
	}
	
}

