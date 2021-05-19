package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioTres {

	//3. Implemente um programa que calcule o ano de nascimento de uma
	//pessoa a partir de sua idade e o ultimo ano que fez anivesário.
	public static void main(String[] args) {


		Scanner teclado = new Scanner(System.in);
		
		System.out.println("## CALCULA O ANO DE NASCIMENTO##");
		
		System.out.println("Digite a sua idade em Anos: ");
		int idade = teclado.nextInt();
		
		System.out.println("Digite ultimo ano que fez anivesário: ");
		int anoAtual = teclado.nextInt();
		
		int AnoNascimento = anoAtual-idade;
		System.out.printf("Para idade %d o Ano de Nascimento é %d", idade, AnoNascimento);
				
		teclado.close();

	}

}
