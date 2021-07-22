package br.com.qm.aula03;

import java.util.Scanner;

public class ExercicioNove {

	// 7. Fa�a um programa que some os n�meros �mpares contidos em um
	// intervalo definido pelo usu�rio. O usu�rio define o valor inicial do
	// intervalo e o
	// valor final deste intervalo e o programa deve somar todos os n�meros
	// �mpares contidos neste intervalo. Caso o usu�rio digite um intervalo inv�lido
	// (come�ando por um valor maior que o valor final) deve ser escrito uma
	// mensagem de erro na tela, �Intervalo de valores inv�lido� e o programa
	// termina.

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("## SOMA DOS N INTEIROS IMPARES ##");
		System.out.println("Digite o n�meros inicial : ");
		int primeiroNumeros = teclado.nextInt();
		System.out.println("Digite o n�meros final : ");
		int segundoNumeros = teclado.nextInt();
		int soma = 0;

		if (primeiroNumeros >= segundoNumeros) {
			System.out.println("Intervalo de valores inv�lido");
			return;
		}

		for (int i = primeiroNumeros; i <= segundoNumeros; i++) {
			if (i % 2 != 0) {
				soma += i;
			}
		}

		System.out.printf("A soma dos inteiros impares � %d", soma);

		teclado.close();
	}

}
