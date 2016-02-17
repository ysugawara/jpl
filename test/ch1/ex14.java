package test;

public class ex14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//初代ウォークマン
		System.out.println("***初代ウォークマン***");
		ch1.ex14 WALKMAN1 = new ch1.ex14();
		WALKMAN1.setVersion("1.0");
		WALKMAN1.setSerial("A0001");
		WALKMAN1.createNewModel();
		WALKMAN1.createDesignDocument();
		
		//2代目ウォークマン
		System.out.println("");
		System.out.println("***２代目ウォークマン***");
		test.ex14_1 WALKMAN2 = new test.ex14_1();
		WALKMAN2.setVersion("1.1");
		WALKMAN2.setSerial("A0002");
		WALKMAN2.createNewModel();
		WALKMAN2.createDesignDocument();
		
		//３代目ウォークマン
		System.out.println("");
		System.out.println("***３代目ウォークマン***");
		test.ex14_2 WALKMAN3 = new test.ex14_2();
		WALKMAN3.setVersion("1.2");
		WALKMAN3.setSerial("A0003");
		WALKMAN3.createNewModel();
		WALKMAN3.createDesignDocument();
	}

}
