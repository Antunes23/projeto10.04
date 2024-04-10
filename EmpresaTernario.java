package estrutura_condicional;

import java.util.Scanner;

public class EmpresaTernario {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a;
		
		System.out.println("Quantos anos de empresa você tem?");
		a = ler.nextInt();
		
		if (a == 3) {
			System.out.println("Você vai receber 5% a mais no seu salário");
		}
		else if (a >3) {
			System.out.println("Você vai receber 7% a mais no seu salário");
		}
		else
			System.out.println("Você não tem tempo suficiente de empresa para ganhar a promoção");
		
		
		

	}

}
