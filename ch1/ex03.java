package ch1;

public class ex03 {

	/**
	 * �l��5�����̃t�B�{�i�b�`�����\������
	 */
	public static void main(String[] args) {
		System.out.println("+---------------------------------------+");
		System.out.println("|      �l��50�����̃t�B�{�i�b�`�����\��      |");
		System.out.println("+---------------------------------------+");
		int lo = 1;
		int hi = 1;
		System.out.println(lo);
		while(hi < 50){
			System.out.println(hi);
			//�V����hi
			hi = lo + hi;
			//�V����lo�́A���v����Â�lo������������
			lo = hi - lo;
		}
	}

}
