package ch2;

public class ex14 {

	private Object Data;
	private ex14 next;

	public ex14(Object o, ex14 next) {
		this.Data = o;
		this.next = next;
	}
	
	public String toString() {
		String info = "ÉfÅ[É^: " + Data;
		return info;
	}
	
	public ex14 getNext() {
		return next;
	}

	public void setNext(ex14 next) {
		this.next = next;
	}

}
