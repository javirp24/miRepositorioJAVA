package paquete;

import java.util.Scanner;

public class Ejecuta {
									/*ENUNCIADO*/
		/* Programa que lee nombre y a�o de nacimiento de una serie de alumnos hasta introducir
		   como nombre de alumno �fin�. En ese momento mostrar� la edad media de los alumnos y
		   el nombre del alumno menor. NOTA: Al introducir como nombre �fin�, no nos ha de pedir el
		   a�o de nacimiento.*/

	public static void main(String[] args) {
		
		String nombre,alumnoMenor="";
		int a�o, suma=0, edad, cont=0, edadMenor=Integer.MAX_VALUE;
		float media=0;
		Scanner sc=new Scanner(System.in);
		
		do {
		System.out.println("introduce nombre");
		nombre=sc.nextLine();
		
		if(!nombre.equals("fin")) {
			System.out.println("introduce a�o de nacimiento de " + nombre);
			a�o=Integer.parseInt( sc.nextLine() );
			edad=2021-a�o;
			cont++;
			suma += edad;
			media= (float)suma/cont;
			if(edadMenor>edad) {
				edadMenor=edad;
				alumnoMenor=nombre;
			}
		}
		}while(!nombre.equals("fin"));
		
		System.out.println("la edad media es " + media + " y el alumno mas peque�o es " + alumnoMenor);
		
		System.out.println("hola");
	}
}
