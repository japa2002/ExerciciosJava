package Exercicios;

import java.util.Scanner;

public class ExercicioTreino1 {

	public static void main(String[] args) {
		
		double sal, bon = 0, aux = 0, novoSal = 0;
		
		Scanner  teclado = new Scanner(System.in);
		
		System.out.println("Informe o salário: ");
		sal = teclado.nextInt();
		
		if(sal <= 800) {
			bon = sal * 5/100;
			novoSal = sal + bon;
		}if(sal > 800){
			if(sal <= 1300) {
				bon = sal * 12/100;
				novoSal = sal + bon;
			}
		}if(sal > 1300) {
			bon = 0;
			novoSal = sal;
		}if(sal <= 900) {
			aux = 150;
			novoSal = sal + aux;
		}if(sal > 900){
			aux = 100;
			novoSal = sal + aux;
		}
		
		novoSal = sal + aux + bon;
		
		System.out.println("O novo salário é: R$" + novoSal);
		
		}
	}
