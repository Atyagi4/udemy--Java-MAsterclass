package challenge_task_composition_lec45;

public class Bed {
	private int number;
	private String material;
	
	public Bed() {
		super();
		this.number = 1;
		this.material = "Wood";
	}

	private int getNumber() {
		return number;
	}

	private String getMaterial() {
		return material;
	}
	
	public String access() {
		System.out.println();
		System.out.println("Number of beds in each room: "+getNumber());
		System.out.println("Material used to manufacture bed is: "+getMaterial());
		return"Bed has been accessed";
	}

}
