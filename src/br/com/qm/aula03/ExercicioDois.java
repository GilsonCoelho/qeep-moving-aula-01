package br.com.qm.aula03;

import java.util.Scanner;

public class ExercicioDois {

	//15. Fa�a um programa que mostre ao usu�rio um menu com 4 op��es de
	//opera��es matem�ticas (as b�sicas, por exemplo). O usu�rio escolhe uma das
	//op��es e o seu programa ent�o pede dois valores num�ricos e realiza a
	//opera��o, mostrando o resultado e saindo.
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("## Calculadora ##");
		
		System.out.println("Digite 1 para Soma ");
		System.out.println("Digite 2 para Subtra��o ");
		System.out.println("Digite 3 para Multiplica��o ");
		System.out.println("Digite 4 para Divis�o ");
		int numeroEscolhido = teclado.nextInt();
		
		System.out.println("Digite o Primeiro valor ");
		float primeiroValor = teclado.nextFloat();
		System.out.println("Digite o Segundo valor ");
		float segundoValor = teclado.nextFloat();
		
		switch (numeroEscolhido) {
		case 1: 
			float resultado = primeiroValor + segundoValor; 
			System.out.printf("Valor da Soma � : %.2f ", resultado);
			break;			
		case 2: 			
			float resultado1 = primeiroValor - segundoValor; 
			System.out.printf("Valor da Subtra��o � : %.2f ", resultado1);
			break;
		case 3: 
			float resultado2 = primeiroValor * segundoValor; 
			System.out.printf("Valor da Multiplica��o � : %.2f ", resultado2);
			break;			
		case 4:
			if(segundoValor != 0) {
			float resultado3 = primeiroValor / segundoValor;
			System.out.printf("Valor da Divis�o � : %.2f ", resultado3);
			}else {
				System.out.println("O Segundo valor n�o pode Zero para Divis�o ");
			}
			break;

	}

		teclado.close();


	}

}
