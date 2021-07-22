package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioSete {

	// 7. Faça um programa que peça um valor e mostre na tela se o valor é positivo
	// ou negativo.
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("## 	POSITIVO OU NEGATIVO##");

		System.out.println("Digite um Número: ");
		int numeroLido = teclado.nextInt();

		if (numeroLido > 0) {

			System.out.printf("o Número %d é Positivo", numeroLido);

		} else if (numeroLido < 0) {

			System.out.printf("o Número %d é Negativo", numeroLido);

		} else {

			System.out.println("O número é nulo(igaul a ZERO");
		}

		teclado.close();

	}

}
