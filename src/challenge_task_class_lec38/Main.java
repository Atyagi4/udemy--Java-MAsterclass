package challenge_task_class_lec38;

import java.util.Scanner;

// Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number.
// Create getters and setters for each field
// Create two additional methods
// 1. To allow the customer to deposit funds (this should increment the balance field).
// 2. To allow the customer to withdraw funds. This should deduct from the balance field,
// but not allow the withdrawal to complete if their are insufficient funds.
// You will want to create various code in the Main class (the one created by IntelliJ) to
// confirm your code is working.
// Add some System.out.println's in the two methods above as well.
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to our bank");
		BankAccount obj = new BankAccount();
		obj.setAcc_no("12122321");
		obj.setBal(100);
		obj.setCust_name("Aditya Tyagi");
		obj.setEmail("Tyagiaditya62@gmail.com");
		obj.setPhone_no(646644);
		menu();
		System.out.println(" Enter Your Choice");
		int choice = sc.nextInt();
		sc.nextLine();
		
		boolean flag = true;
		do {
			switch(choice) {
		
			case 1:
				System.out.println(obj.getAcc_no());
				break;
				/*System.out.println(" Press Y to continue and N for exit");
				String cont = sc.nextLine();
			
				if(cont.equalsIgnoreCase("Y")) {
					
				continue;
					
				}
				else
					System.exit(0);*/
				
			case 2:
				System.out.println(obj.getBal());
				flag = false;
				break;
			
			case 3:
				System.out.println(obj.getCust_name());
				flag = false;
				break;
			
			case 4:
				System.out.println(obj.getEmail());
				flag = false;
				break;
				
			case 5:
				System.out.println(obj.getPhone_no());
				flag = false;
				break;
				
			case 6:
				obj.deposit(obj.getBal());
				flag = false;
				break;
				
			case 7:
				obj.withdraw(obj.getBal());
				flag = false;
				break;
			
			
			default:
				System.out.println(" You have entered wrong choice, Please enter valid choice");
				flag = false;
				break;
			
			
		 }
		}while(flag);	
	}
	
	public static void menu() {
		System.out.println("\n Display menu\n");
		System.out.println("1. Display Account Number");
		System.out.println("2. Display your Balance");
		System.out.println("3. Display Your name");
		System.out.println("4. Display your Email id");
		System.out.println("5. Display Your phone Number");
		System.out.println("6. Deposit Money");
		System.out.println("7. Withdraw Money");
		System.out.println("8. To Reapeat Another Transaction");
		
	}

}
