package ch1;

public class ex06 {
	//���O�t������萔
	final static int MAX = 50;
	final static String TITLE = "�l��50�����̃t�B�{�i�b�`�����\��";

	/**
	 * ���O�t������萔�̎g�p�Q
	 * @return void
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
