package questao3;

public class Voo implements TotemSalaDeDesembarque, TotemSalaDeEmbarque{
	
	private int numDeVoo;
	private Company business;
	private Horario horario;
	private boolean partiuOuNao;
	private TotemSalaDeDesembarque totemDesembarque;
	private TotemSalaDeEmbarque totemDeEmbarque;
	private TotemHoraEmbarqueEDesembarque toteEmbarqueDesembarque;

	public Voo(int numDeVoo, Company business, Horario horario, boolean partiuOrNot) {
		this.numDeVoo = numDeVoo;
		this.business = business;
		this.horario = horario;
		this.partiuOuNao = partiuOrNot;
	}
	
	public Voo() {
		
	}
	
	@Override
	public int horasQueAterrisaVoo() {
		int resp = this.horario.getHoraAterrissagem();
		return resp;
	}
	
	@Override
	public int horaQueSaiVoo() {
		int resp = this.horario.getHoraDecolagem();
		return resp;
	}
	
	public int getNumDeVoo() {
		return this.numDeVoo;
	}
	
	public void setNumDeVoo(int numDeVoo) {
		this.numDeVoo = numDeVoo;
	}
	
	public Company getEmpresa() {
		return this.business;
	}
	
    public void setEmpresa(Company empresa) {
    	this.business = empresa;
    }
    
    public Horario getHorario() {
    	return this.horario;
    }
    
    public void setHorario(Horario horario) {
    	this.horario = horario;
    }
    
    public boolean getPartiuOuNao() {
    	return this.partiuOuNao;
    }
    
    public void setPartiuOuNao(boolean parteOuNao) {
    	this.partiuOuNao = parteOuNao;
    }
	
	public TotemSalaDeDesembarque getTotemSalaDeDesembarque() {
		return this.totemDesembarque;
	}
	
	public void setTotemSalaDeDesembarque(TotemSalaDeDesembarque totemDesembarque) {
		this.totemDesembarque = totemDesembarque;
	}
	
	public TotemSalaDeEmbarque getTotemHoraEmbarque() {
		return this.totemDeEmbarque;
	}
	
	public void setTotemSalaDeEmbarque(TotemSalaDeEmbarque totemEmbarque) {
		this.totemDeEmbarque = totemEmbarque;
	}
	
	public TotemHoraEmbarqueEDesembarque getToteEmbarqueDesembarque() {
		return this.toteEmbarqueDesembarque;
	}

	public void setToteEmbarqueDesembarque(TotemHoraEmbarqueEDesembarque toteEmbarqueDesembarque) {
		this.toteEmbarqueDesembarque = toteEmbarqueDesembarque;
	}
}
