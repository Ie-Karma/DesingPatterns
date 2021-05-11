package template_method;

public class AccionAtacar extends TemplateAcciones{

	@Override
	public void Esquivar() {}

	@Override
	public void Atacar() {
		System.out.printf(
				 "╔══════════════════════════════════╗\n"
			   + "║           « Te ataca »           ║\n"
			   + "║                                  ║\n"
			   + "║    El enemigo prepara su ataque  ║\n"
			   + "╚══════════════════════════════════╝\n"
			);
	}

	@Override
	public int Info() {
		return 1;
	}

}
