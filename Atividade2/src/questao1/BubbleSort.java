package questao1;

public class BubbleSort extends Ordenadores{

	@Override
	public int[] ordena(int[] vetor) {
		long tempStart = System.currentTimeMillis();
		for(int k = vetor.length; k>= 1; k--) {
			for(int x= 1; x< 1; x++) {
				if(vetor[x - 1] > vetor[x]) {
					int var = vetor[x];
					vetor[x] = vetor[x - 1];
					vetor[x - 1] = var;
				}
			}
		}
	    long tempEnd = System.currentTimeMillis();
		long totTemp = (tempEnd - tempStart);
		System.out.println("Tempo levado de processo: "+ totTemp);
		return vetor;
	}

	
}
