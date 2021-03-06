package br.com.qm.aula05;

import java.util.Scanner;

public class ProgramaPrincipal {

	// 1. Crie uma fun??o que recebe como par?metro um
	// n?mero inteiro e devolve o seu dobro.

	// 2. Fa?a uma fun??o que receba 3 n?meros inteiros
	// como par?metro, representando horas, minutos e segundos, e os converta em
	// segundos.

	// 3. Fa?a uma fun??o que receba uma temperatura em
	// graus Celsius e retorne-a convertida em graus Fahrenheit.

	// 4. Fa?a uma fun??o que receba a altura e
	// o raio de um cilindro circular e retorne o volume do cilindro.
	public static void dobro(Scanner teclado) {
		// 96
		System.out.println("Digite um valor e eu mostrarei o seu dobro:");
		int numero = teclado.nextInt();
		System.out.printf("O dobro do n?mero ?: %d\n", numero * 2);
	}

	/// (C ? 9/5) + 32 = F
	public static float celsiusParaFarenheit(float celsius) {
		float farenheit = (celsius * (9 / 5F)) + 32;
		// 41
		return farenheit;
	}

	public static void imprimeLinhas(int qtdLinhas) {

		for (int i = 0; i < qtdLinhas; i++) {
			System.out.println("------------------------");
		}

	}

	public static String menorValor(float primeiroProduto, float segundoProduto, float terceiroProduto) {

		if (primeiroProduto == segundoProduto && segundoProduto == terceiroProduto) {
			return "Tanto faz, todos os produtos tem o mesmo pre?o.";
		} else if (primeiroProduto < segundoProduto && primeiroProduto < terceiroProduto) {
			return "Compre o primeiro produto.";
		} else if (segundoProduto < primeiroProduto && segundoProduto < terceiroProduto) {
			return "Compre o segundo produto.";
		} else {
			return "Compre o terceiro produto.";
		}

	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("## EXERCITANDO MENUS ##");

		int opcaoMenu = 0;
		do {
			imprimeLinhas(2);
			System.out.println("Escolha uma das opera??es ? seguir");
			System.out.println("Digite 1 para a fun??o dobro");
			System.out.println("Digite 2 para a convers?o de Celsius para Farenheit");
			System.out.println("Digite 3 para a escolha ");
			System.out.println("Digite 0 para sair");
			imprimeLinhas(2);
			opcaoMenu = teclado.nextInt();

			switch (opcaoMenu) {
			case 0:
				System.out.println("Obrigado por usar o nosso programa!");
				break;
			case 1:
				dobro(teclado);
				break;
			case 2:
				System.out.println("Digite um valor em Celsius e eu converterei para Farenheit");
				float tempCelsius = teclado.nextFloat();
				float tempFarenheit = celsiusParaFarenheit(tempCelsius);
				System.out.printf("A temperatura em Farenheit ? %.2f", tempFarenheit);
				break;
			case 3:
				System.out.println("Digite o primeiro valor: ");
				float primeiroProduto = teclado.nextFloat();
				System.out.println("Digite o segundo valor: ");
				float segundoProduto = teclado.nextFloat();
				System.out.println("Digite o terceiro valor: ");
				float terceiroProduto = teclado.nextFloat();
				System.out.println(menorValor(primeiroProduto, segundoProduto, terceiroProduto));
			default:
				System.out.println("Digite uma op??o v?lida!");
			}

		} while (opcaoMenu != 0);

//		imprimeLinhas(10);
//		
//		Scanner teclado = new Scanner(System.in);
//		System.out.println("## EXEMPLO DE EXECU??O DAS FUN??ES ##");
//		

//		
//		imprimeLinhas(5);
//		

//		
//		imprimeLinhas(1);
//		teclado.close();
	}

}