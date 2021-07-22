package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioDoze {

	// 12. Faça um programa que pergunte o preço de três produtos e informe qual
	// produto você deve comprar, sabendo que a decisão é sempre pelo mais
	// barato.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("## 	QUAL DOS TRÊS É O MAIS BARATO ##");

		System.out.println("Digite o Preço do Primeiro Produto: ");
		float primeiroProduto = teclado.nextFloat();

		System.out.println("Digite o Preço do Segundo Produto: ");
		float segundoProduto = teclado.nextFloat();

		System.out.println("Digite o Preço do Terceiro Produto: ");
		float terceiroProduto = teclado.nextFloat();

		if (primeiroProduto == segundoProduto && primeiroProduto == terceiroProduto) {
			System.out.println("Tanto faz, todos os produtos tem o mesmo preço");
		} else if (primeiroProduto < segundoProduto && primeiroProduto < terceiroProduto) {
			System.out.println("O Primeiro Produto é mais barato");
		} else if (segundoProduto < primeiroProduto && segundoProduto < terceiroProduto) {
			System.out.println("O Segundo Produto é mais barato");
		} else {
			System.out.println("O Terceiro Produto é mais barato");
		}

		teclado.close();

	}

}
