package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioQuinto {

	//5. Faça um programa que leia o valor de um produto e imprima o valor com
	//desconto, tendo em vista que o desconto foi de 12%.
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("## CALCULA O DESCONTO DO PRODUTO##");
		
		System.out.println("Digite o valor do produto: ");
		float Valorproduto = teclado.nextFloat();
		
		
		float valorComDesconto = Valorproduto * 0.88F;
		
		System.out.printf("O valor com desconto é: %.2f", valorComDesconto);
				
		teclado.close();


	}

}
