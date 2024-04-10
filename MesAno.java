package estrutura_condicional;

import java.util.Scanner;

public class MesAno {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
int mes;
		
		System.out.println("(Informe o mês do ano (1 - 12): ");
		 mes = ler.nextInt();
		
		switch (mes)  {
		case 1:
			System.out.println("O mês escolhido foi Janeiro.");
			break;
		case 2:
			System.out.println("O mês escolhido foi Fevereiro.");
			break;
		case 3:
			System.out.println("O mês escolhido foi Março.");
			break;
		case 4:
			System.out.println("O mês escolhido foi Abril.");
			break;
		case 5:
			System.out.println("O mês escolhido foi Maio");
			break;
		case 6:
			System.out.println("O mês escolhido foi Junho.");
			break;
		case 7:
			System.out.println("O mês escolhido foi Julho.");
			break;
		case 8:
			System.out.println("O mês escolhido foi Agosto.");
			break;
		case 9:
			System.out.println("O mês escolhido foi Setembro.");
			break;
		case 10:
			System.out.println("O mês escolhido foi Outubro.");
			break;
		case 11:
			System.out.println("O mês escolhido foi Novembro");
			break;
		case 12:
			System.out.println("O mês escolhido foi Dezembro.");
			break;
		
		default:
			System.out.println("O mês escolhido é inválido, escolha um de 1 - 12.");
			

	}
	}
}
