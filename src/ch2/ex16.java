package ch2;

/**
 * �A�����X�g�̃N���X
 * @author Yuuki
 *
 */
public class ex16 {

	private Object Data;
	private ex16 next;

	public ex16(Object o, ex16 next) {
		this.Data = o;
		this.next = next;
	}
	
	public String toString() {
		String info = "�f�[�^: " + Data;
		return info;
	}
	
	public ex16 getNext() {
		return next;
	}

	public void setNext(ex16 next) {
		this.next = next;
	}


}
