
public class TreadMill extends GymMachine{
	
	private int angle;
	private double mph;

	public TreadMill() {
		super();
	}
	public TreadMill(int angle, double mph) {
		this();
		this.setAngle(angle);
		this.setmph(mph);
	}
	/**
	 * This method sets the parameter "angle"
	 * @param angle an int between 1 and 15
	 */
	public void setAngle(int angle) {
		while (angle < 1 || angle > 15) {
			System.out.println("Invalid entry! Angle of Inclination must be between 1 and 15");
		}
		this.angle = angle;
	}
	
	/**
	 * This method sets the parameter "mph"
	 * @param mph a double between 1.0 and 15.0
	 */
	public void setmph(double mph) {
		if (mph < 1.0 || mph > 15.0) {
			System.err.println("Invalid entry! Miles per Hour must be between 1.0 and 15.0");
		}
		this.mph = mph;
	}
	
	
	public int getAngle() {
		return this.angle;
	}
	public double getmph() {
		return this.mph;
	}
	
	@Override
	/**
	 * the treadmill uses 20*mph + 15*angleOfInclination to calculate the calories
	 */
	public long getCalories() {
		long elapsedTime = super.getElapsedTime();
		long calories =  ((long) (20 * this.getmph() + 15 * this.getAngle()) * elapsedTime / 3600000);
		return calories;
	}
	
	@Override
	public String toString() {
		String name = "TreadMill with angle of Inclination of " + Integer.toString(this.getAngle())
						+ " and running at " + String.valueOf(this.getmph()) + " miles per hour.";
		return name;
	}
}