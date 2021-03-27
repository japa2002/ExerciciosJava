package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int valor1, valor2, valor3, res1, res2, res3, res4, res5, res6;
		
		Scanner teclado = new Scanner(System.in); 
		//Entrada
		System.out.println("Informe o primeiro valor");
		valor1 = teclado.nextInt();
		System.out.println("Informe o segundo  valor");
		valor2 = teclado.nextInt();
		System.out.println("Informe o terceiro valor");
		valor3 = teclado.nextInt();
		
		//Processamento / Saída
		System.out.println("Valor 1 + Valor 2: " + (valor1 + valor2));
		System.out.println("Valor 2 - Valor 1: " + (valor2 - valor1));
		System.out.println("Valor 3 * Valor 1: " + (valor3 * valor1));
		System.out.println("Valor 3 + Valor 2: " + (valor3 + valor2));
		System.out.println("Valor 3 - Valor 2: " + (valor3 - valor2));
		System.out.println("Valor 1 + valor 2 + Valor 3: "+(valor1 + valor2 + valor3));
		
		teclado.close();
	}

}
