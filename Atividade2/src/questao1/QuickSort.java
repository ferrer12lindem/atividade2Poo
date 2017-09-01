package questao1;

public class QuickSort extends Ordenadores{

	
	public int[] quick(int[] vetor, int ini, int fim) {
		
		int meio;
		
		if(ini < fim) {
			
			meio = partition(vetor, ini, fim);
			
			quick(vetor, ini, meio);
			quick(vetor, meio + 1, fim);
		}
		
		return vetor;
	}
		
	public int partition(int vetor[], int ini, int fim) {
		
		int pivo = 0;
		int topo = 0;
		int i = 0;
		
		topo = ini;
		
		for(i = ini + 1; i <= fim; i++) {
			if(vetor[i] < pivo) {
				vetor[topo] = vetor[i];
				vetor[i] = vetor[topo + 1];
				
				topo++;
			}
		}
		
		vetor[topo] = pivo;
		return topo;
	}
	
	

}
