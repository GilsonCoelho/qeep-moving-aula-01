package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioQuatro {
	
	//4. Leia um número real e imprima o resultado do quadrado desse número.
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("SOMA do Número ao quadrado##");
		
		System.out.println("Digite o número: ");
		int primeiroLido = teclado.nextInt();
		
		int quadrado = primeiroLido * primeiroLido;
		
		System.out.printf("O quadrado do Número %d é : %d", primeiroLido, quadrado);
		teclado.close();
	}

}
