package ch1;

public class ex13 {

	static final int MAX_INDEX = 10;
	/**
	 * 偶数要素に'※'をつけて、フィボナッチ数列の最初の方の要素を表示する
	 * Stringオブジェクトを使用し、printfで表示
	 * @return void
	 */
	public static void main(String[] args) {
		int ImprovedFibonacci[] = new int[MAX_INDEX];
		ImprovedFibonacci[0] = 1;
		ImprovedFibonacci[1] = 1;
		String Initial = "1: ";
		String mark;

		Initial += ImprovedFibonacci[0];
		Initial += "%n";
		System.out.printf(Initial);
		
		for (int i = 2; i < MAX_INDEX; i++) {
			mark = String.valueOf(i);
			mark += ": ";
			mark += ImprovedFibonacci[i-1];
			if (ImprovedFibonacci[i-1] % 2 == 0) {
				mark += " *";
			} else {
				mark += "";
			}
			mark += "%n";
			System.out.printf(mark);
			ImprovedFibonacci[i] = ImprovedFibonacci[i-1] + ImprovedFibonacci[i-2];
		}
	}
	
}
