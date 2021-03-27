package Exercicios;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int nasc, idade, anoAtual = 2021;
		
		Scanner teclado = new Scanner(System.in);
		//Entrada
		System.out.println("Informe sua data de nascimento: ");
		nasc = teclado.nextInt();
		
		//Processamento
		idade = anoAtual - nasc;
		
		//Saída
		System.out.println("A sua idade é: " + idade);
		
		Date d = new Date();
		
		System.out.println(d);
		
	}

}
