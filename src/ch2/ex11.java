package ch2;

public class ex11 {

	//���X�g�̃f�[�^
	public Object Data;
	//���̃��X�g
	public ex11 next;
	
	//�����Ȃ��̃R���X�g���N�^
	public ex11() {
	}
	
	//��̈��������R���X�g���N�^
	public ex11(Object o, ex11 next) {
		this.Data = o;
		this.next = next;
	}
	
	/**
	 * �ǉ�����toString
	 */
	public String toString() {
		String info = "�f�[�^: " + Data;
		return info;
	}
}
