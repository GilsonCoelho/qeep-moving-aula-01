package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioOito {

	// 8. Leia um número inteiro e imprima a soma do sucessor de seu triplo com o
	//antecessor de seu dobro.
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("## NÓ NA CABEÇA##");
		
		System.out.println("Digite o número Inteiro: ");
		int numeroLido = teclado.nextInt();
		
		int antecessorDoDobro = (numeroLido * 2) - 1;
		int sucessorDoTriplo = (numeroLido * 3) + 1;
		int soma = sucessorDoTriplo + antecessorDoDobro;
		System.out.printf("A soma do sucessor de seu triplo com "
				+ "o antecessor de seu dobro é: %d", soma);
		
		teclado.close();

	}

}
