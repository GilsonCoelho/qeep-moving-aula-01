package br.com.qm.aula03;

import java.util.Scanner;

public class ExercicioOnze {

	// 9. Fa�a um programa que calcule o fatorial de um n�mero inteiro fornecido
	// pelo usu�rio.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("## CALCULE O FATORIA DE UM NUMERO ##");
		System.out.println("Digite o n�meros : ");
		int numerosLido = teclado.nextInt();
		int soma = 1;

		for (int i = numerosLido; i > 1; i--) {
			soma = soma * i;
		}
		System.out.printf("A Soma fatorial do n�mero %d � : %d : ", numerosLido, soma);
		teclado.close();
	}

}
