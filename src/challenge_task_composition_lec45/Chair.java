package challenge_task_composition_lec45;

public class Chair {
	private int number;
	private String material;
	
	public Chair() {
		super();
		this.number = 1;
		this.material = "SnadelWood";
	}

	private int getNumber() {
		return number;
	}

	private String getMaterial() {
		return material;
	}
	
	public String access() {
		System.out.println();
		System.out.println("Number of Chairs in each room: "+getNumber());
		System.out.println("Material used to manufacture Chair is: "+getMaterial());
		return"Chair has been accessed";
	}
}
