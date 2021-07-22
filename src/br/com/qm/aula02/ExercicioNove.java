package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioNove {

	// 9. Leia o salário de um trabalhador e o valor da prestação de um empréstimo.
	// Se a prestação for maior que 20% do salário imprima: "Empréstimo não
	// concedido", caso contrário imprima: "Empréstimo concedido"

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("## 	APROVA OU NÃO O EMPRÉSTIMO##");

		System.out.println("Digite o Salário: ");
		float salario = teclado.nextFloat();

		System.out.println("Digite o Valor da Prestação do Empréstimo: ");
		float valorPrestacao = teclado.nextFloat();

		boolean emprestimoConcedido = valorPrestacao < salario * 0.20F;
		// float Valor20 = salario *0.20F;

		if (emprestimoConcedido) {

			System.out.println("Empréstimo Concedido ");

		} else {

			System.out.println("Empréstimo não Concedido ");
		}

		teclado.close();
	}

}
