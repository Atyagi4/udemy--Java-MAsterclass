package challenge_task_composition_lec45;
//Create a single room of a house using composition.
//Think about the things that should be included in the room.
//Maybe physical parts of the house but furniture as well
//Add at least one method to access an object via a getter and
//then that objects public method as you saw in the previous video
//then add at least one method to hide the object e.g. not using a getter
//but to access the object used in composition within the main class
//like you saw in this video.
public class Furniture {
	private int number;
	private Bed bed;
	private Closet closet;
	private Studytable table;
	private Chair chair;
	
	public Furniture(Bed bed, Closet closet, Studytable table, Chair chair) {
		super();
		this.number =4;
		this.bed = bed;
		this.closet = closet;
		this.table = table;
		this.chair = chair;
	}
	private int getNumber() {
		return number;
	}
	private Bed getBed() {
		return bed;
	}
	private Closet getCloset() {
		return closet;
	}
	private Studytable getTable() {
		return table;
	}
	private Chair getChair() {
		return chair;
	}
	
	public String access() {
		System.out.println();
		System.out.println("Total number of categories in Furniture: "+getNumber());
		System.out.println("Accesing Bed: "+new Bed().access());
		System.out.println("Accesing Closet: "+new Closet().access());
		System.out.println("Accessing StudyingTable: "+new Studytable().access());
		System.out.println("Accesing Chair: "+new Chair().access());
		return"All furniture of the apartment has been accessed";
	}
}
