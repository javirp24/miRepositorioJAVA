package paquete;

import java.util.Scanner;

public class Ej8 {
									/*ENUNCIADO*/
		/*Programa que lee 87 números. Al finalizar mostrará el máximo introducido, y cuántas veces
	      se repite dicho máximo.*/

	public static void main(String[] args) {
		int numero, numeroMax=0, cont=1;
		Scanner sc=new Scanner(System.in);
		
		for(int i=1; i<=4; i++) {
			System.out.println("introduce numero");
			numero= sc.nextInt();
			if(numero>numeroMax) {
				numeroMax=numero;
				cont=1;
			}
			if(numero==numeroMax) {
				cont++;
			}
		}
		System.out.println("el maximo se repitio " + cont + " veces");
		
		
		
	}

}
