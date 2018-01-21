package oopsmasterchallengetask_lec50;
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
public class Healthyhamburger extends Hamburger{
	double price;
public Healthyhamburger() {
	super("Healthy meat", "brown rye bread roll",0.00);
	this.price = super.finalPrice(price);
	}

@Override
public void accees() {
	// TODO Auto-generated method stub
	super.accees();
	
	System.out.println("Do you want to add Spinach. Press Y for Yes and N for no");
	String inp = scan.nextLine();
	if(inp.equalsIgnoreCase("Y")) {
		System.out.println("Spinach added");
		this.price  =this.price+ 0.55;
		System.out.println("Now price is : "+this.price);
	}
	else 
		System.out.println("Spinach is not added. Price is "+this.price);

		System.out.println("Do you want to add Kale. Press Y for Yes and N for no");
		String in = scan.nextLine();
		if(inp.equalsIgnoreCase("Y")) {
		System.out.println("Kale added");
		this.price  =this.price+ 0.55;
		System.out.println("Now price is : "+this.price);
}
		else 
			System.out.println("Kale is not added. Price is "+this.price);
}
}
