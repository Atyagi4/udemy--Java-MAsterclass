package challenge_task_composition_lec45;

public class Closet {
	private int number;
	private String material;
	
	public Closet() {
		super();
		this.number = 5;
		this.material = "CarbonSteel";
	}

	private int getNumber() {
		return number;
	}

	private String getMaterial() {
		return material;
	}
	
	public String access() {
		System.out.println();
		System.out.println("Number of Closets in each room: "+getNumber());
		System.out.println("Material used to manufacture closets is: "+getMaterial());
		return"Closet has been accessed";
	}

}
