package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioUm {
	// 1. Fa�a um programa que leia um n�mero inteiro e o imprima.

	
	public static void main(String[] args) {
				
		System.out.println("Digite um N�mero: ");
		Scanner teclado = new Scanner(System.in);
		int inteiroLido = teclado.nextInt();
		System.out.printf("O n�mero digitado foi: %d", inteiroLido);
		teclado.close();

	}

}
