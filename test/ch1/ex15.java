package test;

public class ex15 {
	private static String name1 = "Sugawara";
	private static String name2 = "Ikuta";
	
	private static String value1 = "Kanagawa";
	private static String value2 = "Kobe";

	public static void main(String[] args) {
		ch1.ex15 Ex15 = new ch1.ex15();
		
		//�ǉ�
		System.out.println("****add***");
		Ex15.add(name1, value1, 0);
		Ex15.add(name2, value2, 1);
		System.out.println("");
		
		//�ǉ��ł��Ă��邩�A�������Ċm�F
		System.out.println("***find***");
		System.out.println(Ex15.find(name1));
		System.out.println("");
		
		//�폜
		System.out.println("**remove**");
		Ex15.remove(name1);
		System.out.println("");
		
		//�폜�ł��Ă��邩�A�������Ċm�F
		System.out.println("***find***");
		System.out.println(Ex15.find(name1));
		System.out.println("");
	}

}
