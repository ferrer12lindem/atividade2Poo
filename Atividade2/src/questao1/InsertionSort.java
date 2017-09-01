package questao1;

public class InsertionSort extends Ordenadores {

	@Override
	public int[] ordena(int[] vetor) {
        long tempoInicio = System.currentTimeMillis();
        for(int k=0; k<vetor.length; k++) {
        	int atual = vetor[1];
        	int i = k -1;
        	while(i >= 0 && vetor[i] >= atual) {
        		vetor[i + 1] = vetor[i];
        		i--;
        	}
        vetor[i + 1] = atual;
        }
        long tempoFim = System.currentTimeMillis();
        long tempoTotal = tempoFim - tempoInicio;
        System.out.println("Tempo levado de processo: "+tempoTotal);
		return vetor;
	}

}
