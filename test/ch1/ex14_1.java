package test;


public class ex14_1 extends ch1.ex14{

	String secondTerminal;
	/**
	 * ウォークマンを２人で聞けるように端子を一つ追加
	 */
	@Override
	public void createNewModel(){
		super.createNewModel();
		secondTerminal = "あり";
	}
	
	@Override
	public void createDesignDocument(){
		super.createDesignDocument();
		System.out.println("端子２： " + this.secondTerminal);
	}

}
