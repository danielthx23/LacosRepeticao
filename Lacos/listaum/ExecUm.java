package listaum;

import java.util.Scanner;

public class ExecUm {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num1, num2;

		System.out.println("Insira o primeiro número: ");
		num1 = leia.nextInt();
		System.out.println("Insira o segundo número (deve ser maior que o primeiro):");
		num2 = leia.nextInt();

		if (num1 < num2) {
			System.out.println("No Intervalo entre " + num1 + " e " + num2 + ":" + "\n");
			for (; num1 < num2; num1++) {
				if (num1 % 3 == 0 && num1 % 5 == 0) {
					System.out.println("O número " + num1 + " é multiplo de 3 e 5");
				}
			}
		} else {
			System.out.println("Intervalo inválido!");
		}

	}

}
