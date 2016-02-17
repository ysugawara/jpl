package ch2;

public class ex09 {
	//乗り物の識別番号
	public static int IdentificationNumber;
	//最大の識別番号
	public long serialNumber;
	//速度
	public double speed;
	//角度
	public long angle;
	//所有者
	public String owner;
	//車のID
	public int carID;
	
	//空のコンストラクタ
	ex09() {
		serialNumber = IdentificationNumber++;
	}
	
	//所有者を引数にしたコンストラクタ
	ex09(String ownerName) {
		serialNumber = IdentificationNumber++;
		owner = ownerName;
	}
	
	/**
	 * 3つの乗り物を作成し、オブジェクトのフィールドを表示
	 * @param args
	 */
	public static void main(String[] args) {
		
		ex09 Car = new ex09("Aさん");
		ex09 Bike = new ex09("Bさん");
		ex09 motorbike = new ex09("Cさん");
		
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
	}
	
	/**
	 * 最大の識別番号を返す
	 * @param CarNumber
	 * @param bikeNumber
	 * @param motorbikeNumber
	 * @return
	 */
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

}
