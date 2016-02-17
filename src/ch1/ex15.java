package ch1;

public class ex15 implements AddAndRemove{
	
	private String[] names = new String[2];
	private Object[] values = new Object[2];
	
	public Object find(String name) {
		for (int i = 0; i<names.length; i++) {
			if (names[i].equals(name)) {
				return values[i];
			}
		}
		return null;
	}
	
	/**
	 * 追加するメソッドの実装
	 */
	public void add(String name, String value, int number) {
		this.names[number] = name;
		this.values[number] = value;
		System.out.println("name: " + this.names[number]);
		System.out.println("value: " + this.values[number]);
	}
	
	/**
	 * 削除するメソッド実装
	 */
	public void remove(String name) {
		for (int i = 0; i<names.length; i++) {
			if (names[i].equals(name)) {
				names[i] = "";
				values[i] = "";
				System.out.println("name: " + this.names[i]);
				System.out.println("value: " + this.values[i]);
				break;
			}
			System.out.println(name + "を削除できませんでした");
		}
	}

}
