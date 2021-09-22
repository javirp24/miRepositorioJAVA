package paquete;

import java.util.Scanner;

public class Ej12 {
								/*ENUNCIADO*/
			/*Programa que muestra los números primos existentes entre el 1 y el 100. NOTA: Un
			  número es primo si tiene dos únicos divisores que son el 1 y él mismo.*/

	public static void main(String[] args) {
		
		int numero, resto;
		boolean primo=true;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("introduce numero");
		numero= sc.nextInt();
		
		for(int i=2; i<numero; i++) {
			resto=numero%i;
			if(resto==0) {
				primo=false;
			}
		}
		if(primo==true) {
			System.out.println("es primo");
		}else {
			System.out.println("NO es primo");
		}
		
	}

}
