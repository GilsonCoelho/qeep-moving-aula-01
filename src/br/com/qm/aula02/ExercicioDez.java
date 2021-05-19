package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioDez {

	//10. Faça um algoritmo que calcule a média ponderada das notas de 3 provas.
	//A primeira e a segunda prova tem peso 1 e a terceira tem peso 2. Ao final,
	//mostrar a média do aluno e indicar se o aluno foi aprovado ou reprovado. A
	//nota para aprovação deve ser igual ou superior a 60 pontos.
	
	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("## 	ALUNO APROVADO OU REPROVADO ##");
		
		System.out.println("Digite a Nota da Primeira Prova: ");
		int primeiroNota = teclado.nextInt();
		
		System.out.println("Digite a Nota da Segunda Prova: ");
		int segundoNota = teclado.nextInt();
		
		System.out.println("Digite a Nota da Terceira Prova: ");
		int terceiraNota = teclado.nextInt();

		int media = (( primeiroNota + segundoNota)+(terceiraNota * 2))/4;
		
		if (media >= 60) {
			
			System.out.println("Aluno Aprovado");
			
		}  else  {
			
			System.out.println("Aluno Reprovado");
		}
						
		teclado.close();

	}

}
