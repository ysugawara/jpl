package ch2;

public class ex15 {
	//��蕨�̎��ʔԍ�
	private static int IdentificationNumber;
	
	private long serialNumber;
	private double speed;
	private long angle;
	private String owner;
	//�Ԃ�ID
	private int carID;

	//���L�҂������ɂ����R���X�g���N�^
	ex15(String ownerName) {
		serialNumber = IdentificationNumber++;
		owner = ownerName;
	}
	
	public ex15() {
	}

	public static void main(String[] args) {
		
		ex15 Car = new ex15("A����");
		ex15 Bike = new ex15("B����");
		ex15 motorbike = new ex15("C����");
		
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
		System.out.println("�Ԃ�" + Car);
		System.out.println("���]�Ԃ�" + Bike);
		System.out.println("�o�C�N��" + motorbike);
		
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
		String info = "���L��: " + owner;
		return info;
	}
	
	//���݂̃X�s�[�h�ɕύX���郁�\�b�h
	public void changeSpeed(double currentSpeed) {
		setSpeed(currentSpeed);
	}
	
	//�X�s�[�h���O�ɂ��郁�\�b�h
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
