package br.com.qm.aula03;

import java.util.Scanner;

public class ExercicioDois {

	//15. Faça um programa que mostre ao usuário um menu com 4 opções de
	//operações matemáticas (as básicas, por exemplo). O usuário escolhe uma das
	//opções e o seu programa então pede dois valores numéricos e realiza a
	//operação, mostrando o resultado e saindo.
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("## Calculadora ##");
		
		System.out.println("Digite 1 para Soma ");
		System.out.println("Digite 2 para Subtração ");
		System.out.println("Digite 3 para Multiplicação ");
		System.out.println("Digite 4 para Divisão ");
		int numeroEscolhido = teclado.nextInt();
		
		System.out.println("Digite o Primeiro valor ");
		float primeiroValor = teclado.nextFloat();
		System.out.println("Digite o Segundo valor ");
		float segundoValor = teclado.nextFloat();
		
		switch (numeroEscolhido) {
		case 1: 
			float resultado = primeiroValor + segundoValor; 
			System.out.printf("Valor da Soma é : %.2f ", resultado);
			break;			
		case 2: 			
			float resultado1 = primeiroValor - segundoValor; 
			System.out.printf("Valor da Subtração é : %.2f ", resultado1);
			break;
		case 3: 
			float resultado2 = primeiroValor * segundoValor; 
			System.out.printf("Valor da Multiplicação é : %.2f ", resultado2);
			break;			
		case 4:
			if(segundoValor != 0) {
			float resultado3 = primeiroValor / segundoValor;
			System.out.printf("Valor da Divisão é : %.2f ", resultado3);
			}else {
				System.out.println("O Segundo valor não pode Zero para Divisão ");
			}
			break;

	}

		teclado.close();


	}

}
