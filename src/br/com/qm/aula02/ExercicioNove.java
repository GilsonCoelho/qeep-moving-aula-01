package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioNove {

	// 9. Leia o sal�rio de um trabalhador e o valor da presta��o de um empr�stimo.
	// Se a presta��o for maior que 20% do sal�rio imprima: "Empr�stimo n�o
	// concedido", caso contr�rio imprima: "Empr�stimo concedido"

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("## 	APROVA OU N�O O EMPR�STIMO##");

		System.out.println("Digite o Sal�rio: ");
		float salario = teclado.nextFloat();

		System.out.println("Digite o Valor da Presta��o do Empr�stimo: ");
		float valorPrestacao = teclado.nextFloat();

		boolean emprestimoConcedido = valorPrestacao < salario * 0.20F;
		// float Valor20 = salario *0.20F;

		if (emprestimoConcedido) {

			System.out.println("Empr�stimo Concedido ");

		} else {

			System.out.println("Empr�stimo n�o Concedido ");
		}

		teclado.close();
	}

}
