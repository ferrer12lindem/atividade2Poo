package questao3;

public class Voo{  //Observer
	
	private int numDeVoo;
	private String business;
	private double horaSaida;
	private double horaChegada;
	private boolean partiuOuNao;
	
	public Voo(int numDeVoo, String business, double horaSaida, double horaChegada, boolean partiuOuNao) {
		this.horaSaida = horaSaida;
		this.horaChegada = horaChegada;
		this.numDeVoo = numDeVoo;
		this.business = business;
		this.partiuOuNao = partiuOuNao;
	}
	
	
	public void setPartiuOuNao(boolean parteOuNao) {
    	this.partiuOuNao = parteOuNao;
    }
	
	public int getNumDeVoo() {
		return this.numDeVoo;
	}
	
	public void setNumDeVoo(int numDeVoo) {
		this.numDeVoo = numDeVoo;
	}
	
	public String getEmpresa() {
		return this.business;
	}
	
    public void setEmpresa(String empresa) {
    	this.business = empresa;
    }
    
    public boolean getPartiuOuNao() {
    	return this.partiuOuNao;
    }

	public double getHoraSaida() {
		return horaSaida;
	}


	public void setHoraSaida(double horaSaida) {
		this.horaSaida = horaSaida;
	}


	public double getHoraChegada() {
		return horaChegada;
	}

	public void setHoraChegada(double horaChegada) {
		this.horaChegada = horaChegada;
	}
	
}