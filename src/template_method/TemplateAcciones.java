package template_method;

public abstract class TemplateAcciones {
	
	public final void Actuar() {
		
		inicioTurno();
		espera(1000);
		esquivar();
		atacar();
		
	}

	public abstract void esquivar();
	public abstract void atacar();
	public abstract int info();
	
	private final void espera(int n) {
		try {
			Thread.sleep(n);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private final void inicioTurno() {
		
		System.out.printf(
				 "╔══════════════════════════════════╗\n"
			   + "║         « Turno enemigo »        ║\n"
			   + "║                                  ║\n"
			   + "║          \"Me toca a mi\"          ║\n"
			   + "╚══════════════════════════════════╝\n"
			);		
	}
	
}

