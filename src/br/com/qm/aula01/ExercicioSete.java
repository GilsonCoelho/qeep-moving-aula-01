package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioSete {

	// 7. Leia um n�mero inteiro e imprima o seu antecessor e o seu sucessor.

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("## ANTECESSOR E SUCESSOR##");

		System.out.println("Digite o n�mero Inteiro: ");
		int numeroLido = teclado.nextInt();

		int antecessor = numeroLido - 1;
		int sucessor = numeroLido + 1;

		System.out.printf("Antecessor de %d � %d e sucessor � %d ", numeroLido, antecessor, sucessor);

		teclado.close();
	}

}
