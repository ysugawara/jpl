package ch2;

public class ex14 {

	//���X�g�̃f�[�^
	private Object Data;
	//���̃��X�g
	private ex14 next;

	//�����Ȃ��̃R���X�g���N�^
	public ex14() {
	}
		
	//��̈��������R���X�g���N�^
	public ex14(Object o, ex14 next) {
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
	
	public ex14 getNext() {
		return next;
	}

	public void setNext(ex14 next) {
		this.next = next;
	}

}
