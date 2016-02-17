package ch1;

/**
 * ex15で使用するインターフェース
 * 追加するメソッドと削除するメソッドを定義
 * @author Yuuki
 *
 */
public interface AddAndRemove extends Lookup{
	void add(String name, String value, int number);
	void remove(String name);
}
