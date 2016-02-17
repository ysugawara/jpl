package ch2;

public class ex07 {
	//乗り物の識別番号
	public static String IdentificationNumber;
	
	public double speed;
	public long angle;
	public String owner;
	//車のID
	public int carID;
	
	//空のコンストラクタ
	ex07() {
	}
	
	//所有者を引数にしたコンストラクタ
	ex07(String ownerName) {
		owner = ownerName;
	}
	
	public static void main(String[] args) {
		ex07 Car = new ex07("Aさん");
		ex07 Bike = new ex07("Bさん");
		ex07 motorbike = new ex07("Cさん");
		
		Car.speed = 80.0;
		Car.angle = 0;
		
		Bike.speed = 20.0;
		Bike.angle = 90;
		
		motorbike.speed = 65.0;
		motorbike.angle = 270;
		
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
