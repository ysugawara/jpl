package ch1;

/*
 * test/ex14, test/ex14_1, test/ex14_2��p���Ċm�F
 */
public class ex14 {

	//�o�[�W����
	private String version;
	//���ʔԍ�
	private String serial;
	//��ڂ̒[�q
	private String firstTerminal;
	//�d�l
	private String designDocument = "";
	
	/**
	 * �o�[�W�����̐ݒ�
	 * @param nextVersion
	 * @return void
	 */
	public void setVersion(String nextVersion){
		this.version = nextVersion;
	}
	
	/**
	 * ���ʔԍ��̐ݒ�
	 * @param nextSerial
	 * @return void
	 */
	public void setSerial(String nextSerial){
		this.serial = nextSerial;
	}
	
	/**
	 * �V�K���f���̍쐬
	 * @return void
	 */
	public void createNewModel(){
		this.firstTerminal = "����";
	}
	
	/**
	 * �d�l���̍쐬
	 * @return void
	 */
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
