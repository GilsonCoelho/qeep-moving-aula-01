package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioSeis {

	// 6. Fa�a um programa que receba dois n�meros e mostre qual deles � o maior.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("## 	QUAL O N�MERO � MAIOR##");

		System.out.println("Digite o primeiro N�mero: ");
		int primeiroNumero = teclado.nextInt();

		System.out.println("Digite o Segundo N�mero: ");
		int segundoNumero = teclado.nextInt();

		if (primeiroNumero > segundoNumero) {

			System.out.printf("o N�mero %d � maior do que %d", primeiroNumero, segundoNumero);

		} else if (primeiroNumero < segundoNumero) {

			System.out.printf("o N�mero %d � menor do que %d", primeiroNumero, segundoNumero);

		} else {

			System.out.println("Os dois N�mero S�o iguais");
		}

		teclado.close();

	}

}
