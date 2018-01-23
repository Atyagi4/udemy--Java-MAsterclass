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
public class Mercedes extends Car {

	public Mercedes() {
		super("Mercedes",3,"Silver",200);
		
	}
	public void startEngine() {
		System.out.println(getName()+" has initiated its Engine");
	}
}
