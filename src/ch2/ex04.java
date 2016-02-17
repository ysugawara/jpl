package ch2;

public class ex04 {
	//乗り物の識別番号
	/*
	 * 回答：識別番号はfinalにするべきではない
	 * 理由：識別番号が決まるのは、オブジェクトが生成され、乗り物の種類（車とか）が確定してから
	 * 識別番号が決まるため
	 */
	public static String IdentificationNumber;
	
	public double speed;
	public long angle;
	public String owner;
	//車のID
	public int carID;

}
