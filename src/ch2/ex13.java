package ch2;

public class ex13 {
	//��蕨�̎��ʔԍ�
	private static int IdentificationNumber;
	//�ő�̎��ʔԍ�
	private long serialNumber;
	//���x
	private double speed;
	//�p�x
	private long angle;
	//���L��
	private String owner;
	//�Ԃ�ID
	private int carID;
	
	//��̃R���X�g���N�^
	ex13() {
		serialNumber = IdentificationNumber++;
	}

	//���L�҂������ɂ����R���X�g���N�^
	ex13(String ownerName) {
		serialNumber = IdentificationNumber++;
		owner = ownerName;
	}
	
	/**
	 * 3�̏�蕨���쐬���A�I�u�W�F�N�g�̃t�B�[���h��\��
	 * @param args
	 */
	public static void main(String[] args) {
		
		ex10 Car = new ex10("A����");
		ex10 Bike = new ex10("B����");
		ex10 motorbike = new ex10("C����");
		
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
	}
	
	/**
	 * �ő�̎��ʔԍ���Ԃ�
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
	
	/**
	 * �ǉ�����toString
	 */
	public String toString() {
		String info = "���L��: " + owner;
		return info;
		
	}
	
	/**
	 * @return the identificationNumber
	 */
	public static int getIdentificationNumber() {
		return IdentificationNumber;
	}

	/**
	 * @param identificationNumber the identificationNumber to set
	 */
	public static void setIdentificationNumber(int identificationNumber) {
		IdentificationNumber = identificationNumber;
	}

	/**
	 * @return the serialNumber
	 */
	public long getSerialNumber() {
		return serialNumber;
	}

	/**
	 * @param serialNumber the serialNumber to set
	 */
	public void setSerialNumber(long serialNumber) {
		this.serialNumber = serialNumber;
	}

	/**
	 * @return the speed
	 */
	public double getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(double speed) {
		this.speed = speed;
	}

	/**
	 * @return the angle
	 */
	public long getAngle() {
		return angle;
	}

	/**
	 * @param angle the angle to set
	 */
	public void setAngle(long angle) {
		this.angle = angle;
	}

	/**
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}

	/**
	 * @return the carID
	 */
	public int getCarID() {
		return carID;
	}

	/**
	 * @param carID the carID to set
	 */
	public void setCarID(int carID) {
		this.carID = carID;
	}
	
}
