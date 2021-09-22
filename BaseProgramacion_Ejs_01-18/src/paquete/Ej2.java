package paquete;

import java.util.Scanner;

public class Ej2 {
											/*ENUNCIADO*/
		/*Programa que lee 5 números comprendidos entre el 20 y 40, ambos inclusive. En el caso
		en el que algún número introducido no se encontrara dentro del rango permitido, se
		mostrará un mensaje de error y seguirá pidiendo números. El programa finalizará cuando
		se hayan introducido 5 números válidos y mostrará el número máximo introducido de los
		5 válidos. Además indicará cuántos números de los introducidos no han sido válidos*/


	public static void main(String[] args) {
		int numerosValidos=0, numerosNoValidos=0, numeroMax=19, numero;
		
		do {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("introduce un numero");
			numero=sc.nextInt();
			
			if(numero >=20 && numero <=40) {
				numerosValidos++;
				if(numero>numeroMax) {
					numeroMax=numero;
				}else {
					numeroMax=numeroMax;
				}
				
			}else {
				numerosNoValidos++;
				System.out.println("NO VALIDO, tiene que estar entre 20 y 40");
			}
			
		}while(numerosValidos<5);
		
		System.out.println("el numero maximo introducido es " + numeroMax + " y los numeros no validos han sido " + numerosNoValidos);
		
	}

}
