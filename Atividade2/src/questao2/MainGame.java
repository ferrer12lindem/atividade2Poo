package questao2;

import java.util.Scanner;

public class MainGame {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// Aqui o usuário vai poder escolher o seu guerreiro e o adversário dele:
		System.out.print(
				"\n\t\tGuerreiros:\n1 Guerreiro Puro\n2 Mago Puro\n3 Tank Mage\n4 Warlock\nDigite o número do seu guerreiro: ");
		int escolhaUmGuerreiro = Integer.parseInt(entrada.next());

		String nome = "";
		int life = 0;
		String adversario = "";

		if (escolhaUmGuerreiro == 1 || escolhaUmGuerreiro == 2 || escolhaUmGuerreiro == 3 || escolhaUmGuerreiro == 4) {

			System.out.print("Digite o nome do seu guerreiro: ");
			nome = entrada.nextLine();

			System.out.print("Escolha seu Guerreiro, precisa ser o tipo do seu guerreiro: ");
			adversario = entrada.next();
			System.out.println(
					"\nO seu guerreiro e o adversário, começarão com o mesmo número de vida que você escolher. A seguir: ");
			System.out.println("Digite a vida limite deles: ");
			life = Integer.parseInt(entrada.next());

			Arma arma = new Machado();
			Guerreiro guerreiro = new Guerreiro(nome, life, arma);
			
			int option = 0;
			Armadura armadura = new Couro();
			String escolheArmadura = "";
			int opt = 0;
			
			boolean acabou = false;
			
			do {

			System.out.println("Escolha a arma:\n1 Machado\n2 Alabarda\n3 Katana\n4 Sair");
			opt = Integer.parseInt(entrada.next());

			System.out.print("Deseja escolher uma armadura,Sim ou Não?\nDigite só n ou s: ");
			escolheArmadura = entrada.next();


			// Se o usuário não quiser armadura para seu guerreiro, apenas digite "n" no
			// console:
			if (escolheArmadura.equals("n")) {

					switch (opt) {

					case 1:
						System.out.println("Pegando Machado...");
						arma = new Machado();
						System.out.println("Ataca adversário...Dano levado: " + arma.atacar());
						break;

					case 2:
						System.out.println("Pegando Alabarda...");
						arma = new Alabarda();
						System.out.println("Ataca adversário...Dano levado: " + arma.atacar());
						break;

					case 3:
						System.out.println("Pegando Katana...");
						arma = new Katana();
						System.out.println("Ataca adversário...Dano levado: " + arma.atacar());

						break;

					case 4:

						System.out.println("Abandonando jogo...");
						acabou = true;
					}

					/* Aqui diz o total de vidas do adversário, levando em conta 
					se o guerreiro do usuário não escolheu armadura. */
					System.out.println("Vidas do adversário: " + adversario + ": " + guerreiro.getLife());
//				} while (acabou);

				// Se o usuário quer armadura para seu guerreiro. Ele pode escolher:
			} else if (escolheArmadura.equals("s")) {

				System.out.println("\nEscolha a sua armadura:\n1 Couro\n2 Loriga\n3 Titânio");
				option = Integer.parseInt(entrada.next());

				switch (option) {

				case 1:
					System.out.println("Pega armadura de couro");
					armadura = new Couro();
					if (opt == 1) {

						arma = new Machado();
						System.out.print("Se defende...\nDano levado: ");
						System.out.println(arma.atacar() - armadura.defender());
					} else if (opt == 2) {

						arma = new Alabarda();
						System.out.print("Se defende...\nDano levado: ");
						System.out.println(arma.atacar() - armadura.defender());
					} else if (opt == 3) {

						arma = new Katana();
						System.out.print("Se defende...\nDano levado: ");
						System.out.println(arma.atacar() - armadura.defender());
					} else if (opt == 4) {

						System.out.print("Resultado...");

					}
					break;

				case 2:
					System.out.println("Pega a armadura de loriga");
					armadura = new Loriga();
					if (opt == 1) {

						arma = new Machado();
						System.out.print("Se defende...\nDano levado: ");
						System.out.println(arma.atacar() - armadura.defender());
					} else if (opt == 2) {

						arma = new Alabarda();
						System.out.print("Se defende...\nDano levado: ");
						System.out.println(arma.atacar() - armadura.defender());
					} else if (opt == 3) {

						arma = new Katana();
						System.out.print("Se defende...\nDano levado: ");
						System.out.println(arma.atacar() - armadura.defender());
					} else if (opt == 4) {

						System.out.print("Resultado...");
					}
					break;

				case 3:
					System.out.println("Pega a armadura de titânio");
					armadura = new Titanio();
					if (opt == 1) {
						arma = new Machado();
						System.out.print("Se defende...\nDano levado: ");
						System.out.println(arma.atacar() - armadura.defender());
					} else if (opt == 2) {
						arma = new Alabarda();
						System.out.print("Se defende...\nDano levado: ");
						System.out.println(arma.atacar() - armadura.defender());
					} else if (opt == 3) {
						arma = new Katana();
						System.out.print("Se defende...\nDano levado: ");
						System.out.println(arma.atacar() - armadura.defender());
					} else if (opt == 4) {
						System.out.print("Resultado...");

					}

					break;
				}

				// Aqui diz quantas vidas tem o adversário atualmente, se o guerreiro do usuário escolheu uma armadura
				System.out.println("Vidas do adversário: " + adversario + ": " + guerreiro.getLife());

			} else {
				System.out.println("Opção inválida! Você precisa digitar apenas 's' ou 'n'\n");
			}

		}while (!acabou); 
		 
		}else {
			System.out.println("A opção de Guerreiro digitada não existe\nTente de novo");
		}
		entrada.close();
	}
}
