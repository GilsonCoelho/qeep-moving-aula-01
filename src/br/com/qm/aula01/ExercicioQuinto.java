package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioQuinto {

	//5. Leia um numero real e imprima a quinta parte deste número.
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Quinta parte do Número##");
		
		System.out.println("Digite o número: ");
		float primeiroLido = teclado.nextFloat();
		
		float quintaparte = primeiroLido / 5F;
		
		System.out.printf("A quinta parte de %.2f é : %.2f", primeiroLido, quintaparte);
		teclado.close();
		

	}

}
