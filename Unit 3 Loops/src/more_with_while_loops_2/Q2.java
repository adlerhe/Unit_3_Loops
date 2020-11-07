package more_with_while_loops_2;

import java.util.Scanner;

public class Q2 {

	
	// !!! Notice!
	// This is the Second question in EASY Level
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number");
		int m = input.nextInt();
		for(int i = -m; i <= m; i++) {
			System.out.println(i);
		}

	}

}
