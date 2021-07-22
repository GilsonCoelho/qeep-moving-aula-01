package br.com.qm.aula03;

import java.util.Scanner;

public class ExerccioDez {

	// 8. Faça um programa que peça um número inteiro e determine se ele é ou
	// não um número primo. Um número primo é aquele que é divisível somente
	// por ele mesmo e por 1.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("## SE O NÚMERO É PRIMO ##");
		System.out.println("Digite o números : ");
		int numerosLido = teclado.nextInt();

		for (int i = 2; i <= numerosLido; i++) {
			if ((numerosLido % i == 0) && numerosLido != i) {
				System.out.printf(" O número %d não é Primo", numerosLido);
				break;
			} else if ((numerosLido % i == 0) && numerosLido == i) {
				System.out.printf(" O número %d é Primo", numerosLido);
			}
		}
		teclado.close();
	}

}
