package ch2;

public class ex08 {

	//���X�g�̃f�[�^
	public Object Data;
	//���̃��X�g
	public ex08 next;
	
	//�����Ȃ��̃R���X�g���N�^
	public ex08() {
	}
	
	//��̈��������R���X�g���N�^
	public ex08(Object o, ex08 next) {
		this.Data = o;
		this.next = next;
	}

}
