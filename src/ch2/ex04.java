package ch2;

/**
 * 乗り物クラス
 * @author Yuuki
 *
 */
public class ex04 {
	/*
	 * 回答：識別番号はfinalにするべきではない
	 * 理由：識別番号が決まるのは、オブジェクトが生成され、乗り物の種類（車とか）が確定してから
	 * 識別番号が決まるため
	 */
	//乗り物の識別番号
	public static String IdentificationNumber;
	//速度
	public double speed;
	//角度
	public long angle;
	//所有者
	public String owner;
	//車のID
	public int carID;

}
