package challenge_task_composition_lec45;
// Create a single room of a house using composition.
// Think about the things that should be included in the room.
// Maybe physical parts of the house but furniture as well
// Add at least one method to access an object via a getter and
// then that objects public method as you saw in the previous video
// then add at least one method to hide the object e.g. not using a getter
// but to access the object used in composition within the main class
// like you saw in this video.
public class Main {
	public static void main(String[] args) {
		//public Room(Windows windows, Door door, Furniture furniture)
		//public Furniture(Bed bed, Closet closet, Studytable table, Chair chair)
		Bed bed = new Bed();
		Closet cl =new Closet();
		Studytable st =new Studytable();
		Chair ch = new Chair();
		Furniture fr = new Furniture(bed,cl,st,ch);
		Windows ws = new Windows();
		Door dr = new Door();
		Room room =new Room(ws,dr, fr,bed,cl,st,ch);
		room.acceesEntry();
	}
	
}
