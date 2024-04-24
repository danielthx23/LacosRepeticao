package listadois;

import java.util.Scanner;

public class ExecUm {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int menores = 0, maiores = 0, idade = 0;
		
		while(idade >= 0) {
			System.out.print("Digite uma idade: ");
			idade = leia.nextInt();
			
			if(idade < 21) {
				menores++;
			} else if (idade > 50) {
				maiores++;
			}
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + menores
				+ "\nTotal de pessoas maiores de 50 anos: " + maiores);
	}
}
