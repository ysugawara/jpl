package ch1;

public class ex10 {

	static final int MAX_INDEX = 10;
	/**
	 * �����v�f��'��'�����āA�t�B�{�i�b�`����̍ŏ��̕��̗v�f��\������
	 */
	public static void main(String[] args) {
		int ImprovedFibonacci[] = new int[MAX_INDEX];
		ImprovedFibonacci[0] = 1;
		ImprovedFibonacci[1] = 1;
		String mark;

		System.out.println("1: " + ImprovedFibonacci[0]);
		for (int i = 2; i < MAX_INDEX; i++) {
			if (ImprovedFibonacci[i-1] % 2 == 0) {
				mark = " *";
			} else {
				mark = "";
			}
			System.out.println( i + ": " + ImprovedFibonacci[i-1] + mark );
			ImprovedFibonacci[i] = ImprovedFibonacci[i-1] + ImprovedFibonacci[i-2];
		}
	}
}
