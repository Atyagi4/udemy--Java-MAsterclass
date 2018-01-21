package challenge_task_class_lec38;

import java.util.Scanner;

//Create a new class for a bank account
//Create fields for the account number, balance, customer name, email and phone number.
//Create getters and setters for each field
//Create two additional methods
//1. To allow the customer to deposit funds (this should increment the balance field).
//2. To allow the customer to withdraw funds. This should deduct from the balance field,
//but not allow the withdrawal to complete if their are insufficient funds.
//You will want to create various code in the Main class (the one created by IntelliJ) to
//confirm your code is working.
//Add some System.out.println's in the two methods above as well.

public class BankAccount {
	private String acc_no;
	private int bal;
	private String cust_name;
	private String email;
	private double phone_no;
	Scanner sc = new Scanner(System.in);
	
	
	
	/*public BankAccount() {
		this("4564654545",500,"Ayushee Tyagi","ayushee.tyagi11@gmail.com",45654);
		System.out.println("EMpty constructor/default is called but with the help of 'this' we can initialise our fields even when empty constructor is called");
	}
	*/
	public String getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(String acc_no) {
		this.acc_no = acc_no;
	}
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(double phone_no) {
		this.phone_no = phone_no;
	}
	
	public void deposit(int bal) {
		
		System.out.println("You can deposit your money, please input your aditional money\n ");
		int input = sc.nextInt();
		System.out.println("Money has been deposited. Your total amount is: "+(bal+input));

}
	
	public void withdraw(int bal) {
		System.out.println("Please input the ammount of money that you want to withdraw\n");
		int input = sc.nextInt();
		if((bal-input)>=0)
			System.out.println("Money has been withdrawn. Your account balance is: "+(bal-input));
		else
			System.out.println("Cannot be proocessed due to insufficient funds/n");
	}
//sc.close();
}
