package main;
import java.util.Iterator;



public class Iterador<T> implements Iterator{
	private Celula current;
	
	public Iterador(Celula current) {
		this.current = current;
	}

	public boolean hasNext() {
		if (current != null) {
			return true;
		} else {
			return false;
		}
	}

	public Object next() {
		T element = (T) current.getElement();
		current = current.getNext();
		return element;
	}

	public Celula getCurrent() {
		return current;
	}
	
	

}
