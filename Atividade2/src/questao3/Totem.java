package questao3;
import java.util.ArrayList;
import java.util.List;


public class Totem implements Observer { // Interface Observer

    private Subject subject;
    private List<Voo> voos;
   
    public Totem(Subject subject) {
    	this.setSubject(subject);
    	this.setVoos(new ArrayList<Voo>());
    }
 
   
	@Override
	public void update() {		
		voos = subject.getVoos();
	}


	public Subject getSubject() {
		return subject;
	}


	public void setSubject(Subject subject) {
		this.subject = subject;
	}


	public List<Voo> getVoos() {
		return voos;
	}


	public void setVoos(List<Voo> voos) {
		this.voos = voos;
	}
}
