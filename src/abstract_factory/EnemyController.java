package abstract_factory;

import strategy.*;
import template_method.*;

public class EnemyController {
	
	//creamos los distintos tipos de enemigos de forma general
	private TemplateAcciones accion;
	private MDLR mdlr;
	private Frank frank;
	private Guiri guiri;
	private int num;
	private ContextStrategy estrategia;
	
	public EnemyController(int n,EnemyFactory e) {
		
		//recibimos un EnemyFactory en el que se especifica la localizacion
		//dada esa Factoria podemos crear el enemigo solicitado mediante int n
		
		num = n;
				
		switch(num) {
		
		case 0:
			mdlr = e.creaMDLR(70, 10, 5);
			break;
		case 1:
			frank = e.creaFrank(100, 8, 6);
			break;
		case 2:
			guiri = e.creaGuiri(60, 6, 3);
			break;
		}
			
	}
	
	public void info() {
		
		//extension del metodo Info() de los enemigos
		
		switch(num) {

		case 0:
			mdlr.info();
			break;
		case 1:
			frank.info();
			break;
		case 2:
			guiri.info();
			break;
		}
		
	}
	
	public int stats(boolean cha, int p, int v) {
		
		//extension del metodo Stats() de los enemigos
		
		int ret = 0;
		
		switch(num) {

		case 0:
			ret = mdlr.stats(cha, p, v);
			break;
		case 1:
			ret = frank.stats(cha, p, v);
			break;
		case 2:
			ret = guiri.stats(cha, p, v);
			break;
		}

		return ret;
	}

	private void setEstrategia() {
		
		
		switch((int)(Math.random()*3)) {
		
		case 0:
			estrategia = new ContextStrategy(new Normal());
			break;
		case 1:
			estrategia = new ContextStrategy(new Hielo());
			break;
		case 2:
			estrategia = new ContextStrategy(new Veneno());
			break;
		
		}
		
	}
	
	public void recibir(int n) {
		
		stats(true,0,stats(false,0,0)-n);
		
	}
	
	public String getEstrategia() {
		return estrategia.estrategia();
	}
	
	public TemplateAcciones getAccion() {
		return accion;
	}

	public void setAccion() {
		
		switch((int)(Math.random()*2)) {
		
		case 0:
			accion = new AccionAtacar();
			setEstrategia();
			break;
		case 1:
			accion = new AccionEsquivar();
			estrategia = new ContextStrategy(new Normal());
			break;
		
		}
		
	}
	
}
