package ar.edu.unlam.tpGit.dominio;

import java.util.Scanner;
	public class Calculadora {
		public static void main(String[] args) {
			Integer a;
			Integer b;
			Integer opcion;
			Integer resultado;
			Scanner teclado = new Scanner(System.in);
			do{
				System.out.println("Ingrese su operaci�n \n 1 para sumar \n 2 para restar \n 3 para multiplicar \n 4 para dividir");
				opcion = teclado.nextInt();
			}while(opcion < 1 && opcion > 4);
				System.out.println("Ingrese el primer numero");
			a = teclado.nextInt();
			System.out.println("Ingrese el segundo numero");
			b = teclado.nextInt();
			
			switch (opcion) {
			case 4: 
				resultado = sumar(a, b);
				break;
			case 3:
				resultado = sumar(a, b);
				break;
			case 2:
				resultado = multiplicar(a, b);
				break;
			case 1:
				resultado = dividir(a, b);
				break;
			}
			teclado.close();
			System.out.println("El resultado es " + resultado.toString());
		}
		
		public static Integer multiplicar(Integer a, Integer  b) {
			return a * b;
		}
		
		public static Integer dividir(Integer a, Integer  b) {
			return a / b;
		}
		public static Integer sumar(Integer a, Integer b) {
			return a + b;
		}
		
		public static Integer restar (Integer a, Integer b) {
			return a - b;
		}
}
