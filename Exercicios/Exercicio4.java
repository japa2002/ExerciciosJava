package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		double valor, novoValor;
		
		Scanner teclado = new Scanner(System.in);
		//Entrada
		System.out.println("Informe o valor ");
		valor = teclado.nextDouble();
		//Processamento
		novoValor = valor + (valor*(15.8/100));
		
		float fnovoValor = (float)novoValor; 
		//Saída
		System.out.println("O novo valor é: "+ fnovoValor);
		
	}

}
