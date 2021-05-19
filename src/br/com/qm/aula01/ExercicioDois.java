package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioDois {

	// 2. Faça um programa que leia um número real e o imprima.
	
	public static void main(String[] args) {
		
		System.out.println("Digite um Número Real: ");
		Scanner teclado = new Scanner(System.in);
		float realLido = teclado.nextFloat();
		System.out.printf("O número digitado foi: %.2f", realLido);
		
		teclado.close();	}

}
