package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioOnze {

	//11. Fa�a um Programa que leia tr�s n�meros e mostre o maior deles.
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("## 	QUAL DOS TR�S N�MERO � MAIOR ##");
		
		System.out.println("Digite o Primeiro N�mero: ");
		int primeiroNumero = teclado.nextInt();
		
		System.out.println("Digite o Segundo N�mero: ");
		int segundoNumero = teclado.nextInt();
		
		System.out.println("Digite o Terceiro N�mero: ");
		int terceiroNumero = teclado.nextInt();

				
		if(primeiroNumero == segundoNumero && primeiroNumero == terceiroNumero) {
			
			System.out.println("Todos os n�meros s�o iguais ");
		}
		
		
		else if (primeiroNumero > segundoNumero) {
			
			if (primeiroNumero > terceiroNumero) {
			
			System.out.printf("O n�mero %d � o maior de Todos",primeiroNumero );
			} else { 
				System.out.printf("O n�mero %d � o maior de Todos",terceiroNumero );
			}
		} else {
			
			if (segundoNumero > terceiroNumero) {
				
				System.out.printf("O n�mero %d � o maior de Todos",segundoNumero );
				} else { 
					System.out.printf("O n�mero %d � o maior de Todos",terceiroNumero );
				}
			
		}
						
		teclado.close();


	}

}
