package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioSeis {
	
	//6. Leia o tamanho do lado de um quadrado e imprima como resultado a sua área.

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("O quadrado deste Número##");
		
		System.out.println("Digite o número: ");
		int numeroLido = teclado.nextInt();
		
		int quadrado = numeroLido * numeroLido;
		
		System.out.printf("A area do quadrado de %d é : %d ", numeroLido, quadrado);
		teclado.close();
		

	}

}
