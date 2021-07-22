package br.com.qm.aula03;

import java.util.Scanner;

public class ExercicioQuinto {

	// 3. Escreva um programa que leia 10 números e escreva o menor valor lido e o
	// maior valor lido.

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("## O MAIO E MENOR DOS NUMEROS ##");

		int valorMaior = Integer.MIN_VALUE;
		int valorMenor = Integer.MAX_VALUE;

		for (int i = 1; i <= 10; i++) {
			System.out.println(" Digite um Numero : ");
			int digitado = teclado.nextInt();
			if (valorMaior < digitado) {
				valorMaior = digitado;
			}
			if (valorMenor > digitado) {
				valorMenor = digitado;
			}
		}
		System.out.printf(" O maior Numero digitado é %d \n E o Menor Número digitado é %d", valorMaior, valorMenor);

		teclado.close();

	}

}
