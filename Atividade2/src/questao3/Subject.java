package questao3;
import java.util.List;

public interface Subject { //Interface Subject
	
	public void registerObserver(Observer b);
	public void removerObserver(Observer b);
	public void notifyObservers();
	public List<Voo> getVoos(); 
}
