package paquete;

import java.util.Scanner;

public class Ej4 {
									/*ENUNCIADO*/
		/*Programa que muestra todos los divisores de un n�mero introducido. Entre los divisores no
	      se incluir� el propio n�mero*/
	public static void main(String[] args) {
		int numero;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("introduce un numero");
		numero=sc.nextInt();
		for(int i=1; i<numero;i++) {
			if(numero%i==0) {
				System.out.println(i);
			}
		}
	}
}
