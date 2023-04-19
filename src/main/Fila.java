package main;

public class Fila<T> {
	private Celula start,end;
	private int size;
	
	
	//Change
	public void setStart(Celula start) {
		//Change the value of the first element
		this.start = start;
	}
	
	//Has an element
	public boolean hasElement (T Element) {
		//Checks if there is any element at the start of the queue
		if (this.getStart() != null) {
			return true;
		}else {
			return false;
		}
	}
	
	//Retrieve
	public Celula getStart() {
		//Return the first element of the queue
		return start;
	}
	
	//Is empty?
	public boolean isEmpty(T Element) {
		//Checks if the queue is empty and return a boolean
		if (this.getSize() != 0) {
			return true; 
		}else {
			return false;
		}
	}
	
	//Insert elements
	public void add(T Element) {
		//Add an element to the end of the queue
		Celula c1 = new Celula(Element);
		if (this.size == 0) {
			start = end = c1;
			this.size++;
		}else {
			c1.setNext(end);
			end = c1;
			this.size++;
		}
	}
	
	//Remover
	public void remover(T element) {
		//Remove the first element of the queue
		if (this.size == 0) {
			throw new IndexOutOfBoundsException("ERROR! This is an empty queue.");}
		else if (start == end){
			start = end = null;
			this.size--;
		}
		else {
			start = start.getNext();
			this.size--;
		}
		
	}
	
	//Cleaner
	public void cleaner(Celula start, Celula end) {
		//Clean the whole queue, removing all the elements
		this.start = null;
		this.end = null;
		this.size--;
	}
	
	//Get Size
	public int getSize() {
		//Checks the queue size
		return size;
	}

	

}
