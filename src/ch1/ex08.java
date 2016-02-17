package ch1;

public class ex08 {
	public double x,y;
	
	public void clear() {
		this.x = 0.0;
		this.y = 0.0;
	}
	
	public double distance(ex08 that) {
		double xdiff = this.x - that.x;
		double ydiff = this.y - that.y;
		return Math.sqrt(xdiff * ydiff * ydiff);
	}
	
	public void move(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void move(ex08 that) {
		this.x = that.x;
		this.y = that.y;
	}
}



