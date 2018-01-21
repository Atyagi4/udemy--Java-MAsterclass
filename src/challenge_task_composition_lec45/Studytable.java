package challenge_task_composition_lec45;

public class Studytable {
	private int number;
	private String material;
	
	public Studytable() {
		super();
		this.number = 2;
		this.material = "CarbonWood";
	}

	private int getNumber() {
		return number;
	}

	private String getMaterial() {
		return material;
	}
	
	public String access() {
		System.out.println();
		System.out.println("Number of Studytable in each room: "+getNumber());
		System.out.println("Material used to manufacture Studytable is: "+getMaterial());
		return "Studytable has been accessed";
	}
}
