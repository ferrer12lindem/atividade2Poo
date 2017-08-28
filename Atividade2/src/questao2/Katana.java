package questao2;

public class Katana implements Arma {

	private int dano;
	
	public int getDano() {
		return this.dano;
	}

	@Override
	public int atacar() {
			this.dano = 25;
			Guerreiro g = new Guerreiro();
			g.setLife(dano);
			return this.dano;
		}
	
}
