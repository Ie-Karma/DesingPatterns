package enemys;

import abstract_factory.Guiri;

public class GuiriPlaya implements Guiri{

	int vida;
	int ataque;
	int destreza;
	
	public GuiriPlaya(int v, int a, int d) {
		
		vida = v+20;
		ataque = a;
		destreza = d;
		
	}
	
	@Override
	public void info() {
		
		System.out.printf
		("╔══════════════════════════════════╗\n"
	   + "║                                  ║\n"
	   + "║      HA APARECIDO UN GUIRI       ║\n"
	   + "║                                  ║\n"
	   + "╠══════════════════════════════════╣\n"
	   + "║  \"Yo acostumbrado a sol playa\"   ║\n"
	   + "╠══════════════════════════════════╣\n"
	   + "║    El Guiri se conoce la playa   ║\n"
	   + "║         +20 pts de vida          ║\n"
	   + "╠══════════════════════════════════╣\n"
	   + "╠ VIDA <%03d>                       ║\n"
	   + "╠ ATAQUE <%02d>                      ║\n"
	   + "╠ DESTREZA <%02d>                    ║\n"
	   + "╚══════════════════════════════════╝\n",vida,ataque,destreza);
		
	}
	
	@Override
	public int stats(boolean cha, int p, int v) {
		
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
