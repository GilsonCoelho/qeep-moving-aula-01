package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioUm {
	// 1. Faça um programa que leia um número inteiro e o imprima.

	
	public static void main(String[] args) {
				
		System.out.println("Digite um Número: ");
		Scanner teclado = new Scanner(System.in);
		int inteiroLido = teclado.nextInt();
		System.out.printf("O número digitado foi: %d", inteiroLido);
		teclado.close();

	}

}
