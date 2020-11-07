package more_with_while_loops_2;

import java.util.Scanner;

public class Q1 {
	
// !!! Notice!
// This is the FIRST question in EASY Level
	
	
	public static void main(String[] args) {
		int a = 7;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("enter the magic number");
		int m=input.nextInt();
		
		
		while (m != a) {
			System.out.println("try again");	
			m=input.nextInt();
			
		if(m == a) {
			break;
		}
		
		
	}
		System.out.println("Nice job");
	}
}


