package br.com.qm.aula03;

import java.util.Scanner;

public class ExercicioTres {
	
	//1. Escreva um programa que escreva na tela, de 1 até 100, de 1 em 1, 3 vezes.
	// A primeira vez com "for", a segunda com "while" e a terceira com "do while".
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("## FOR ##");
		for (int i = 1 ; i <= 100 ; i++) {
			System.out.printf("%d\n",i);			
		}
		
		System.out.println("## WHILE ##");
		int i = 1;
		while (i<=100) {
			
			System.out.printf("%d\n",i);
			i++;
		}
		
		
		System.out.println("## DO WHILE##");
		int j = 1;
		
		do{
			System.out.printf(" %d \n", j );
			j++;
		} while( j <= 100);
		
		teclado.close();


	}

}
