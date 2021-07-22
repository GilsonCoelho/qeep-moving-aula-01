package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioSeis {

	// 6. Faça um programa que receba dois números e mostre qual deles é o maior.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("## 	QUAL O NÚMERO É MAIOR##");

		System.out.println("Digite o primeiro Número: ");
		int primeiroNumero = teclado.nextInt();

		System.out.println("Digite o Segundo Número: ");
		int segundoNumero = teclado.nextInt();

		if (primeiroNumero > segundoNumero) {

			System.out.printf("o Número %d é maior do que %d", primeiroNumero, segundoNumero);

		} else if (primeiroNumero < segundoNumero) {

			System.out.printf("o Número %d é menor do que %d", primeiroNumero, segundoNumero);

		} else {

			System.out.println("Os dois Número São iguais");
		}

		teclado.close();

	}

}
