package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioQuatro {
	
	//4. Leia um n�mero real e imprima o resultado do quadrado desse n�mero.
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("SOMA do N�mero ao quadrado##");
		
		System.out.println("Digite o n�mero: ");
		int primeiroLido = teclado.nextInt();
		
		int quadrado = primeiroLido * primeiroLido;
		
		System.out.printf("O quadrado do N�mero %d � : %d", primeiroLido, quadrado);
		teclado.close();
	}

}
