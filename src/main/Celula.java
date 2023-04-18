package main;

public class Celula {
	private Celula next;
	private Object element;
	
	public Celula() {
		
	}
	
	public Celula(Object element) {
		this.element = element;
		
	}
	
	public Celula(Celula next, Object element) {
		this.element = element;
		this.next = next;
	}

	public Celula getNext() {
		return next;
	}

	public void setNext(Celula next) {
		this.next = next;
	}

	public Object getElement() {
		return element;
	}

	public void setElement(Object element) {
		this.element = element;
	}
	
	
	
}
