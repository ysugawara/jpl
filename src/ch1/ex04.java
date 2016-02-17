package ch1;

public class ex04 {

	/**
	 * 任意の数列を表示する（トリボナッチ/平方表）
	 */
	public static void main(String[] args) {
		//トリボナッチ数列
		System.out.println("+----------------------------------------+");
		System.out.println("|      値が100未満のトリボナッチ数列を表示      |");
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
		
		//平方表
		System.out.println("+--------------------------------+");
		System.out.println("|      値が100未満の平方表を表示      |");
		System.out.println("+--------------------------------+");
		int i;
		for(i = 1 ; i*i < 100 ; i++){
			System.out.println(i + "の平方:" + i*i);
		}

	}

}
