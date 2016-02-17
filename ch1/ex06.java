package ch1;

public class ex06 {
	final static int MAX = 50;
	final static String TITLE = "値が50未満のフィボナッチ数列を表示";

	/**
	 * 名前付文字列定数の使用２
	 */
	public static void main(String[] args) {
		System.out.println("+---------------------------------------+");
		System.out.println("|" + ex06.TITLE + "|");
		System.out.println("+---------------------------------------+");
		int hi = 1;
		int lo = 1;
		System.out.println(lo);
		while(hi < ex06.MAX){
			System.out.println(hi);
			hi = lo + hi;
			lo = hi - lo;
		}

	}

}
