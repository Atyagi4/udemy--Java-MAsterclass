package oopsmasterchallengetask_lec50;

import java.util.Scanner;

//The purpose of the application is to help a ficticious company called Bills Burgers to manage their process of selling hamburgers.
//Our application will help Bill to select types of burgers, some of the additional items (additions) to
//be added to the burgers and pricing.
//We want to create a base hamburger, but also two other types of hamburgers that are popular ones in
//Bills store.
//The basic hamburger should have the following items.
//bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
//the customer can select to be added to the burger. Each one of these items gets charged an additional
//price so you need some way to track how many items got added and to calculate the price (for the base
//burger and all the additions).
//This burger has a base price and the additions are all seperately priced.
//Create a Hamburger class to deal with all the above.
//The constructor should only include the roll type, meat and price.
//Also create two extra varieties of Hamburgers (classes) to cater for
//a) Healthy burger (on a brown rye bread roll), plus two addition items can be added.
//The healthy burger can have a total of 6 items (Additions) in total.
//hint:  you probably want to process the 2 additional items in this new class, not the base class,
//since the 2 additions are only appropriate for this new class.
//b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
//hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
//object is created, and then prevent other additions being made.
//All 3 classes should have a method that can be called anytime to show the base price of the hamburger
//plus all additionals, each showing the addition name, and addition price, and a grand total for the burger
//For the two additional classes this may require you to be looking at the base class for pricing and then
//adding totals onto that.
public class Hamburger {
	private String meat_type;
	private String bread_type;
	private double price;
	
	Scanner scan = new Scanner(System.in);
	
	

	public Hamburger(String meat_type, String bread_type, double price) {
		this.meat_type = meat_type;
		this.bread_type = bread_type;
		this.price = price;
	}



	public String getMeat_type() {
		return meat_type;
	}



	public String getBread_type() {
		return bread_type;
	}

	public double getPrice() {
		return price;
	}
	
	
	public void accees() {
		//System.out.println("Classic Hamburger: $2.99");
		System.out.println("bread_type in the burger: "+getBread_type());
		System.out.println("Type of meat is: "+getMeat_type());
		System.out.println("Price: "+getPrice());
		System.out.println("Do you want to add lettuce. Press Y for Yes and N for no");
		String inp = scan.nextLine();
		if(inp.equalsIgnoreCase("Y")) {
			System.out.println("Lettuce added");
			double price  =getPrice()+ 0.55;
			this.price = price;
			System.out.println("Now price of the classic hamburger is: "+this.price);
		}
		else 
			System.out.println("Lettuce is not added. Price is "+getPrice());
		System.out.println("Do you want to add tomato. Press Y for Yes and N for no");
		String inp2 =scan.nextLine();
		if(inp2.equalsIgnoreCase("Y")) {
			System.out.println("Tomato is added");
			double price  =getPrice()+ 0.55;
			this.price = price;
			System.out.println("Now price of the classic hamburger is:  " +this.price);
		}
		else
			System.out.println("tomato is not added. Price is : " +this.price);
		System.out.println("DO you want to add carrot. Press Y for yes & N for No");
		String inp3 =scan.nextLine();
		if(inp3.equalsIgnoreCase("Y")) {
			System.out.println("Carrot added");
			double price  =getPrice()+ 0.55;
			this.price = price;
			System.out.println("Now price of the classic hamburger is: "+this.price);
		}
		else
			System.out.println("Carrot is not added,Price is:" +getPrice());
		System.out.println("DO you want to add Green Pepper. Press Y for yes & N for No");
		String inp4 =scan.nextLine();
		if(inp3.equalsIgnoreCase("Y")) {
			System.out.println("Green Pepper added");
			double price  =getPrice()+ 0.55;
			this.price = price;
			System.out.println("Now price of the classic hamburger is: "+this.price);
		}
		else
			System.out.println("Green Pepper is not added,Price is:" +getPrice());
		finalPrice(getPrice());
	}
	public double finalPrice(double price) {
		System.out.println(price);
		return price;
	}
	
	
	
	
}
