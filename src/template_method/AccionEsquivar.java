package template_method;

public class AccionEsquivar extends TemplateAcciones{

	@Override
	public void esquivar() {
		System.out.printf(
				 "╔══════════════════════════════════╗\n"
			   + "║     « El enemigo se prepara »    ║\n"
			   + "║                                  ║\n"
			   + "║    El enemigo se prepara para    ║\n"
			   + "║   esquivar tu siguiente ataque   ║\n"
			   + "╚══════════════════════════════════╝\n"
			);
		}

	@Override
	public void atacar() {
	}

	@Override
	public int info() {
		return 0;
	}

}
