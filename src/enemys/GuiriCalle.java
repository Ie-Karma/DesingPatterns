package enemys;

import abstract_factory.Guiri;

public class GuiriCalle implements Guiri{

	int vida;
	int ataque;
	int destreza;
	
	public GuiriCalle(int v, int a, int d) {
		
		vida = v;
		ataque = a-1;
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
	   + "║    \"you know where ibiza is?\"    ║\n"
	   + "╠══════════════════════════════════╣\n"
	   + "║  El Guiri se cansa por la calle  ║\n"
	   + "║         -1 pts de ataque         ║\n"
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
