package questao3;

public class Person implements TotemHoraEmbarqueEDesembarque{

	private String nome;
	private String NomeViagem;
	private Horario horario;

	public Person(String nome, String nomeViagem, Horario horario) {
		this.nome = nome;
		this.NomeViagem = nomeViagem;
		this.horario = horario;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeViagem() {
		return NomeViagem;
	}

	public void setNomeViagem(String nomeViagem) {
		NomeViagem = nomeViagem;
	}
	
	public int horaEmbarqueDesembarque(Voo voo) {
		String msg = "Hora de Embarque: "+voo.getTotemHoraEmbarque()+"Hora de Desembarque: "+voo.getTotemSalaDeDesembarque();
		int retorna = Integer.parseInt(msg);
		return retorna;
	}

	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}
}
