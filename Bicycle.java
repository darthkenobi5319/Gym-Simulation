
public class Bicycle extends GymMachine{
	
	private double rpm;
	
	public Bicycle() {
		super();
	}
	public Bicycle(double rpm) {
		this();
		this.setrpm(rpm);
	}

	/**
	 * This method sets the parameter "rpm"
	 * @param rpm a double between 1and 150
	 */
	public void setrpm(double rpm) {
		if (rpm < 1 || rpm > 150) {
			System.err.println("Invalid entry! Revolutions per Minute must be between 1 and 150");
		}
		this.rpm = rpm;
	}
	

	public double getrpm() {
		return this.rpm;
	}
	
	@Override
	/**
	 * the Bicycle uses 10*rpm
	 */
	public long getCalories() {
		long elapsedTime = super.getElapsedTime();
		long calories =  ((long) (10 * this.getrpm() ) * elapsedTime / 3600000);
		return calories;
	}
	
	@Override
	public String toString() {
		String name = "Bicycle running at " + String.valueOf(this.getrpm()) + " revolutions per minute.";
		return name;
	}
}