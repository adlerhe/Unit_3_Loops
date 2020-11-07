package while_loops_1;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number");
		int x=input.nextInt();
		
		System.out.println("enter a bigger number");
		int y=input.nextInt();
		
		while(x <= y)
		{
		x++;
		int z = x-1;
		System.out.println(z);
		if (x > y)
				break;
		}
	}
		
}
