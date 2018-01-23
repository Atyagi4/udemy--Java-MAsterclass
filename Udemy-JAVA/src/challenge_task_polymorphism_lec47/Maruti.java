package challenge_task_polymorphism_lec47;
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
public class Maruti extends Car{
	
	public Maruti() {
		super("Maruti",2,"White",80);
	}
	public void StartEngine() {
		System.out.println("MArui has been started");
	}
	public void accelerate() {
		System.out.println("Maruti.accelerate() is inactive");
	}
	public void brake() {
		System.out.println("Maruti.brake() method is inactive");
	}
	public void ownFunct() {
		System.out.println("Maruti.ownFunct has been called");
	}
	}
