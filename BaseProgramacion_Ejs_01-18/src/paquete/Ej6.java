package paquete;

import java.util.Scanner;

public class Ej6 {
									/*ENUNCIADO*/
		/*Programa que lee 4 números, y en el caso en el que el primero introducido sea igual al
          último, nos muestra la media. En caso contrario, no se mostrará nada*/
	
	public static void main(String[] args) {
		int numero,primero=0, ultimo=0, suma=0;
		float media=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("introduce numero");
		primero=sc.nextInt();
		suma += primero;
		
		for(int i=2; i<4; i++) {
			System.out.println("introduce numero");
			suma += sc.nextInt();
			}
		
		System.out.println("introduce numero");
		ultimo=sc.nextInt();
		suma += ultimo;
		
		if(primero==ultimo) {
			media = suma/4f;
			System.out.println("la media es " + media);
		}
		
	}

}
