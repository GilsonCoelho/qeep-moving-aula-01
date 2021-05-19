package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioQuatro {

	//4. Receba a altura do degrau de uma escada e a altura que o usuário deseja
	//alcançar subindo a escada. Calcule e mostre quantos degraus o usuário
	//deverá subir para atingir seu objetivo
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("## CALCULA A QUANTIDADE DE DEGRAUS##");
		
		System.out.println("Digite a altura do degraus: ");
		float alturaDegrau = teclado.nextFloat();
		System.out.println("Digite a altura da escada: ");
		float altura = teclado.nextFloat();
		
		float quantidadeDeDegraus = ( altura * 100 ) / alturaDegrau;
		System.out.printf("A quantidade de degraus é %.0f", quantidadeDeDegraus);
				
		teclado.close();


	}

}
