package ch2;

public class ex07 {
	//��蕨�̎��ʔԍ�
	public static String IdentificationNumber;
	
	public double speed;
	public long angle;
	public String owner;
	//�Ԃ�ID
	public int carID;
	
	//��̃R���X�g���N�^
	ex07() {
	}
	
	//���L�҂������ɂ����R���X�g���N�^
	ex07(String ownerName) {
		owner = ownerName;
	}
	
	public static void main(String[] args) {
		ex07 Car = new ex07("A����");
		ex07 Bike = new ex07("B����");
		ex07 motorbike = new ex07("C����");
		
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
