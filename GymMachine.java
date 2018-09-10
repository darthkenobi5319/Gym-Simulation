
import java.util.*;
/**
 * This class severs as a base class for the three subclasses.
 * It contains some of the essential methods
 * @author Zhenghan Zhang
 * @since 24 Apr, 2018
 */
public class GymMachine{
	private Date startTime;
	private Date endTime;
	private long startTimeMill;
	private long endTimeMill;
	private long elapsedTime;
	private long calories;
	private boolean started;
	
	public GymMachine() {
		this.startTime = new Date();
		this.startTimeMill = System.currentTimeMillis();
	}
	
	public String toString() {
		return null;
	}
	
	/**
	 * This method gets the startTime of the program
	 * @return the Date data of the initialization
	 */
	public Date getStartTime() {
		return this.startTime;
	}
	
	public boolean getStatus() {
		return this.started;
	}
	/**
	 * This method should be called at the end of the program to get the current time
	 * @return the Date value at the time this method is called
	 */
	public Date getEndTime() {
		this.endTime = new Date();
		return this.endTime;
	}
	
	/**
	 * This method calculates the milliseconds passed since initialization and the calling of this method
	 * @return the long value of elapsed milliseconds
	 */
	public long getElapsedTime() {
		this.endTimeMill = System.currentTimeMillis();
		elapsedTime = endTimeMill - startTimeMill;
		return this.elapsedTime;
	}
	
	/**
	 * This method gives the calories calculated
	 * @return the long value of calories
	 */
	public long getCalories() {
		return this.calories;
	}
	

	public void restart() {
		this.started = true;
		this.startTime = new Date();
		this.startTimeMill = System.currentTimeMillis();
	}
	
	public void end() {
		this.started = false;
	}
}