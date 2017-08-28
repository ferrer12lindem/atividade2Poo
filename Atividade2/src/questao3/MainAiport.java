package questao3;

import java.util.Scanner;

public class MainAiport {

	public static void main(String args[]) {

		Scanner enter = new Scanner(System.in);
		System.out.println("\n--------- Aeroporto Castro Pinto ---------");
		System.out.print("Informe um número de voo: ");
		int numero = Integer.parseInt(enter.nextLine());
		
		Company empresa = new Company("GOL", "Internacionais", 34435); 
		Horario horario = new Horario(12, 22);
		System.out.println("O voo para já partiu? " );
		boolean partiuOrNot = enter.hasNext();
		
//		System.out.println("Digite o nome do passageiro: ");
//		String nome = enter.nextLine();		
		System.out.println("Digite o destino do voo: ");
		String nomeViagem = enter.next();
		
		Voo voo = new Voo(numero, empresa, horario, partiuOrNot);
		voo.setPartiuOuNao(partiuOrNot);
		
		TotemHoraEmbarqueEDesembarque person = new Person("", nomeViagem, horario);

		

	enter.close();
	}
}
