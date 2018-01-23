package challenge_task_encapsulation_lec47;
import java.util.Scanner;

public class Printerwewe {
	private int tonner_Lvl;
	private int pgs;
	private boolean is_duplex;
	Scanner sc = new Scanner(System.in);
	
	public Printerwewe(int tonner_Lvl, int pgs, boolean is_duplex) {
	
		if(tonner_Lvl >= -1 && tonner_Lvl <= 100 ) {
			this.tonner_Lvl = tonner_Lvl;
			
		}
		else {
			this.tonner_Lvl =-1;
		}
		System.out.println(this.tonner_Lvl );
		this.pgs = pgs;
		System.out.println(this.pgs);
		this.is_duplex = is_duplex;
		System.out.println(this.is_duplex);
	}

	private int getTonner_lvl() {
		return tonner_Lvl;
	}

	private int getPgs() {
		return pgs;
	}

	private boolean isIs_duplex() {
		return is_duplex;
	}
	
	public void print() {
		System.out.println("No of pages that you want to print");
		int input = sc.nextInt();
		if(is_duplex) {
			System.out.println("The printer is duplex");
			pgs = pgs+ input/2;
			System.out.println("Number of pages printed: "+getPgs());
		}
		else {
			System.out.println("The printer is not duplex");
			System.out.println(" Number of pages printed: "+getPgs());
		}
	}
	
	public void tonner() {
		System.out.println("Improving  tonner level");
		System.out.println("By how much percent do you want to increse tonner lvl");
		int inc =sc.nextInt();
		this.tonner_Lvl = this.tonner_Lvl + inc;
		System.out.println("The tonner lvl will be: "+getTonner_lvl());
	}
	
}