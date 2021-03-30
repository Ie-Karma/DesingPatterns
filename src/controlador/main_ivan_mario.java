package controlador;

import java.util.Scanner;
import decorator.*;

public class main_ivan_mario {

	public static void main(String[] args) {
		
		prueba();
		
		System.out.println("pues adios glipollas");
		
	}

	@SuppressWarnings("resource")
	public static void prueba() {
		
	    Scanner scanner = new Scanner(System.in);
		
		System.out.println("-Bienvenido a Yo, interneto, the game-\n");
		
		//creamos 3 plantillas de personajes para que el jugador escoja una
		String champs[] = {"orson","dario","cheeto"};
		int vidas[] = {20,30,35};
		int ataques[] = {5,2,3};
		
		System.out.println("Escoja un champ:\n");
		
		for(int i = 0; i<3;i++) {
			System.out.println((i+1) + " - "+ champs[i] + "\nVida: " + vidas[i] + "\nAtaque: " + ataques[i] + "\n");
		}		
		
		int cha = scanner.nextInt();
		cha -= 1;
		
		//se escoje una de las "plantillas" de los personajes ya creados
		//y se envia por parametro con su nombre, vida y ataque para crear el personaje principal
		Personaje mainChar = new PersonajeBase(champs[cha],vidas[cha],ataques[cha]);

		System.out.print("okay, eres el hijo de puta de ");
		mainChar.info();
		mainChar.stats();
		
		enemigo();

		eleccion();
	
	}

	@SuppressWarnings({ "resource" })
	private static void eleccion(){
		
	    Scanner scanner = new Scanner(System.in);

		int sel = 0;
		
		do {
			
			System.out.println("\n¿Qué deseas hacer?");
			System.out.println("1 - Atacar");
			System.out.println("2 - Beber Mahou");
			System.out.println("3 - Pedir ayuda a Casio");
			System.out.println("4 - Terminar");
			
			sel = scanner.nextInt();
			
			switch(sel){
				
			case 1:atacar();break;
			case 2:beber();break;
			case 3:ayuda();break;
			case 4:break;
				
			}
			
		}while(sel != 4);
		
	}
	
	private static void enemigo() {
		
		String enemigo[] = {"lobo","girafa","perro","gato"};
		
		int ene;
		ene = (int)(Math.random()*3);
			
		//abstract factory
		System.out.println("\nte toca luchar contra " + enemigo[ene] + "\n");
			
	}

	private static void atacar() {
		
		//strategy
		System.out.println("atacas");
		
	}
	
	private static void beber() {
		
		//decorator
		System.out.println("bebes una mahou");
		
	}
	
	private static void ayuda() {
		
		System.out.println("casio te pone musica epica");
		
	}
	
}
