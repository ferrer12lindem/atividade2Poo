package questao2;

public class Titanio implements Armadura{

	private int resistencia = 15;
	
	@Override
	public int defender() {
		return this.resistencia;
	}

}
