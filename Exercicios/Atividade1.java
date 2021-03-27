package Exercicios;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		int n1, n2, resDiv, resMult, resSoma, resSub;
		
		Scanner teclado = new Scanner(System.in);
		//Entrada
		System.out.println("Informe o primeiro número: ");
		n1 = teclado.nextInt();
		
		System.out.println("Informe o segundo número: ");
		n2 = teclado.nextInt();
		//Processamento
		resSoma = n1 + n2;
		resSub = n1 - n2;
		resMult = n1 * n2;
		resDiv = n1 / n2;
		//Saída
		System.out.println("A soma é: " + resSoma);
		System.out.println("A subtração é: " + resSub);
		System.out.println("A multiplicação é: " + resMult);
		System.out.println("A divisao é: " + resDiv);
	}

}
