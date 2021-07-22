package br.com.qm.aula03;

import java.util.Scanner;

public class ExercicioUm {
	// 14. Usando switch, escreva um programa que leia um inteiro entre 1 e 7 e
	// imprima o dia da semana correspondente a este número. Isto e, domingo se 1,
	// segunda-feira se 2, e assim por diante.

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("## DIA DA SEMANA##");

		System.out.println("Digite um número Interio ");
		int numerodia = teclado.nextInt();

		switch (numerodia) {

		case 1:
			System.out.println(" Domingo ");
			break;
		case 2:
			System.out.println(" Segunda-feira ");
			break;
		case 3:
			System.out.println(" Terça-feira ");
			break;
		case 4:
			System.out.println(" Quarta-feira ");
			break;
		case 5:
			System.out.println(" Quinta-feira ");
			break;
		case 6:
			System.out.println(" Sexta-feira ");
			break;
		case 7:
			System.out.println(" Sábado ");
			break;

		default:
			System.out.println(" numero não válido ");

		}

		teclado.close();

	}

}
