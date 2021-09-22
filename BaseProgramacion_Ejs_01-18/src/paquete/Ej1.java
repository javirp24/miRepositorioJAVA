package paquete;

import java.util.Scanner;

public class Ej1 {
									/*ENUNCIADO*/
	/*Programa que lee dos números A y B, y nos informa si B es divisor de A o no.*/

	public static void main(String[] args) {
		int numeroA, numeroB;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("introduce numeroA");
		numeroA=sc.nextInt();
		
		System.out.println("introduce numeroB");
		numeroB=sc.nextInt();
		
		if(numeroA%numeroB==0) {
			System.out.println("el numero B es divisor del numero A");
		}else {
			System.out.println("el numero B NO es divisor del numero A");
		}

	}

}
