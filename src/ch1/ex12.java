package ch1;

public class ex12 {

	static final int MAX_INDEX = 10;
	/**
	 * �����v�f��'��'�����āA�t�B�{�i�b�`����̍ŏ��̕��̗v�f��\������
	 * String�I�u�W�F�N�g���g�p
	 */
	public static void main(String[] args) {
		int ImprovedFibonacci[] = new int[MAX_INDEX];
		ImprovedFibonacci[0] = 1;
		ImprovedFibonacci[1] = 1;
		String Initial = "1: ";
		String mark;

		Initial += ImprovedFibonacci[0];
		System.out.println(Initial);
		
		for (int i = 2; i < MAX_INDEX; i++) {
			mark = String.valueOf(i);
			mark += ": ";
			mark += ImprovedFibonacci[i-1];
			if (ImprovedFibonacci[i-1] % 2 == 0) {
				mark += " *";
			} else {
				mark += "";
			}
			System.out.println(mark);
			ImprovedFibonacci[i] = ImprovedFibonacci[i-1] + ImprovedFibonacci[i-2];
		}
	}
	
}
