package java_static_initializer_block;

import java.util.Scanner;

public class Solution {
	
	private static boolean flag;
	private static int B;
	private static int H;
	static {
		Scanner scan = new Scanner(System.in);
		  B = scan.nextInt();
		  H =scan.nextInt();
		
		  if((B>0 && B <100) &&( H > 0 && H< 100))
			     flag = true;
		  else 
			     System.out.println("java.lang.Exception: Breadth and height must be positive");
		scan.close();
	}

	public static void main(String[] args){
	if(flag){
		int area=B*H;
		System.out.print(area);
	}
	
}//end of main

}//end of class



