package questao2;

public class Machado implements Arma {

	private int dano;

	public int getDano() {
		return this.dano;
	}

	@Override
	public int atacar() {
		this.dano = 40;
		Guerreiro g = new Guerreiro();
		g.setLife(dano);
		return this.dano;
	}
}
