package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioDoze {

	// 12. Fa�a um programa que pergunte o pre�o de tr�s produtos e informe qual
	// produto voc� deve comprar, sabendo que a decis�o � sempre pelo mais
	// barato.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("## 	QUAL DOS TR�S � O MAIS BARATO ##");

		System.out.println("Digite o Pre�o do Primeiro Produto: ");
		float primeiroProduto = teclado.nextFloat();

		System.out.println("Digite o Pre�o do Segundo Produto: ");
		float segundoProduto = teclado.nextFloat();

		System.out.println("Digite o Pre�o do Terceiro Produto: ");
		float terceiroProduto = teclado.nextFloat();

		if (primeiroProduto == segundoProduto && primeiroProduto == terceiroProduto) {
			System.out.println("Tanto faz, todos os produtos tem o mesmo pre�o");
		} else if (primeiroProduto < segundoProduto && primeiroProduto < terceiroProduto) {
			System.out.println("O Primeiro Produto � mais barato");
		} else if (segundoProduto < primeiroProduto && segundoProduto < terceiroProduto) {
			System.out.println("O Segundo Produto � mais barato");
		} else {
			System.out.println("O Terceiro Produto � mais barato");
		}

		teclado.close();

	}

}
