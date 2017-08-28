package questao2;

public class Alabarda implements Arma{

	private int dano;
	
    public int getDano() {
    	return this.dano;
    }

	@Override
	public int atacar() {
		this.dano = 30;
		Guerreiro g = new Guerreiro();
		g.setLife(dano);
		return this.dano;
	}

}
