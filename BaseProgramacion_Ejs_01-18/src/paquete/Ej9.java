package paquete;

import java.util.Scanner;

public class Ej9 {
									/*ENUNCIADO*/
			/*Programa consistente en un juego en el que el Jugador1 introduce un número entre el 1 y
		      el 100 y el Jugador2 tendrá que adivinarlo en un máximo de 10 intentos. Por cada intento
		      del Jugador2, y en el caso de no acertar, se mostrará el mensaje “Te pasaste”, o “No
		      llegaste”, según corresponda. De la misma manera, y al terminar el programa, se
		      mostrarán los mensajes “Acertaste” o bien “Intentos agotados”.*/

	public static void main(String[] args) {
		int jugador1, jugador2, intentos=0;
		boolean victoria=false;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("jugador 1 introduce un numero entre el 1 y el 100");
		jugador1= sc.nextInt();
		
		while(intentos<5) {
			System.out.println("jugador 2 adivina un numero entre el 1 y el 100");
			jugador2= sc.nextInt();
			
			if(jugador2==jugador1) {
				intentos=6;
			}
			if(jugador2>jugador1) {
				intentos++;
				System.out.println("te pasaste");
			}
			if(jugador2<jugador1) {
				intentos++;
				System.out.println("no llegaste");
			}
			
		}
		
		if(intentos==5) {
			System.out.println("Has perdido porque gastaste los 5 intentos posibles");
		}
		if(intentos==6) {
			System.out.println("Acertaste. Has ganadoooo!!");
		}
		

	}

}
