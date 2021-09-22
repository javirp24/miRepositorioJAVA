package paquete;

import java.util.Scanner;

public class Ej7 {
									/*ENUNCIADO*/
		/*Programa que pide el número de calificaciones a introducir, y una nota de corte. A
	      continuación se introducirán las calificaciones, para finalmente indicar cuántas
	      calificaciones han igualado o superado la nota de corte*/
	
	public static void main(String[] args) {
		float notas, notaCorte;
		int contador=0, cantidadNotas=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Cuantas notas desea introducir?");
		cantidadNotas= sc.nextInt();
		
		System.out.println("introduzca nota de corte");
		notaCorte= sc.nextFloat();
		
		for(int i=1; i<=cantidadNotas; i++) {
			
			System.out.println("introduce notas");
			notas= sc.nextFloat();
			if(notas>=notaCorte) {
				contador++;
			}
		}//for
		System.out.println("las notas que superan la nota de corte son " + contador);

	}

}
