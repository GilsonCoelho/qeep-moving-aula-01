package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioOnze {

	//11. Faça um Programa que leia três números e mostre o maior deles.
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("## 	QUAL DOS TRÊS NÚMERO É MAIOR ##");
		
		System.out.println("Digite o Primeiro Número: ");
		int primeiroNumero = teclado.nextInt();
		
		System.out.println("Digite o Segundo Número: ");
		int segundoNumero = teclado.nextInt();
		
		System.out.println("Digite o Terceiro Número: ");
		int terceiroNumero = teclado.nextInt();

				
		if(primeiroNumero == segundoNumero && primeiroNumero == terceiroNumero) {
			
			System.out.println("Todos os números são iguais ");
		}
		
		
		else if (primeiroNumero > segundoNumero) {
			
			if (primeiroNumero > terceiroNumero) {
			
			System.out.printf("O número %d é o maior de Todos",primeiroNumero );
			} else { 
				System.out.printf("O número %d é o maior de Todos",terceiroNumero );
			}
		} else {
			
			if (segundoNumero > terceiroNumero) {
				
				System.out.printf("O número %d é o maior de Todos",segundoNumero );
				} else { 
					System.out.printf("O número %d é o maior de Todos",terceiroNumero );
				}
			
		}
						
		teclado.close();


	}

}
