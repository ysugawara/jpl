package ch2;

public class ex10 {
	//��蕨�̎��ʔԍ�
	public static int IdentificationNumber;
	//�ő�̎��ʔԍ�
	public long serialNumber;
	//���x
	public double speed;
	//�p�x
	public long angle;
	//���L��
	public String owner;
	//�Ԃ�ID
	public int carID;
	
	//��̃R���X�g���N�^
	ex10() {
		serialNumber = IdentificationNumber++;
	}

	//���L�҂������ɂ����R���X�g���N�^
	ex10(String ownerName) {
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

}
