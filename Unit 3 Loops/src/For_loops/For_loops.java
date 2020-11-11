package For_loops;

import java.util.Scanner;

public class For_loops {

	public void Easier1() {
		int A = 65;
		for(int i = 0;i < 26;i++) {
			System.out.print((char)A);
			A++;
		}
		System.out.println();
	}
	
	public void Easier2(int x) {
		int sum = 0;
		for(int i = 1;i < x+1;i++) {
			sum= sum +i;
		}
		System.out.println(sum);
	}
	
	public void Easier3() {
		System.out.println("A type of creature: owning 4 legs as infant, 2 legs as teen, 3 for being old");
		Scanner input = new Scanner(System.in);
		System.out.println("enter the answer");
		String a = input.next();
		for(int i = -10000;i < 10000;i++ ) {
		if(a.equals("human-beings")) {
			System.out.println("you are correct!");
			break;
		}
		}
	}
	public void Harder1() {
		for(int i= 1;i < 13;i++) {
			for(int k = 1;k < 13;k++) {
				System.out.print(i*k);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	
	public void Harder2(double x) {
		
		for(int i = 2;i < x;i++) {
			
			for(int k = 2;k < x;k++) {
				if(i != k) {
				if(i%k == 0) {
					break;
				}
				}
				if(i%k != 0) {
					if(k == x-1) {
						System.out.print(i);
						System.out.println(" ");
					}
				}
			}
		}
	}
	
	public void Harder3(int x) {
	      int [][]odds = new int[x + 1][];
	      for (int n = 0; n <= x; n++)
	         odds[n] = new int[n + 1];  
	      for (int n = 0; n < odds.length; n++)
	         for (int k = 0; k < odds[n].length; k++)
	         {
	            int lotteryOdds = 1;
	            for (int i = 1; i <= k; i++)
	               lotteryOdds = lotteryOdds * (n - i + 1) / i;
	 
	            odds[n][k] = lotteryOdds;
	         }
	      for (int[] row : odds)
	      {
	         for (int odd : row)
	            System.out.printf("%4d", odd);
	         System.out.println();
	      }
	     // This is a code from the Internet, most of it is not my work, I can not solve this T_T
	}
	public static void main(String[] args) {
		For_loops runner = new For_loops();
		runner.Easier1();
		runner.Easier2(3);
		runner.Easier3();
		runner.Harder1();
		runner.Harder2(36);
		runner.Harder3(3);
		
	}
		

}
