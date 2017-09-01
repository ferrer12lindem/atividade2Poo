package questao3;
import java.util.LinkedList;
import java.util.List;

public class Airport implements Subject{
    
	
	private List<Observer> observers;
	private List<Voo> voos;
	
	public Airport(List<Voo> voos) {
		this.observers = new LinkedList<Observer>();
		this.voos = voos;
	}
	
	public void adicionaVoo(Voo voo) {
		voos.add(voo);
		for(Observer observer: this.observers ) {
			observer.notify();
		}
	}
	
	public void removeVoo(Voo voo) {
		voos.remove(voo);
		for(Observer observer: this.observers) {
			observer.notify();
		}
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
		
	}

	@Override
	public void removerObserver(Observer observer) {
		int index = observers.indexOf(observer);
	    if(index > -1) {
	    	observers.remove(observer);
	    }		
	}

	@Override
	public void notifyObservers() {
		for(Observer o: this.observers) {
			o.update();
		}	
	}

	public List<Voo> getVoos() {
		return voos;
	}

	public void setVoos(List<Voo> voos) {
		this.voos = voos;
	}
}
