package template_method;

public class AccionAtacar extends TemplateAcciones{

	@Override
	public void esquivar() {}

	@Override
	public void atacar() {
		System.out.printf(
				 "╔══════════════════════════════════╗\n"
			   + "║           « Te ataca »           ║\n"
			   + "║                                  ║\n"
			   + "║    El enemigo prepara su ataque  ║\n"
			   + "╚══════════════════════════════════╝\n"
			);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public int info() {
		return 1;
	}

}
