package ch2;

public class ex06 {

	//リストのデータ
	public Object Data;
	//次のリスト
	public ex05 next;
	
	public ex06(Object o, ex05 next) {
		this.Data = o;
		this.next = next;
	}

	/**
	 * 乗り物を作成、連結リストで表示
	 * @param args
	 */
	public static void main(String[] args) {
		ex05 Car = new ex05();
		ex05 Bike = new ex05();
		ex05 motorbike = new ex05();
		
		Car.speed = 80.0;
		Car.angle = 0;
		Car.owner = "Aさん";
		
		Bike.speed = 20.0;
		Bike.angle = 90;
		Bike.owner = "Bさん";
		
		motorbike.speed = 65.0;
		motorbike.angle = 270;
		motorbike.owner = "Cさん";
		
		ex06 CarList = new ex06(Car, Bike);
		ex06 BikeList = new ex06(Bike, motorbike);
	}

}
