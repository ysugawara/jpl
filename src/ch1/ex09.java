package ch1;

public class ex09 {
	final static String TITLE = "�t�B�{�i�b�`�����z��ɕۑ����ĕ\��";

	/**
	 * �t�B�{�i�b�`�����z��ɕۑ����ĕ\��
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		System.out.println("+---------------------------------------+");
		System.out.println("|" + ex09.TITLE + "|");
		System.out.println("+---------------------------------------+");

		int fibonacci[] = new int[10];
		fibonacci[0] = 1;
		fibonacci[1] = 1;
		if(fibonacci == null || fibonacci.length == 0){
			throw new IllegalArgumentException();
		} else {
			for(int i = 2; i < fibonacci.length; i++){
				fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
			}
			for(int i = 0; i < fibonacci.length; i++){
				System.out.println(fibonacci[i]);
			}
		}
		
	}
}
