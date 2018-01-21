package challenge_task_composition_lec45;
//Create a single room of a house using composition.
//Think about the things that should be included in the room.
//Maybe physical parts of the house but furniture as well
//Add at least one method to access an object via a getter and
//then that objects public method as you saw in the previous video
//then add at least one method to hide the object e.g. not using a getter
//but to access the object used in composition within the main class
//like you saw in this video.
public class Room {
	private String owner;
	private int numbers;
	private Windows windows;
	private Door door;
	private Furniture furniture;
	private Bed bed;
	private Closet cl;
	private Studytable st;
	private Chair ch;
	
	public Room(Windows windows, Door door, Furniture furniture, Bed bed, Closet cl,
			Studytable st, Chair ch) {
		
		this.owner = "Aditya Tyagi";
		this.numbers = 4;
		this.windows = windows;
		this.door = door;
		this.furniture = furniture;
		this.bed = bed;
		this.cl = cl;
		this.st = st;
		this.ch = ch;
	}

	private String getOwner() {
		return owner;
	}

	private int getNumbers() {
		return numbers;
	}

	private Windows getWindows() {
		return windows;
	}

	private Door getDoor() {
		return door;
	}

	private Furniture getFurniture() {
		return furniture;
	}

	private Bed getBed() {
		return bed;
	}

	private Closet getCl() {
		return cl;
	}

	private Studytable getSt() {
		return st;
	}

	private Chair getCh() {
		return ch;
	}
	
	public void acceesEntry() {
		System.out.println("The composition of the Room ");
		System.out.println("The owner of the apartment is: "+getOwner());
		System.out.println("Number of Rooms in the apartment is: "+getNumbers());
		Windows ws = new Windows();
		System.out.println(ws.access());
		Door dr = new Door();
		//System.out.println(new Door().access());
		System.out.println(dr.access());
		//public Furniture(Bed bed, Closet closet, Studytable table, Chair chair)
		Bed bed = new Bed();
		Closet cl =new Closet();
		Studytable st =new Studytable();
		Chair ch = new Chair();
		Furniture fr = new Furniture(bed,cl,st,ch);
		//System.out.println(new Furniture(new Bed(), new Closet(),new Studytable(), new Chair()));
		System.out.println(fr.access());
	
	}

}
