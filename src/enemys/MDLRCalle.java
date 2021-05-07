package enemys;

import abstract_factory.MDLR;

public class MDLRCalle implements MDLR{

	int vida;
	int ataque;
	int destreza;
	
	public MDLRCalle(int v, int a, int d) {
		
		vida = v;
		ataque = a+5;
		destreza = d+3;
				
	}

	@Override
	public void Info() {
		
		System.out.printf
		("╔══════════════════════════════════╗\n"
	   + "║                                  ║\n"
	   + "║      HA APARECIDO UN MDLR        ║\n"
	   + "║                                  ║\n"
	   + "╠══════════════════════════════════╣\n"
	   + "║  \"Tas en mi territorio manin\"    ║\n"
	   + "╠══════════════════════════════════╣\n"
	   + "║      El MDLR es de pura calle    ║\n"
	   + "║         +5 pts de ataque         ║\n"
	   + "║        +3 pts de destreza        ║\n"
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
