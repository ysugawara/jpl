package ch1;

public class ex04 {

	/**
	 * �C�ӂ̐����\������i�g���{�i�b�`/�����\�j
	 */
	public static void main(String[] args) {
		//�g���{�i�b�`����
		System.out.println("+----------------------------------------+");
		System.out.println("|      �l��100�����̃g���{�i�b�`�����\��      |");
		System.out.println("+----------------------------------------+");
		int F0 = 0;
		int F1 = 0;
		int F2 = 1;
		System.out.println(F0);
		System.out.println(F1);
		while(F2 < 100){
			System.out.println(F2);
			F2 = F0 + F1 + F2;
			F1 = F2 - F1 - F0;
			F0 = F2 - F1 - F0;
		}
		
		//�����\
		System.out.println("+--------------------------------+");
		System.out.println("|      �l��100�����̕����\��\��      |");
		System.out.println("+--------------------------------+");
		int i;
		for(i = 1 ; i*i < 100 ; i++){
			System.out.println(i + "�̕���:" + i*i);
		}

	}

}
