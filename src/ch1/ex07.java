package ch1;

public class ex07 {
	static final int MAX_INDEX = 8;
	/**
	 * �����v�f��'��'�����āA�t�B�{�i�b�`����̍ŏ��̕��̗v�f��\������
	 */
	public static void main(String[] args) {
		int lo = 1;
		int hi = 1;
		String mark;
		
		System.out.println("9: " + lo);
		for (int i = MAX_INDEX; i >= 1; i--) {
			if (hi % 2 == 0) {
				mark = " *";
			} else {
				mark = "";
			}
			System.out.println( i + ": " + hi + mark );
			hi = lo + hi;
			lo = hi - lo;
		}
	}
}
