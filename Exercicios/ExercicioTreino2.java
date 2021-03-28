package Exercicios;

import java.io.*;

import java.util.*;

import java.util.Scanner;

public class ExercicioTreino2 {

	public static void main(String[] args) {
		int i = 0;
		double maior = 0, medio = 0, menor = 0;
		double A, B, C;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite A: ");
		A = teclado.nextInt();
		
		System.out.println("Digite B: ");
		B = teclado.nextInt();
		
		System.out.println("Digite C: ");
		C = teclado.nextInt();
		
		System.out.println(" Digite 1 para crescente:\n Digite 2 para decrescente:\n Digite 3 para o maior ficar no meio:");
		i = teclado.nextInt();
		
		if((A > B) && (A > C)) {
			if(B > C) {
				maior = A;
				medio = B;
				menor = C;
			}else {
				maior = A;
				medio = B;
				menor = C;
			}
			
		}if ((B > A) && (B > C)) {
			if(A > C) {
				maior  = B;
				medio = A;
				menor = C;
			}else {
				maior = B;
				medio = A;
				menor = C;
			}
			
		}if((C> A)&&(C > B)){
			if(B > A) {
				maior = C;
				medio = B;
				menor = A;
			}else {
				maior = C;
				medio = B;
				menor = A;
			}
		}
		
		switch(i){
		
			case 1:
				System.out.println("Ordem crescente: "+ menor + " " + medio +" " + maior+ " ");
				break;
			
			case 2:
				System.out.println("Ordem decrescente: "+ maior+ " " + medio +" "+menor+ " ");
				break;
				
			case 3:
				System.out.println("O maior fica entre os dois: "+ medio+" "+ maior+ " "+ menor+"");
				break;
		}
	}
}
