package questao3;

public class Horario {

	private int horaAterrissagem;
	private int horaDecolagem;
	
	public Horario(int i, int j) {
		this.horaAterrissagem = i;
		this.horaDecolagem = j;
	}
	public int getHoraAterrissagem() {
		return horaAterrissagem;
	}
	public void setHoraAterrissagem(int horaAterrissagem) {
		this.horaAterrissagem = horaAterrissagem;
	}
	public int getHoraDecolagem() {
		return horaDecolagem;
	}
	public void setHoraDecolagem(int horaDecolagem) {
		this.horaDecolagem = horaDecolagem;
	}
	
}

