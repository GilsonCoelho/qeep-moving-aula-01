package br.com.qm.aula03;

import java.util.Scanner;

public class ExerccioDez {

	// 8. Fa�a um programa que pe�a um n�mero inteiro e determine se ele � ou
	// n�o um n�mero primo. Um n�mero primo � aquele que � divis�vel somente
	// por ele mesmo e por 1.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("## SE O N�MERO � PRIMO ##");
		System.out.println("Digite o n�meros : ");
		int numerosLido = teclado.nextInt();

		for (int i = 2; i <= numerosLido; i++) {
			if ((numerosLido % i == 0) && numerosLido != i) {
				System.out.printf(" O n�mero %d n�o � Primo", numerosLido);
				break;
			} else if ((numerosLido % i == 0) && numerosLido == i) {
				System.out.printf(" O n�mero %d � Primo", numerosLido);
			}
		}
		teclado.close();
	}

}
