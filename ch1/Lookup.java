package ch1;

public interface Lookup {
	/**
	 * nameと関連付けされた値を返す。
	 * そのような値がなければnullを返す。
	 */
	Object find(String name); 
}
