package questao3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainAiport {

	public static void main(String args[]) {
                
		/*Passos 1: Os totens são notificados sempre que i) algum voo tiver suas informações
         atualizadas; ii) quando um novo voo for adicionado à base de dados; ou iii)
         quando um voo for removido da base de dados. 
		 Passo 2: Primeiro Totem deve fazer com que os passageiros devam saber os horários atuais para evitar possíveis atrasos
		 e o segundo Totem deve mostrar o horário de aterrissagem dos parentes, para evitar atrasos literalmente.*/ 
		 
		Scanner enter = new Scanner(System.in);
		System.out.println("\n--------- Aeroporto Castro Pinto ---------\n");
		
		List<Voo> voos = new ArrayList<Voo>(); 		
		Voo voo = new Voo(1234, "Gol", 15.00, 16.00, true);
		Voo voo2 = new Voo(1246, "Gol", 14.00, 17.00, true);
		Voo voo3 = new Voo(1245, "Gol", 20.00, 18.00, true);
		Voo voo4 = new Voo(1246, "Gol", 21.00, 19.00, true);
		
		voos.add(voo);
		voos.add(voo2);
		voos.add(voo3);
		voos.add(voo4);
		
		Airport aeroporto = new Airport(voos);
		Totem totem1 = new Totem(aeroporto);
		boolean acabou = false;
		int opt = 0;		
		while(acabou != true) {
			System.out.print("Opções:\n1 Adicionando Voo\n2 Removendo Voo\n3 Sair\nDigite a opção: ");
		    opt = Integer.parseInt(enter.nextLine());
		    switch(opt) {
		    case 1:
			    System.out.println("Adicionando voo...");
				aeroporto.adicionaVoo(voo);
				for(int k=0; k<voos.size(); k++) {
				    System.out.print("Voo: "+k+"\nHora de chegada: "+voo.getHoraChegada()+"\n\n");
				}
				break;
		    case 2:
				System.out.println("Removendo voo...");
			    aeroporto.removeVoo(voo2);
			    System.out.print("Hora de saída: "+voo2.getHoraSaida()+"\n\n");
			    break;
			    
		    case 3:
				System.out.println("Sair...");
				acabou = true;
		    }
	    }		
	enter.close();
    }
}