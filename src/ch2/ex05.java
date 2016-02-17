package ch2;

public class ex05 {
	//乗り物の識別番号
	public static String IdentificationNumber;
	//速度
	public double speed;
	//角度
	public long angle;
	//所有者
	public String owner;
	//車のID
	public int carID;
	
	/**
	 * 3つの乗り物を作成し、オブジェクトのフィールドを表示
	 * @param args
	 */
	public static void main(String[] args) {
		ex05 Car = new ex05();
		ex05 Bike = new ex05();
		ex05 motorbike = new ex05();
		
		Car.speed = 80.0;
		Car.angle = 0;
		Car.owner = "Aさん";
		
		Bike.speed = 20.0;
		Bike.angle = 90;
		Bike.owner = "Bさん";
		
		motorbike.speed = 65.0;
		motorbike.angle = 270;
		motorbike.owner = "Cさん";
		
		System.out.println(Car.speed);
		System.out.println(Car.angle);
		System.out.println(Car.owner);
		
		System.out.println(Bike.speed);
		System.out.println(Bike.angle);
		System.out.println(Bike.owner);
		
		System.out.println(motorbike.speed);
		System.out.println(motorbike.angle);
		System.out.println(motorbike.owner);

	}

}
