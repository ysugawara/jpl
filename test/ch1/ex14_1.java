package test;


public class ex14_1 extends ch1.ex14{

	String secondTerminal;
	/**
	 * �E�H�[�N�}�����Q�l�ŕ�����悤�ɒ[�q����ǉ�
	 */
	@Override
	public void createNewModel(){
		super.createNewModel();
		secondTerminal = "����";
	}
	
	@Override
	public void createDesignDocument(){
		super.createDesignDocument();
		System.out.println("�[�q�Q�F " + this.secondTerminal);
	}

}
