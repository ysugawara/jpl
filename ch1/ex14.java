package ch1;

public class ex14 {

	/**
	 * ウォークマンのクラス
	 */
	private String version;
	private String serial;
	private String firstTerminal;
	private String designDocument = "";
	
	public void setVersion(String nextVersion){
		this.version = nextVersion;
	}
	
	public void setSerial(String nextSerial){
		this.serial = nextSerial;
	}
	
	public void createNewModel(){
		this.firstTerminal = "あり";
	}
	
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
