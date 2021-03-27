package Exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		String nome;
		int numeroHoras;
		int dependentes;
		
		Scanner teclado = new Scanner(System.in);
		//Entrada
		System.out.println("Nome: ");
		nome = teclado.next();
		
		System.out.println("Horas: ");
		numeroHoras = teclado.nextInt();

		System.out.println("Dependentes: ");
		dependentes = teclado.nextInt();
		//Processo
		double salarioBruto = numeroHoras * 32 + dependentes * 40;
		double valorINSS = salarioBruto * 8.5 / 100;
		double valorIR = salarioBruto * 5 / 100;
		double salarioLiquido = salarioBruto - valorINSS - valorIR;
		
		//saida
		System.out.println("Nome: " + nome);
		System.out.println("Bruto: " + salarioBruto);
		System.out.println("INSS: " + valorINSS);
		System.out.println("IR: " + valorIR);
		System.out.println("Liquido: "+ salarioLiquido);
		
		teclado.close();
		
		
	}

}
