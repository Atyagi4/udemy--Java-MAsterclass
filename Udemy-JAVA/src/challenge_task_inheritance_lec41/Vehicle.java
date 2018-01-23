package challenge_task_inheritance_lec41;

import java.util.Scanner;

// Challenge.
// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
// Finally, create another class, a specific type of Car that inherits from the Car class.
// You should be able to hand steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.
// For you specific type of vehicle you will want to add something specific for that type of car.
public class Vehicle {

	Scanner sc = new Scanner(System.in);
	//private String name;
	private int speed;
	private String hand_steering;
	//private String color;
	private boolean is_gear;
	private int current_gear;
	private int acc;
	private int decacc;
	public Vehicle( int speed, String hand_steering,  boolean is_gear, int current_gear,
			int acc, int decacc) {
		
		//this.name = name;
		this.speed = speed;
		this.hand_steering = hand_steering;
		//this.color = color;
		this.is_gear = is_gear;
		this.current_gear = current_gear;
		this.acc = acc;
		this.decacc = decacc;
	}
	public int getSpeed() {
		return speed;
	}
	public String getHand_steering() {
		return hand_steering;
	}
	public boolean isIs_gear() {
		return is_gear;
	}
	public int getCurrent_gear() {
		return current_gear;
	}
	public int getAcc() {
		return acc;
	}
	public int getDecacc() {
		return decacc;
	}
	
	public void speed() {
		System.out.println("Displaying: ");
		System.out.println("THe speed of the vehicle is: "+getSpeed());
		System.out.println("Press 1 for Acceleration  and 2 for deacceleration.");
		String input = sc.nextLine();
		if(input.contains("1")) {
			speed = speed+ acc;
			System.out.println("Speed is: "+speed);
		}
		else if(input.contains("2")) { 
			speed =speed- acc;
			System.out.println("Speed is: "+speed);
		}
		else 
			System.out.println("You have typed wrong input");
	}
	
	public void change_direction() {
		System.out.println("Press R for right turn and L for left turn");
		String input = sc.nextLine();
		if(input.equalsIgnoreCase("L"))
			System.out.println("You have taken Left turn");
		else if(input.equalsIgnoreCase("R"))
			System.out.println("You have taken Right turn");
		else
			System.out.println("Your direction is unchanged");
			
	}
	
	public void change_gear() {
		if(isIs_gear()) {
		System.out.println("Your current gear is :"+ getCurrent_gear());
		System.out.println("To increase gear press1"
							+ "To decrease Gear press 2");
		String input =sc.nextLine();
		if(input.contains("1")) {
			System.out.println(" Your current gear is: "+ (getCurrent_gear() +1));
			}
		else if(input.contains("2")) {
			
			System.out.println(" Your current gear is: "+(getCurrent_gear() -1));
			}
		}
		else
			System.out.println("Since this car is automatic, You can't change gears");
	}
	public void isGear() {
		System.out.println("Is this car automatic? ");
		if(isIs_gear())
			System.out.println("This car has gears");
		else if(!isIs_gear())
			System.out.println("Its automatic");
			
	}
	
	
	
	
	

	}

