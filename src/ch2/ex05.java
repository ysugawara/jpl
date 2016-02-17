package ch2;

public class ex05 {
	//èÊÇËï®ÇÃéØï î‘çÜ
	public static String IdentificationNumber;
	
	public double speed;
	public long angle;
	public String owner;
	//é‘ÇÃID
	public int carID;
	
	public static void main(String[] args) {
		ex05 Car = new ex05();
		ex05 Bike = new ex05();
		ex05 motorbike = new ex05();
		
		Car.speed = 80.0;
		Car.angle = 0;
		Car.owner = "AÇ≥ÇÒ";
		
		Bike.speed = 20.0;
		Bike.angle = 90;
		Bike.owner = "BÇ≥ÇÒ";
		
		motorbike.speed = 65.0;
		motorbike.angle = 270;
		motorbike.owner = "CÇ≥ÇÒ";
		
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
