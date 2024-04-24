package listaum;

import java.util.Scanner;

public class ExecDois {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int pares = 0, impares = 0, num;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite um número");
			num = leia.nextInt();
			if(num % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}
		
		System.out.println("Total de números pares: " + pares 
				+ "\nTotal de números impares: " + impares);
	}
}
