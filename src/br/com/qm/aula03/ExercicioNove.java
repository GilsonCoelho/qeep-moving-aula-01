package br.com.qm.aula03;

import java.util.Scanner;

public class ExercicioNove {

	// 7. Faça um programa que some os números ímpares contidos em um
	// intervalo definido pelo usuário. O usuário define o valor inicial do
	// intervalo e o
	// valor final deste intervalo e o programa deve somar todos os números
	// ímpares contidos neste intervalo. Caso o usuário digite um intervalo inválido
	// (começando por um valor maior que o valor final) deve ser escrito uma
	// mensagem de erro na tela, “Intervalo de valores inválido” e o programa
	// termina.

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("## SOMA DOS N INTEIROS IMPARES ##");
		System.out.println("Digite o números inicial : ");
		int primeiroNumeros = teclado.nextInt();
		System.out.println("Digite o números final : ");
		int segundoNumeros = teclado.nextInt();
		int soma = 0;

		if (primeiroNumeros >= segundoNumeros) {
			System.out.println("Intervalo de valores inválido");
			return;
		}

		for (int i = primeiroNumeros; i <= segundoNumeros; i++) {
			if (i % 2 != 0) {
				soma += i;
			}
		}

		System.out.printf("A soma dos inteiros impares é %d", soma);

		teclado.close();
	}

}
