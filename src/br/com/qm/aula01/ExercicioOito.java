package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioOito {

	// 8. Leia um n�mero inteiro e imprima a soma do sucessor de seu triplo com o
	//antecessor de seu dobro.
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("## N� NA CABE�A##");
		
		System.out.println("Digite o n�mero Inteiro: ");
		int numeroLido = teclado.nextInt();
		
		int antecessorDoDobro = (numeroLido * 2) - 1;
		int sucessorDoTriplo = (numeroLido * 3) + 1;
		int soma = sucessorDoTriplo + antecessorDoDobro;
		System.out.printf("A soma do sucessor de seu triplo com "
				+ "o antecessor de seu dobro �: %d", soma);
		
		teclado.close();

	}

}
