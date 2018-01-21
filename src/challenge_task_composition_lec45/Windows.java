package challenge_task_composition_lec45;
//Create a single room of a house using composition.
//Think about the things that should be included in the room.
//Maybe physical parts of the house but furniture as well
//Add at least one method to access an object via a getter and
//then that objects public method as you saw in the previous video
//then add at least one method to hide the object e.g. not using a getter
//but to access the object used in composition within the main class
//like you saw in this video.
public class Windows {
	
	private int length;
	private int width;
	private int number;
	
	public Windows() {
		//super();
		this.length = 10;
		this.width = 12;
		this.number = 2;
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


	public String access() {
		System.out.println();
		System.out.println("No of windows in each room: "+getNumber());
		System.out.println("The length of the window is: "+getLength());
		System.out.println(	"The width of the window is : "+getWidth());
		return "We have accessed Windows";
	}
	

}
