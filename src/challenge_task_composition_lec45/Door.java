package challenge_task_composition_lec45;
//Create a single room of a house using composition.
//Think about the things that should be included in the room.
//Maybe physical parts of the house but furniture as well
//Add at least one method to access an object via a getter and
//then that objects public method as you saw in the previous video
//then add at least one method to hide the object e.g. not using a getter
//but to access the object used in composition within the main class
//like you saw in this video.
public class Door {

	private int length;
	private int width;
	private int number;
	private boolean is_Poster;
	
	public Door() {
		super();
		this.length = 20;
		this.width = 5;
		this.number = 1;
		this.is_Poster = true;
	}

	private int getLength() {
		return length;
	}

	private int getWidth() {
		return width;
	}

	private int getNumber() {
		return number;
	}

	private boolean isIs_Poster() {
		return is_Poster;
	}
	
	public String access() {
		System.out.println();
		System.out.println("The number of doors in the room is: "+getNumber());
		System.out.println("The lenght of door is: "+getLength());
		System.out.println("The lenght of door is: "+getWidth());
		System.out.println("Is there any poster in room: "+isIs_Poster());
		return"We have accessed door";
	}
	

}
