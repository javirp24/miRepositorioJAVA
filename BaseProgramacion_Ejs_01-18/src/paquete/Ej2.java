package paquete;

import java.util.Scanner;

public class Ej2 {
											/*ENUNCIADO*/
		/*Programa que lee 5 n�meros comprendidos entre el 20 y 40, ambos inclusive. En el caso
		en el que alg�n n�mero introducido no se encontrara dentro del rango permitido, se
		mostrar� un mensaje de error y seguir� pidiendo n�meros. El programa finalizar� cuando
		se hayan introducido 5 n�meros v�lidos y mostrar� el n�mero m�ximo introducido de los
		5 v�lidos. Adem�s indicar� cu�ntos n�meros de los introducidos no han sido v�lidos*/


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
