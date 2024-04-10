package estrutura_condicional;

import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int dia;
		
		System.out.println("(Informe o dia da semana: ");
		 dia = ler.nextInt();
		
		switch (dia)  {
		case 1:
			System.out.println("O dia escolhido foi Segunda.");
			break;
		case 2:
			System.out.println("O dia escolhido foi Terça.");
			break;
		case 3:
			System.out.println("O dia escolhido foi Quarta.");
			break;
		case 4:
			System.out.println("O dia escolhido foi Quinta.");
			break;
		case 5:
			System.out.println("O dia escolhido foi Sexta");
			break;
		case 6:
			System.out.println("O dia escolhido foi Sábado.");
			break;
		case 7:
			System.out.println("O dia escolhido foi Domingo.");
			break;
			
		default:
			System.out.println("O dia escolhido é inválido, escolha um de 1 - 7.");
			
		
		}
	}

}
