package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioQuinto {

	// 5. Leia um numero real e imprima a quinta parte deste n�mero.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Quinta parte do N�mero##");

		System.out.println("Digite o n�mero: ");
		float numeroLido = teclado.nextFloat();

		float quintaparte = numeroLido / 5F;

		System.out.printf("A quinta parte de %.2f � : %.2f", numeroLido, quintaparte);
		teclado.close();

	}

}
