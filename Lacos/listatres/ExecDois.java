package listatres;

import java.util.Scanner;

public class ExecDois {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num = 0, contador = 0, soma = 0;
		
		do {
			System.out.print("Digite um número: ");
			num = leia.nextInt();
			
			if(num % 3 == 0) {
				soma += num;
			}
			
			contador++;
		} while(num != 0);
		
		System.out.println("A média de todos os números múltiplos de 3 é: " + (soma/contador));
		
	}

}
