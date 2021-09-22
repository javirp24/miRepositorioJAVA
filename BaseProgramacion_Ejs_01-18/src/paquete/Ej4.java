package paquete;

import java.util.Scanner;

public class Ej4 {
									/*ENUNCIADO*/
		/*Programa que muestra todos los divisores de un número introducido. Entre los divisores no
	      se incluirá el propio número*/
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
