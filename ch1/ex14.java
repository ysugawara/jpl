package ch1;

public class ex14 {

	/**
	 * �E�H�[�N�}���̃N���X
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
		this.firstTerminal = "����";
	}
	
	public void createDesignDocument(){
		this.designDocument += "�o�[�W�����F ";
		this.designDocument += this.version;
		this.designDocument += "%n";
		this.designDocument += "�V���A���i���o�[�F ";
		this.designDocument += this.serial;
		this.designDocument += "%n";
		this.designDocument += "�[�q�P�F ";
		this.designDocument += this.firstTerminal;
		this.designDocument += "%n";
		System.out.printf(this.designDocument);
	}

}
