package test;

public class ex08 {
	public static void main(String[] args) {
		
		//���W�̐���
		ch1.ex08 thisPoint = new ch1.ex08();
		ch1.ex08 thatPoint = new ch1.ex08();
		//���[�N���b�h����
		double distance = 0.0;
		//���W�̏�����
		thisPoint.clear();
		thatPoint.clear();
		//���W�̈ړ�
		thatPoint.move(2.0, 3.0);
		//distance���\�b�h�̌Ăяo��
		distance = thatPoint.distance(thisPoint);
		System.out.println(distance);
		
		//���W�̏�����
		thisPoint.clear();
		thatPoint.clear();
		//���W�̈ړ�
		thisPoint.x = 5.0;
		thisPoint.y = 8.0;
		thisPoint.move(thisPoint);
		//distance���\�b�h�̌Ăяo��
		distance = thisPoint.distance(thatPoint);
		System.out.println(distance);
	}
}
