package test;

public class ex14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//����E�H�[�N�}��
		System.out.println("***����E�H�[�N�}��***");
		ch1.ex14 WALKMAN1 = new ch1.ex14();
		WALKMAN1.setVersion("1.0");
		WALKMAN1.setSerial("A0001");
		WALKMAN1.createNewModel();
		WALKMAN1.createDesignDocument();
		
		//2��ڃE�H�[�N�}��
		System.out.println("");
		System.out.println("***�Q��ڃE�H�[�N�}��***");
		test.ex14_1 WALKMAN2 = new test.ex14_1();
		WALKMAN2.setVersion("1.1");
		WALKMAN2.setSerial("A0002");
		WALKMAN2.createNewModel();
		WALKMAN2.createDesignDocument();
		
		//�R��ڃE�H�[�N�}��
		System.out.println("");
		System.out.println("***�R��ڃE�H�[�N�}��***");
		test.ex14_2 WALKMAN3 = new test.ex14_2();
		WALKMAN3.setVersion("1.2");
		WALKMAN3.setSerial("A0003");
		WALKMAN3.createNewModel();
		WALKMAN3.createDesignDocument();
	}

}
