package ch2;

public class ex08 {

	//リストのデータ
	public Object Data;
	//次のリスト
	public ex08 next;
	
	//引数なしのコンストラクタ
	public ex08() {
	}
	
	//二つの引数を持つコンストラクタ
	public ex08(Object o, ex08 next) {
		this.Data = o;
		this.next = next;
	}

}
