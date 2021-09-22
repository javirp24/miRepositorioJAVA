package paquete;

import java.util.Scanner;

public class Ej3 {
	
										/*ENUNCIADO*/
			/*Programa que lee de manera consecutiva números hasta que se introducen dos números
			iguales seguidos*/
	
	public static void main(String[] args) {
		int numero, numero2;
		boolean continuar=true;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("introduce un numero");
		numero=sc.nextInt();
		do {
			System.out.println("introduce un numero");
			numero2=sc.nextInt();
			if(numero==numero2) {
				continuar=false;
			}
			numero=numero2;
		}while(continuar==true);
		System.out.println("ya se han leido dos numeros iguales seguidos");
		

	}

}
