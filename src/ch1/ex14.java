package ch1;

/*
 * test/ex14, test/ex14_1, test/ex14_2を用いて確認
 */
public class ex14 {

	//バージョン
	private String version;
	//識別番号
	private String serial;
	//一つ目の端子
	private String firstTerminal;
	//仕様
	private String designDocument = "";
	
	/**
	 * バージョンの設定
	 * @param nextVersion
	 * @return void
	 */
	public void setVersion(String nextVersion){
		this.version = nextVersion;
	}
	
	/**
	 * 識別番号の設定
	 * @param nextSerial
	 * @return void
	 */
	public void setSerial(String nextSerial){
		this.serial = nextSerial;
	}
	
	/**
	 * 新規モデルの作成
	 * @return void
	 */
	public void createNewModel(){
		this.firstTerminal = "あり";
	}
	
	/**
	 * 仕様書の作成
	 * @return void
	 */
	public void createDesignDocument(){
		this.designDocument += "バージョン： ";
		this.designDocument += this.version;
		this.designDocument += "%n";
		this.designDocument += "シリアルナンバー： ";
		this.designDocument += this.serial;
		this.designDocument += "%n";
		this.designDocument += "端子１： ";
		this.designDocument += this.firstTerminal;
		this.designDocument += "%n";
		System.out.printf(this.designDocument);
	}

}
