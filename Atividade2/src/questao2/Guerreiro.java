package questao2;

public class Guerreiro{

	private String nome;
	private int life;
	private Arma arma;
	private Armadura armadura;
	 
	
	public Guerreiro(String nome, int life, Arma arma) {
		this.nome = nome;
		this.life = life;
		this.arma = arma;
	}
	
	public Guerreiro() {
		
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getLife() {
		return this.life --;
	}
	
	public void setLife(int life) {
		this.life = life;   
	}
	
	public Arma getArma() {
		return this.arma;
	}
	
	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public Armadura getArmadura() {
		return armadura;
	}

	public void setArmadura(Armadura armadura) {
		this.armadura = armadura;
	}
	
}
