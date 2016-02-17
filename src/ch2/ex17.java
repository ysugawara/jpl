package ch2;

public class ex17 {
	//乗り物の識別番号
	private static int IdentificationNumber;
	
	private long serialNumber;
	private double speed;
	private double angle;
	private String owner;
	
	//車のID
	private int carID;
	
	//回転
	private static double TURN_LEFT = 60.0;
	private static double TURN_RIGHT = 35.0;

	//所有者を引数にしたコンストラクタ
	ex17(String ownerName) {
		serialNumber = IdentificationNumber++;
		owner = ownerName;
	}
	
	public ex17() {
	}

	public static void main(String[] args) {
		
		ex17 Car = new ex17("Aさん");
		ex17 Bike = new ex17("Bさん");
		ex17 motorbike = new ex17("Cさん");
		
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
	
	//引数として回転する角度を受け取るメソッド
	public void turn(double angle) {
		setAngle(angle);
	}
	
	//引数として定数を受け取るメソッド？
	
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

	public double getAngle() {
		return angle;
	}

	public void setAngle(double angle) {
		this.angle = angle;
	}

	public int getCarID() {
		return carID;
	}

	public void setCarID(int carID) {
		this.carID = carID;
	}
	
	/**
	 * @return the tURN_LEFT
	 */
	public static double getTURN_LEFT() {
		return TURN_LEFT;
	}

	/**
	 * @param tURN_LEFT the tURN_LEFT to set
	 */
	public static void setTURN_LEFT(double tURN_LEFT) {
		TURN_LEFT = tURN_LEFT;
	}
	
	/**
	 * @return the tURN_RIGHT
	 */
	public static double getTURN_RIGHT() {
		return TURN_RIGHT;
	}

	/**
	 * @param tURN_RIGHT the tURN_RIGHT to set
	 */
	public static void setTURN_RIGHT(double tURN_RIGHT) {
		TURN_RIGHT = tURN_RIGHT;
	}

}
