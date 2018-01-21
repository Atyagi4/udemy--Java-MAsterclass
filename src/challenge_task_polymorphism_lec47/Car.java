package challenge_task_polymorphism_lec47;

import java.util.Scanner;
//We are going to go back to the car analogy.
//Create a base class called Car
//It should have a few fields that would be appropriate for a generice car calss.
//engine, cylinders, wheels, etc.
//Constructor should initialize cylinders (number of) and name, and set wheels to 4
//and engine to true. Cylinders and names would be passed parameters.
//Create appropriate getters
//Create some methods like startEngine, accelerate, and brake
//show a message for each in the base class
//Now create 3 sub classes for your favorite vehicles.
//Override the appropriate methods to demonstrate polymorphism in use.
public class Car {
	private String name;
	private boolean engine;
	private int cylinders;
	private int wheels;
	private String color;
	private int speed;
	private int finalSpeed;
	Scanner sc = new Scanner(System.in);
	
	public Car(String name, int cylinders, String color, int speed) {
		
		this.name = name;
		this.engine = true;
		this.cylinders = cylinders;
		this.wheels = 4;
		this.color = color;
		this.speed = speed;
		this.finalSpeed = 0;
	}


	public String getName() {
		return name;
	}


	public boolean isEngine() {
		return engine;
	}


	public int getCylinders() {
		return cylinders;
	}


	public int getWheels() {
		return wheels;
	}


	public String getColor() {
		return color;
	}

	public int getSpeed() {
		return speed;
	}
	
	public void startEngine() {
		if(engine) {
			System.out.println("Engine started.");	
		}
		else
			System.out.println("Engine is not working");
		}

	public void accelerate() {
		System.out.println("Speed is: "+getSpeed());
		System.out.println("How much you want to acceearate");
		int acc = sc.nextInt();
		int finalSpeeed =getSpeed()+acc;
		System.out.println("Speed is: "+ finalSpeeed);
		
	}
	public void brake() {
		System.out.println("\nApplying brakes");
		System.out.println("Speed is: "+ getSpeed());
		int brake = sc.nextInt();
		if (brake == speed)
			System.out.println("Brake is applied");
		else if(brake < speed)
			System.out.println("Now speed is: "+(getSpeed()-brake));
		else 
			System.out.println("Brake's value is incoorect");
	}
}


