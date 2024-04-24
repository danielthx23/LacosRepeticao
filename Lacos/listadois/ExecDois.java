package listadois;

import java.util.Scanner;

public class ExecDois {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int idade, genero, dev, contador = 0, backend = 0, mulheresFront = 0, homemMaiores = 0, binaryMenores = 0,
				idadeTotal = 0;
		String escolha = "s";

		while (!escolha.equalsIgnoreCase("n")) {
			System.out.print("Informe sua idade: ");

			idade = leia.nextInt();
			idadeTotal += idade;

			System.out.println("Qual sua identidade de genêro: " + "\n1 – Mulher Cis" + "\n2 – Homem Cis"
					+ "\n3 – Não Binário" + "\n4 – Mulher Trans" + "\n5 – Homem Trans" + "\n6 – Outros");

			genero = leia.nextInt();

			System.out.println(
					"Qual sua área: " + "\n1 – Backend" + "\n2 – Frontend" + "\n3 – Mobile" + "\n4 – Fullstack");

			dev = leia.nextInt();

			contador++;

			if (dev == 1) {
				backend++;
			} else if (genero == 1 || genero == 4 && dev == 2) {
				mulheresFront++;
			} else if (genero == 2 || genero == 5 && dev == 3 && idade > 40) {
				homemMaiores++;
			} else if (genero == 3 && dev == 4 && idade < 30) {
				binaryMenores++;
			}

			leia.nextLine();
			System.out.print("Deseja continuar (S/N): ");
			escolha = leia.nextLine();
		}

		System.out.println("Total de pessoas desenvolvedoras Backend: " + backend
				+ "\nTotal de Mulheres Cis e Trans desenvolvedoras Frontend: " + mulheresFront
				+ "\nTotal de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + homemMaiores
				+ "\nTotal de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + binaryMenores
				+ "\nO número total de pessoas que responderam à pesquisa: " + contador
				+ "\nA média de idade das pessoas que responderam à pesquisa: " + (idadeTotal / contador));

	}

}
