package ch2;

public class ex14 {

	//リストのデータ
	private Object Data;
	//次のリスト
	private ex14 next;

	//引数なしのコンストラクタ
	public ex14() {
	}
		
	//二つの引数を持つコンストラクタ
	public ex14(Object o, ex14 next) {
		this.Data = o;
		this.next = next;
	}
		
	/**
	 * 追加したtoString
	 */
	public String toString() {
		String info = "データ: " + Data;
		return info;
	}
	
	public ex14 getNext() {
		return next;
	}

	public void setNext(ex14 next) {
		this.next = next;
	}

}
