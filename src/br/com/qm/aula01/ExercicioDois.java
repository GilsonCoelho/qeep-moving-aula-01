package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioDois {

	// 2. Fa�a um programa que leia um n�mero real e o imprima.
	
	public static void main(String[] args) {
		
		System.out.println("Digite um N�mero Real: ");
		Scanner teclado = new Scanner(System.in);
		float realLido = teclado.nextFloat();
		System.out.printf("O n�mero digitado foi: %.2f", realLido);
		
		teclado.close();	}

}
