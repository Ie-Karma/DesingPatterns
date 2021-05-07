package enemys;

import abstract_factory.Frank;

public class FrankJungla implements Frank{

	int vida;
	int ataque;
	int destreza;
	
	public FrankJungla(int v, int a, int d) {
		
		vida = v;
		ataque = a;
		destreza = d+2;
		
	}
	
	@Override
	public void Info() {
		
		System.out.printf
		("╔══════════════════════════════════╗\n"
	   + "║                                  ║\n"
	   + "║       HA APARECIDO FRANK         ║\n"
	   + "║                                  ║\n"
	   + "╠══════════════════════════════════╣\n"
	   + "║   \"MI TERRITORIO ES DISCOVERY\"   ║\n"
	   + "╠══════════════════════════════════╣\n"
	   + "║  Frank conoce muy bien la jungla ║\n"
	   + "║        +2 pts de destreza        ║\n"
	   + "╠══════════════════════════════════╣\n"
	   + "╠ VIDA <%03d>                       ║\n"
	   + "╠ ATAQUE <%02d>                      ║\n"
	   + "╠ DESTREZA <%02d>                    ║\n"
	   + "╚══════════════════════════════════╝\n",vida,ataque,destreza);
		
	}
	
	@Override
	public int Stats(boolean cha, int p, int v) {
		
		int ret = 0;
		
		if(cha) {
			
			switch(p) {
			
			case 0:
				vida = v;
				break;
				
			case 1: 
				ataque = v;
				break;
				
			case 2:
				destreza = v;
				break;
				
			}
			
		}else {
			
			switch(p) {
			
			case 0:
				ret = vida;
				break;
				
			case 1: 
				ret = ataque;
				break;
				
			case 2:
				ret = destreza;
				break;
				
			}
			
		}

		return ret;
		
	}
	
}
