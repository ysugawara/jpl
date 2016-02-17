package ch2;

public class ex11 {

	public Object Data;
	public ex11 next;
	
	public ex11(Object o, ex11 next) {
		this.Data = o;
		this.next = next;
	}
	
	public String toString() {
		String info = "ÉfÅ[É^: " + Data;
		return info;
	}
}
