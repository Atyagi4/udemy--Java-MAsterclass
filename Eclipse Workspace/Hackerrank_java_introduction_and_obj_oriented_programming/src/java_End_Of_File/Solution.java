package java_End_Of_File;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Hello world								
I am a file			
Read me until end-of-file.
*/

/* 
1 Hello world
2 I am a file		//Output
3 Read me until end-of-file. 
* */



public class Solution {
	public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);
		   for(int i = 1; scan.hasNext()== true; i++){
		       System.out.println(i + " " + scan.nextLine());
		   }
		   scan.close();
		}
}
