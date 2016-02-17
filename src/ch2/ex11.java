package ch2;

public class ex11 {

	//リストのデータ
	public Object Data;
	//次のリスト
	public ex11 next;
	
	//引数なしのコンストラクタ
	public ex11() {
	}
	
	//二つの引数を持つコンストラクタ
	public ex11(Object o, ex11 next) {
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
}
