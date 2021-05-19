package br.com.qm.aula02;

import java.util.Scanner;

public class ExcercicioDois {

	//2. Leia uma velocidade em km/h (quilometros por hora) e apresente-a
	//convertida em m/s (metros por segundo).
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("## Converta KM/h para m/s##");
		
		System.out.println("Digite a velocidade em KM/h: ");
		float velociadeKM = teclado.nextFloat();
		
		float velociadem = velociadeKM * 3.6F;
		System.out.printf("O valor %.2f KM/h equivale á %.2f m/s", velociadeKM, velociadem);
				
		teclado.close();

	}

}
