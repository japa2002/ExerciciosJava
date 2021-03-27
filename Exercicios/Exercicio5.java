package Exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		float valorBase, valorAltura, valorArea;
		
		Scanner teclado = new Scanner(System.in);
		//Entrada
		System.out.println("base: ");
		valorBase = teclado.nextInt();
		
		System.out.println("altura: ");
		valorAltura = teclado.nextInt();
		//Processo
		valorArea = valorBase * (valorAltura / 2);
		//Saída
		System.out.println("area: "+ valorArea);
		
		teclado.close();
	}

}
