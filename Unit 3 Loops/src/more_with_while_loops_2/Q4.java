package more_with_while_loops_2;

import java.util.Scanner;

public class Q4 {
	
	// !!! Notice!
	// This is the FIRST question in MEDIUM Level
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number");
		int m = input.nextInt();
		int product = 1;
		for(int i = 1; i <= m; i++) {
			
			 product = i * product;
			 }
		System.out.println(product);
		}
		
	}


