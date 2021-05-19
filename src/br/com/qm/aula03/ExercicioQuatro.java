package br.com.qm.aula03;

import java.util.Scanner;

public class ExercicioQuatro {

	//2. Faça um programa que leia n inteiros e imprima sua média.
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("## Media dos Números digitados ##");
		System.out.println(" Digite quantos numeros para fazer a média");
		int qtNumero = teclado.nextInt();
  
		int soma = 0;
		
		for (int i = 1 ; i <= qtNumero ; i++) {
			System.out.printf(" Digite um Numero %d : ",i);
			soma += teclado.nextInt();
			//soma = soma + numero;
		}
		float media = soma / (float) qtNumero;
		System.out.printf(" A média dos numeros digitados é: %.2f",media);
		//System.out.println("digite um numero:");
		//soma = soma + numero ;	
		
		teclado.close();
	}

}
