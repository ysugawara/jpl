package test;

public class ex08 {
	public static void main(String[] args) {
		
		//座標の生成
		ch1.ex08 thisPoint = new ch1.ex08();
		ch1.ex08 thatPoint = new ch1.ex08();
		//ユークリッド距離
		double distance = 0.0;
		//座標の初期化
		thisPoint.clear();
		thatPoint.clear();
		//座標の移動
		thatPoint.move(2.0, 3.0);
		//distanceメソッドの呼び出し
		distance = thatPoint.distance(thisPoint);
		System.out.println(distance);
		
		//座標の初期化
		thisPoint.clear();
		thatPoint.clear();
		//座標の移動
		thisPoint.x = 5.0;
		thisPoint.y = 8.0;
		thisPoint.move(thisPoint);
		//distanceメソッドの呼び出し
		distance = thisPoint.distance(thatPoint);
		System.out.println(distance);
	}
}
