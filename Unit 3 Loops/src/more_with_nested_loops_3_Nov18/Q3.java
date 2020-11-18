package more_with_nested_loops_3_Nov18;

import java.util.Scanner;

import For_loops.For_loops;

public class Q3 {
	public void Q3(int a, int b) {
		int m = 1;
		for(int i = 1; i <= 100; i++) {
			m = m * a;
			if(m == b) {
				System.out.println(i);
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		Q3 runner = new Q3();
		runner.Q3(2,32);
	}

}
