package test;


public class ex14_2 extends ex14_1{

	/**
	 * 
	 */
	String twoWayCommunication = "あり";
	
	@Override
	public void createDesignDocument(){
		super.createDesignDocument();
		System.out.println("双方向コミュニケーション： " + this.twoWayCommunication);
	}

}
