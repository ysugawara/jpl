package ch2;

public class ex15 {
	//乗り物の識別番号
	private static int IdentificationNumber;
	
	private long serialNumber;
	private double speed;
	private long angle;
	private String owner;
	//車のID
	private int carID;

	//所有者を引数にしたコンストラクタ
	ex15(String ownerName) {
		serialNumber = IdentificationNumber++;
		owner = ownerName;
	}
	
	public ex15() {
	}

	public static void main(String[] args) {
		
		ex15 Car = new ex15("Aさん");
		ex15 Bike = new ex15("Bさん");
		ex15 motorbike = new ex15("Cさん");
		
		Car.speed = 80.0;
		Car.angle = 0;
		
		Bike.speed = 20.0;
		Bike.angle = 90;
		
		motorbike.speed = 65.0;
		motorbike.angle = 270;
		
		System.out.println(Car.speed);
		System.out.println(Car.angle);
		System.out.println(Car.owner);
		System.out.println(Car.serialNumber);
		
		System.out.println(Bike.speed);
		System.out.println(Bike.angle);
		System.out.println(Bike.owner);
		System.out.println(Bike.serialNumber);
		
		System.out.println(motorbike.speed);
		System.out.println(motorbike.angle);
		System.out.println(motorbike.owner);
		System.out.println(motorbike.serialNumber);
		
		System.out.println(returnMaxSerial(Car.serialNumber, Bike.serialNumber, motorbike.serialNumber));
		System.out.println("車の" + Car);
		System.out.println("自転車の" + Bike);
		System.out.println("バイクの" + motorbike);
		
		Car.changeSpeed(45.0);
		System.out.println(Car.speed);
		Car.stop();
		System.out.println(Car.speed);
	}
	
	public static long returnMaxSerial(long CarNumber, long bikeNumber, long motorbikeNumber) {
		long max = CarNumber;
		if (bikeNumber > max) {
			max = bikeNumber;
		}
		if (motorbikeNumber > max) {
			max = motorbikeNumber;
		}
		return max;
	}
	
	public String toString() {
		String info = "所有者: " + owner;
		return info;
	}
	
	//現在のスピードに変更するメソッド
	public void changeSpeed(double currentSpeed) {
		setSpeed(currentSpeed);
	}
	
	//スピードを０にするメソッド
	public void stop() {
		setSpeed(0);
	}
	
	public long getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(long serialNumber) {
		this.serialNumber = serialNumber;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public long getAngle() {
		return angle;
	}

	public void setAngle(long angle) {
		this.angle = angle;
	}

	public int getCarID() {
		return carID;
	}

	public void setCarID(int carID) {
		this.carID = carID;
	}

}
