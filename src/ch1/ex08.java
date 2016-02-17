package ch1;

/*
 * test/ex08.javaを用いて動作確認
 */
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
	
	/**
	 * 座標の移動
	 * @param x
	 * @param y
	 * @return void
	 */
	public void move(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * 座標の移動
	 * @param that
	 * @return void
	 */
	public void move(ex08 that) {
		this.x = that.x;
		this.y = that.y;
	}
}



