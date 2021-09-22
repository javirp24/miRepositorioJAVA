package paquete;

public class tablaMultiplicar {
	
									/*TABLA DE MULTIPLICAR*/

	public static void main(String[] args) {
		int num=5;
		int resultado;
		String fila;
		
		for(int i=1; i<=10;i++) {
			resultado=i*num;
			fila=num + " X " + i + " = " + resultado;
			System.out.println(fila);
		}

	}

}
