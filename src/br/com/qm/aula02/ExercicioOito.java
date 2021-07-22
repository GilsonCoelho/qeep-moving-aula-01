package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioOito {

	// 8. Escreva um programa que, dados dois números inteiros, mostre na tela o
	// maior deles, assim como a diferença existente entre ambos.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("## 	QUAL O NÚMERO É MAIOR  E A DIREFENÇA ENTRE ELES##");

		System.out.println("Digite o primeiro Número: ");
		int primeiroNumero = teclado.nextInt();

		System.out.println("Digite o Segundo Número: ");
		int segundoNumero = teclado.nextInt();

		if (primeiroNumero > segundoNumero) {

			int diferenca = primeiroNumero - segundoNumero;
			System.out.printf("o Número %d é maior do que %d \n", primeiroNumero, segundoNumero);
			System.out.printf("A diferença entre eles é %d", diferenca);

		} else if (primeiroNumero < segundoNumero) {

			int diferenca = segundoNumero - primeiroNumero;
			System.out.printf("o Número %d é maior do que %d \n", segundoNumero, primeiroNumero);
			System.out.printf("A diferença entre eles é %d", diferenca);

		} else {

			System.out.println("Os dois Número São iguais diferença é 0");
		}

		teclado.close();

	}

}
