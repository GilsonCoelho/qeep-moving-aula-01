  
package br.com.qm.aula04;

import java.util.Scanner;

public class ExercicioSete {

	//Escreva um programa que leia 10 n�meros inteiros
	//e os armazene em um vetor. Imprima o vetor, 
	//o maior elemento e a posi��o que ele se encontra.
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("## MAIOR MENOR DENTRO DE UM VETOR ##");
		int[] numerosLidos = new int[10];
		int maior = 0;
		int posicao = 0;
		
		for (int i = 0; i < numerosLidos.length; i++) {
			System.out.println("Digite um valor: "); 
			numerosLidos[i] = teclado.nextInt();
			
			if (numerosLidos[i] > maior) {
				maior = numerosLidos[i];
				posicao = i;
			
			}
			}
		System.out.printf("O Maior n�mero lido � %d e ele se encontra na posi��o %d\n", 
				maior, posicao);
		
		teclado.close();
		
	}
}