package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioOito {

	// 8. Escreva um programa que, dados dois n�meros inteiros, mostre na tela o
	// maior deles, assim como a diferen�a existente entre ambos.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("## 	QUAL O N�MERO � MAIOR  E A DIREFEN�A ENTRE ELES##");

		System.out.println("Digite o primeiro N�mero: ");
		int primeiroNumero = teclado.nextInt();

		System.out.println("Digite o Segundo N�mero: ");
		int segundoNumero = teclado.nextInt();

		if (primeiroNumero > segundoNumero) {

			int diferenca = primeiroNumero - segundoNumero;
			System.out.printf("o N�mero %d � maior do que %d \n", primeiroNumero, segundoNumero);
			System.out.printf("A diferen�a entre eles � %d", diferenca);

		} else if (primeiroNumero < segundoNumero) {

			int diferenca = segundoNumero - primeiroNumero;
			System.out.printf("o N�mero %d � maior do que %d \n", segundoNumero, primeiroNumero);
			System.out.printf("A diferen�a entre eles � %d", diferenca);

		} else {

			System.out.println("Os dois N�mero S�o iguais diferen�a � 0");
		}

		teclado.close();

	}

}
