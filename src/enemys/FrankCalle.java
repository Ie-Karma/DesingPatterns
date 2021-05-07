package enemys;

import abstract_factory.Frank;

public class FrankCalle implements Frank{
	
	int vida;
	int ataque;
	int destreza;
	
	public FrankCalle(int v, int a, int d) {
		
		vida = v;
		ataque = a;
		destreza = d-3;
		
	}
	
	@Override
	public void Info() {
		
		System.out.printf
		("╔══════════════════════════════════╗\n"
	   + "║                                  ║\n"
	   + "║       HA APARECIDO FRANK         ║\n"
	   + "║                                  ║\n"
	   + "╠══════════════════════════════════╣\n"
	   + "║     \"¿Aqui no hay animales?\"     ║\n"
	   + "╠══════════════════════════════════╣\n"
	   + "║    Frank no conoce la ciudad     ║\n"
	   + "║        -3 pts de destreza        ║\n"
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
