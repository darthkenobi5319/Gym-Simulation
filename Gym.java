
import processing.core.PApplet;

/**
 * This is the main program with applet; uses TreadMill, Stepper and Bicycle classes
 * @author Zhenghan Zhang
 *
 */
@SuppressWarnings("serial")
public class Gym extends PApplet{
	//dimensions of the canvas
	int xMax = 1100;
	int yMax = 1250;
	//instantiate classes
	TreadMill leoTreadMill = new TreadMill(10, 10.0);
	Stepper leoStepper = new Stepper(7);
	Bicycle leoBicycle = new Bicycle( 100.0 );

	public void setup() 
	{	
		size(xMax,yMax);
		textSize(20);
		fill(0,0,0);
		textAlign(LEFT);
		
	}
	

	public void draw() {
		background(255,255,255); 
		displayInfo(leoTreadMill, 50);
		starter(leoTreadMill, 220);
		ender(leoTreadMill, 220);
		displayInfo(leoStepper, 300);
		starter(leoStepper, 500);
		ender(leoStepper, 500);
		displayInfo(leoBicycle, 650);
		starter(leoBicycle, 850);
		ender(leoBicycle, 850);
}

	
	public void displayInfo(GymMachine item , int location) {
		fill(0,0,0);
		text(item.toString() , 100 , location);
		if (item.getStatus()) {
		fill(0,0,0);
		text("Start Time: " + item.getStartTime() , 100 , location + 50);
		fill(0,0,0);
		text("Time Elapsed in Seconds: " + item.getElapsedTime()/1000 , 100, location + 100);
		fill(0,0,0);
		text("Calories: "+ item.getCalories() , 100 , location + 150);
		}
		else {
			fill(0,0,0);
			text("Start Time: " + 0 , 100 , location + 50);
			fill(0,0,0);
			text("Time Elapsed in Seconds: " + 0 , 100, location + 100);
			fill(0,0,0);
			text("Calories: "+ 0 , 100 , location + 150);
		}
	}
	
	public void starter(GymMachine item , int location) {
		rect(100, location , 150, 50, 7);
		fill(255,255,255);
		text("Start" , 150 , location + 30);
		if (mouseY >= location && mouseY <= location+50 && mouseX >= 100 && mouseX <= 250) {
			if (mousePressed == true) {
				item.restart();
			}
		}
	
	}
	public void ender(GymMachine item , int location) {
		rect(300, location , 150, 50, 7);
		fill(0,0,0);
		text("End" , 350 , location + 30);
		if (mouseY >= location && mouseY <= location+50 && mouseX >= 300 && mouseX <= 450) {
			if (mousePressed == true) {
				item.end();
			}
		}
	
	}
}