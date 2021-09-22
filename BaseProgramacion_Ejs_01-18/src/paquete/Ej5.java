package paquete;

import java.util.Scanner;

public class Ej5 {
									/*ENUNCIADO*/
					/*Programa que nos informa si un número introducido es primo o no*/
	public static void main(String[] args) {
		
		int numero;
		boolean primo=true;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("introduce un numero");
		numero=sc.nextInt();
		
		for(int i=2; i<numero;i++) {
			if(numero%i==0) {
				primo=false;
			}
		}
		if(primo==true) {
			System.out.println("Es primo");
		}else {
			System.out.println("No es primo");
		}
		
	}

}
