package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioUm {

	// 1. Leia um valor de comprimento em polegadas e apresente-o convertido em
	// centímetros.

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("## Comprimeto de Polegado para Centimetro##");

		System.out.println("Digite o valor em Polegadas: ");
		float valorPolegada = teclado.nextFloat();

		float valorCentimetro = valorPolegada * 2.45F;
		System.out.printf("O valor %.2f polegadas equivale á %.2f centimétros", valorPolegada, valorCentimetro);

		teclado.close();

	}

}
