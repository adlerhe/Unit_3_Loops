package while_loops_1;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number");
		double m=input.nextInt();
		
		int x = 0;
		while (x*x != m) {
			
			if (x > m) {
				System.out.println("does not have a real root");
				break;
			}
			x++;
				
			}
		
			if (x < m) {
			System.out.println(x);
			}
		
		
	}

}
