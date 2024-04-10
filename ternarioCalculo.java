package estrutura_condicional;

import java.util.Scanner;

public class ternarioCalculo {

	public static void main(String[] args) {
		
		double a;
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe um valor: ");
		a = ler.nextDouble();
		
		
		String msg = a % 5== 0 ? "O número " + a + " é multiplo de 5" : "O número " + a + "não é multiplo de 5";
System.out.println(msg);
	}

}
