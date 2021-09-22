package paquete;

import java.util.Scanner;

public class tablaMultiplicar {
	
								/*TODAS LAS TABLA DE MULTIPLICAR*/

	public static void main(String[] args) {
		/*
		Scanner sc=new Scanner(System.in);
		int numero;
		int resultado;
		String fila;
		System.out.println("que tabla de multiplicar quieres?");
		numero= sc.nextInt();
		for(int i=1; i<=10;i++) {
			resultado=i*numero;
			fila=numero + " X " + i + " = " + resultado;
			System.out.println(fila);
		}*/
		
		
		int resultado,suma;
		for(int i = 1 ; i <= 10; i++) {
			
			System.out.println("TABLA DEL " + i + ": ");
			suma=0;
			for(int j = 0; j<=10; j++) {
				
				resultado= i * j;
				suma +=resultado;
				System.out.println(i + " X " + j + " = " + resultado);
				
				
			}
			System.out.println("la suma de la tabla del " + i + " es: " + suma);
			System.out.println( "=============");
		}
		

	}

}
