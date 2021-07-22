package br.com.qm.aula02;

import java.util.Scanner;

public class ExerciccioTreze {

	// 13. Faça um programa para a leitura de duas notas parciais de um aluno. O
	// programa deve calcular a média alcançada por aluno e apresentar:
	// A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
	// A mensagem "Reprovado", se a média for menor do que sete;
	// A mensagem "Aprovado com Distinção", se a média for igual a dez.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("## 	ALUNO APROVADO OU REPROVADO ##");

		System.out.println("Digite a Nota da Primeira Prova: ");
		float primeiroNota = teclado.nextFloat();

		System.out.println("Digite a Nota da Segunda Prova: ");
		float segundoNota = teclado.nextFloat();

		float media = (primeiroNota + segundoNota) / 2F;

		if (media == 10F) {
			System.out.println("Aluno Aprovado com Distinção");
		} else if (media < 10F && media >= 7F) {
			System.out.println("Aluno Aprovado");
		} else {
			System.out.println("Aluno Reprovado");
		}

		teclado.close();

	}

}
