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
				
				System.out.println("Informe o c�digo: ");
				cod = teclado.nextInt();
				
				System.out.println("Informe seu sal�rio atual: ");
				sal = teclado.nextInt();
				
				if(cod == 1) {
					per = sal * 50/100;
					novoSal = sal + per;
					System.out.println("O cargo � Escritu�rio, o novo sal�rio �: "+ novoSal);
				}
				
				if(cod == 2) {
					per = sal * 35/100;
					novoSal = sal + per;
					System.out.println("O cargo � Secret�rio, o novo sal�rio �: "+ novoSal);
				}
				
				if(cod == 3) {
					per = sal * 20/100;
					novoSal = sal + per;
					System.out.println("O cargo � Caixa, o novo sal�rio �: "+ novoSal);
				}
				
				if(cod == 4) {
					per = sal * 10/100;
					novoSal = sal + per;
					System.out.println("O cargo � Gerente, o novo sal�rio �: "+ novoSal);
				}
				
				if(cod == 5) {
					System.out.println("O cargo � Diretor, o sal�rio �: "+ sal);
				}
			 break;
		
		//Estrutura condicional de caso
			case 2:
				System.out.println("Informe o c�digo: ");
				cod = teclado.nextInt();
				
				System.out.println("Informe seu sal�rio atual: ");
				sal = teclado.nextInt();
				
				System.out.println(" Digite 1 para Escritu�rio:\n Digite 2 para Secret�rio:\n Digite 3 para Caixa:\n Digite 4 para Gerente:\n Digite 5 para diretor: ");
				i = teclado.nextInt();
				switch(i) {
					case 1:
						per = sal * 50/100;
						novoSal = sal + per;
						System.out.println("O cargo � Escritu�rio, o novo sal�rio �: "+ novoSal);
					break;
					
					case 2:
						per = sal * 35/100;
						novoSal = sal + per;
						System.out.println("O cargo � Secret�rio, o novo sal�rio �: "+ novoSal);
					break;
					
					case 3:
						per = sal * 20/100;
						novoSal = sal + per;
						System.out.println("O cargo � Caixa, o novo sal�rio �: "+ novoSal);
					break;
					
					case 4:
						per = sal * 10/100;
						novoSal = sal + per;
						System.out.println("O cargo � Gerente, o novo sal�rio �: "+ novoSal);
					break;
					
					case 5:
						System.out.println("O cargo � Diretor, o sal�rio �: "+ sal);
					break;
			
				}
				break;
			}
		
		}		

}
