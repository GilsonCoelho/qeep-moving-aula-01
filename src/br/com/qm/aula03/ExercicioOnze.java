package br.com.qm.aula03;

import java.util.Scanner;

public class ExercicioOnze {

	// 9. Faça um programa que calcule o fatorial de um número inteiro fornecido
	// pelo usuário.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("## CALCULE O FATORIA DE UM NUMERO ##");
		System.out.println("Digite o números : ");
		int numerosLido = teclado.nextInt();
		int soma = 1;

		for (int i = numerosLido; i > 1; i--) {
			soma = soma * i;
		}
		System.out.printf("A Soma fatorial do número %d é : %d : ", numerosLido, soma);
		teclado.close();
	}

}
