package Exercicios;

import java.util.Scanner;

public class ExercicioTreino3 {

	public static void main(String[] args) {
		
		//Estrutura condicional composta
		
		int cod, i, j;
		String cargo;
		double per, sal, novoSal;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("1 - sem Case:\n2 - com Case:");
		j = teclado.nextInt();
		switch(j) {
			case 1:
				
				System.out.println("Informe o código: ");
				cod = teclado.nextInt();
				
				System.out.println("Informe seu salário atual: ");
				sal = teclado.nextInt();
				
				if(cod == 1) {
					per = sal * 50/100;
					novoSal = sal + per;
					System.out.println("O cargo é Escrituário, o novo salário é: "+ novoSal);
				}
				
				if(cod == 2) {
					per = sal * 35/100;
					novoSal = sal + per;
					System.out.println("O cargo é Secretário, o novo salário é: "+ novoSal);
				}
				
				if(cod == 3) {
					per = sal * 20/100;
					novoSal = sal + per;
					System.out.println("O cargo é Caixa, o novo salário é: "+ novoSal);
				}
				
				if(cod == 4) {
					per = sal * 10/100;
					novoSal = sal + per;
					System.out.println("O cargo é Gerente, o novo salário é: "+ novoSal);
				}
				
				if(cod == 5) {
					System.out.println("O cargo é Diretor, o salário é: "+ sal);
				}
			 break;
		
		//Estrutura condicional de caso
			case 2:
				System.out.println("Informe o código: ");
				cod = teclado.nextInt();
				
				System.out.println("Informe seu salário atual: ");
				sal = teclado.nextInt();
				
				System.out.println(" Digite 1 para Escrituário:\n Digite 2 para Secretário:\n Digite 3 para Caixa:\n Digite 4 para Gerente:\n Digite 5 para diretor: ");
				i = teclado.nextInt();
				switch(i) {
					case 1:
						per = sal * 50/100;
						novoSal = sal + per;
						System.out.println("O cargo é Escrituário, o novo salário é: "+ novoSal);
					break;
					
					case 2:
						per = sal * 35/100;
						novoSal = sal + per;
						System.out.println("O cargo é Secretário, o novo salário é: "+ novoSal);
					break;
					
					case 3:
						per = sal * 20/100;
						novoSal = sal + per;
						System.out.println("O cargo é Caixa, o novo salário é: "+ novoSal);
					break;
					
					case 4:
						per = sal * 10/100;
						novoSal = sal + per;
						System.out.println("O cargo é Gerente, o novo salário é: "+ novoSal);
					break;
					
					case 5:
						System.out.println("O cargo é Diretor, o salário é: "+ sal);
					break;
			
				}
				break;
			}
		
		}		

}
