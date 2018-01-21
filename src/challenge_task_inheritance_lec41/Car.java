package challenge_task_inheritance_lec41;
// Challenge.
// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
// Finally, create another class, a specific type of Car that inherits from the Car class.
// You should be able to hand steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.
// For you specific type of vehicle you will want to add something specific for that type of car.
public class Car extends Vehicle {

	private int top_speed;
	private String car_owner;
	private String car_no;
	private String color;
	private String car_name;

public Car() {
	this(120,"L",true,0,60,60,200,"Aditya Tyagi","5454545454","Black");
	System.out.println("EMpty constructor/default is called but with the help of 'this' we can initialise our fields even when empty constructor is called");
}
public Car(int speed, String hand_steering, boolean is_gear, int current_gear, int acc, int decacc, int top_speed,
			String car_owner, String car_no, String color) {
		super(speed, hand_steering, is_gear, current_gear, acc, decacc);
		this.top_speed = top_speed;
		this.car_owner = car_owner;
		this.car_no = car_no;
		this.color = color;
		this.car_name ="Porsche";
		System.out.println("Parameterized Constructor called");
	}


	public String getCar_name() {
	return car_name;
}


	public int getTop_speed() {
		return top_speed;
	}


	public String getCar_owner() {
		return car_owner;
	}


	public String getCar_no() {
		return car_no;
	}


	public String getColor() {
		return color;
	}

}
