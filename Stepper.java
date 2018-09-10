
public class Stepper extends GymMachine{
	
	private int level;
	
	public Stepper() {
		super();
	}
	public Stepper(int level) {
		this();
		this.setLevel(level);
	}
	/**
	 * This method sets the parameter "level"
	 * @param level an int between 1 and 10
	 */
	public void setLevel(int level) {
		if (level < 1 || level > 10) {
			System.err.println("Invalid entry! Level must be between 1 and 10");
		}
		this.level = level;
	}
	
	
	public int getLevel() {
		return this.level;
	}

	
	@Override
	/**
	 *  the stepper uses 100 calories/hour times the level
	 */
	public long getCalories() {
		long elapsedTime = super.getElapsedTime();
		long calories =  ((long) (100 * this.getLevel()) * elapsedTime / 3600000);
		return calories;
	}
	
	@Override
	public String toString() {
		String name = "Stepper with " + Integer.toString(this.getLevel()) + " steps";
		return name;
	}
}