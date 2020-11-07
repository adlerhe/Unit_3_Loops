package unsolved_questions;

import java.util.Scanner;

public class Q4failed {
	
//Get 2 integers from the scanner, and print out their greatest common divisor.
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter two numbers");
		int m = input.nextInt();
		int n = input.nextInt();
		
		for(int a = m; a > 1; a--) {
			if(m%a == 0) {
				for(int i = n; i > 1; n--) {
					if(n%i == 0) {
						if(a == i) {
							System.out.println(a);
							break;
						}
					}
				}
				}
		}
	}

}
