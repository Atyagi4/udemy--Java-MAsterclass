package challenge_task_inheritance_lec41;

// Challenge.
// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
// Finally, create another class, a specific type of Car that inherits from the Car class.
// You should be able to hand steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.
// For you specific type of vehicle you will want to add something specific for that type of car.
public class Main {
   
	public static void main(String[] args) {
		System.out.println("This is an example of Inheritance");
		Car porsche =new Car(120,"L",true,0,60,60,200,"Aditya Tyagi","5454545454","Black");
		//Car porsche =new Car();
		//Car Mercedes = new Car(120,"L",true,0,60,60,200,"Aditya Tyagi","5454545454","Black","Porsche");
		//Car BMW = new Car();
		System.out.println("The name of the car is: "+porsche.getCar_name());
		System.out.println("The name of the Car Owner is: "+porsche.getCar_owner());
		System.out.println("The color of the car is : "+porsche.getColor());
		System.out.println("THe car number is: "+porsche.getCar_no());
		porsche.speed();
		porsche.change_direction();
		porsche.isGear();
		porsche.change_gear();
		
		/*if(porsche.equals("Porsche")) {
			System.out.println("qwqwqwq");
		}
		else
			System.out.println("121212121");
		*/
		}
}
