package questao1;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
	
    Scanner leitor = new Scanner(System.in);   
	Ordenadores ordem = new Ordenadores();
	
	int opt = 0;
	boolean acabou = false;
	
	System.out.println("Voce escolhe a quantidade de número em um vetor: ");
	System.out.println("Informe o tamanho: ");
	int taman = Integer.parseInt(leitor.nextLine());
	int[] vetor = new int[taman];
	for(int k=0; k<vetor.length; k++) {
	    System.out.println("Informe o número: ");
	    int num = Integer.parseInt(leitor.nextLine());
	    vetor[k] = num;
	}
	
	while(!acabou) {
		
		System.out.println("\nOpções:\n1 Bubble Sort\n2 Insertion Sort\n3 Merge Sort\n4 Quick Sort\n5 Sair");
		opt = Integer.parseInt(leitor.nextLine()); 
		
		switch(opt) {
		
		case 1:
			
			System.out.println("Bubble Sort...");
			ordem = new BubbleSort();	
			int[]array = ordem.ordena(vetor);
			for(int k=0; k<array.length; k++) {
			    System.out.print(array[k]+" ");
			}
			break;
			
		case 2:
			
			 System.out.println("Insertion Sort...");
			 ordem = new InsertionSort();
			 int[] list = ordem.ordena(vetor); 
			 for(int k=0; k<list.length; k++) {
			    System.out.print(list[k]+" ");
			 }
			 break;
			 
		case 3:
			
			System.out.println("Merge Sort...");
			ordem = new MergeSort();
			int[] lista = ordem.ordena(vetor); 
			 for(int k=0; k<lista.length; k++) {
			    System.out.print(lista[k]+" ");
			 }
	         break;
	         
		case 4:
			
			System.out.println("Quick Sort...");
			ordem = new QuickSort();
			System.out.println("Deve informar início: ");
			int inicio = Integer.parseInt(leitor.nextLine());
			System.out.println("Deve informar fim: ");
			int fim = Integer.parseInt(leitor.nextLine());
			if(fim >= vetor.length) {
				System.out.println("ERRO!\nVocê escolheu um número maior que o vetor!");
				continue;
			}
			int[] resp = ordem.quick(vetor, inicio, fim);
			for(int k=0; k<resp.length; k++) {
			    System.out.print(k+" ");
			 }
			break;
			   
		case 5:
			
		  System.out.println("Saindo...");
		  acabou = true;
		  
		    }		
	    }
	leitor.close();
	}
}
