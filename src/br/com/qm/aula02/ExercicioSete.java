package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioSete {

	// 7. Fa�a um programa que pe�a um valor e mostre na tela se o valor � positivo
	// ou negativo.
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("## 	POSITIVO OU NEGATIVO##");

		System.out.println("Digite um N�mero: ");
		int numeroLido = teclado.nextInt();

		if (numeroLido > 0) {

			System.out.printf("o N�mero %d � Positivo", numeroLido);

		} else if (numeroLido < 0) {

			System.out.printf("o N�mero %d � Negativo", numeroLido);

		} else {

			System.out.println("O n�mero � nulo(igaul a ZERO");
		}

		teclado.close();

	}

}
