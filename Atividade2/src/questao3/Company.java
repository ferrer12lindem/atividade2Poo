package questao3;

public class Company {

	private String nome;
	private String areaDeAtuacao;
	private int numeroDeCadastro;
	
	public Company(String nome, String areaDeAtuacao, int numerCadastro) {
		this.nome = nome;
		this.areaDeAtuacao = areaDeAtuacao;
		this.numeroDeCadastro = numerCadastro;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getAreaDeAtuacao() {
		return areaDeAtuacao;
	}
	public void setAreaDeAtuacao(String areaDeAtuacao) {
		this.areaDeAtuacao = areaDeAtuacao;
	}
	
	public int getNumeroDeCadastro() {
		return numeroDeCadastro;
	}
	public void setNumeroDeCadastro(int numeroDeCadastro) {
		this.numeroDeCadastro = numeroDeCadastro;
	}	
}
