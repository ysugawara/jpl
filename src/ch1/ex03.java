package ch1;

public class ex03 {

	/**
	 * 値が5未満のフィボナッチ数列を表示する
	 */
	public static void main(String[] args) {
		System.out.println("+---------------------------------------+");
		System.out.println("|      値が50未満のフィボナッチ数列を表示      |");
		System.out.println("+---------------------------------------+");
		int lo = 1;
		int hi = 1;
		System.out.println(lo);
		while(hi < 50){
			System.out.println(hi);
			//新しいhi
			hi = lo + hi;
			//新しいloは、合計から古いloを引いたもの
			lo = hi - lo;
		}
	}

}
