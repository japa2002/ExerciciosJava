package Exercicios;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		int n1, n2, resDiv, resMult, resSoma, resSub;
		
		Scanner teclado = new Scanner(System.in);
		//Entrada
		System.out.println("Informe o primeiro n�mero: ");
		n1 = teclado.nextInt();
		
		System.out.println("Informe o segundo n�mero: ");
		n2 = teclado.nextInt();
		//Processamento
		resSoma = n1 + n2;
		resSub = n1 - n2;
		resMult = n1 * n2;
		resDiv = n1 / n2;
		//Sa�da
		System.out.println("A soma �: " + resSoma);
		System.out.println("A subtra��o �: " + resSub);
		System.out.println("A multiplica��o �: " + resMult);
		System.out.println("A divisao �: " + resDiv);
	}

}
