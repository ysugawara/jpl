package ch2;

public class ex18 {
	//æ‚è•¨‚Ì¯•Ê”Ô†
	private static int IdentificationNumber;

	private long serialNumber;
	private double speed;
	private double angle;
	private String owner;
		
	//Ô‚ÌID
	private int carID;
		
	//‰ñ“]
	private static double TURN_LEFT = 60.0;
	private static double TURN_RIGHT = 35.0;
	
	//w’è‚·‚é‚¿å
	private static String inputOwner = "";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for (int i = 0; i < args.length; i++) {
			inputOwner += args[i];
		}
		
		ex18 Car = new ex18();
		Car.serialNumber = 1;
		Car.angle = 25.0;
		Car.speed = 65.0;
		Car.owner = getInputOwner();
		
		System.out.println("Owner: " + Car.owner);
		
	}

	/**
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	/**
	 * @return the identificationNumber
	 */
	public static int getIdentificationNumber() {
		return IdentificationNumber;
	}

	/**
	 * @param identificationNumber the identificationNumber to set
	 */
	public static void setIdentificationNumber(int identificationNumber) {
		IdentificationNumber = identificationNumber;
	}

	/**
	 * @return the serialNumber
	 */
	public long getSerialNumber() {
		return serialNumber;
	}

	/**
	 * @param serialNumber the serialNumber to set
	 */
	public void setSerialNumber(long serialNumber) {
		this.serialNumber = serialNumber;
	}

	/**
	 * @return the speed
	 */
	public double getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(double speed) {
		this.speed = speed;
	}

	/**
	 * @return the angle
	 */
	public double getAngle() {
		return angle;
	}

	/**
	 * @param angle the angle to set
	 */
	public void setAngle(double angle) {
		this.angle = angle;
	}

	/**
	 * @return the carID
	 */
	public int getCarID() {
		return carID;
	}

	/**
	 * @param carID the carID to set
	 */
	public void setCarID(int carID) {
		this.carID = carID;
	}

	/**
	 * @return the tURN_LEFT
	 */
	public static double getTURN_LEFT() {
		return TURN_LEFT;
	}

	/**
	 * @param tURN_LEFT the tURN_LEFT to set
	 */
	public static void setTURN_LEFT(double tURN_LEFT) {
		TURN_LEFT = tURN_LEFT;
	}

	/**
	 * @return the tURN_RIGHT
	 */
	public static double getTURN_RIGHT() {
		return TURN_RIGHT;
	}

	/**
	 * @param tURN_RIGHT the tURN_RIGHT to set
	 */
	public static void setTURN_RIGHT(double tURN_RIGHT) {
		TURN_RIGHT = tURN_RIGHT;
	}

	/**
	 * @return the inputOwner
	 */
	public static String getInputOwner() {
		return inputOwner;
	}

	/**
	 * @param inputOwner the inputOwner to set
	 */
	public static void setInputOwner(String inputOwner) {
		ex18.inputOwner = inputOwner;
	}

}
