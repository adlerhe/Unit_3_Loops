package more_with_while_loops_2;

import java.util.Scanner;

public class Q5 {

	
	// !!! Notice!
	// This is the THIRD question in MEDIUM Level
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("enter a number");
		int m = input.nextInt();
		for(int i = 1; i < m; i++) {
			if(m%i == 0) {
			System.out.println(i);
			}
		}
		
	}

}
