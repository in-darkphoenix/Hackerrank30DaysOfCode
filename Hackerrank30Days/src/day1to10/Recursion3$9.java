package day1to10;

import java.util.Scanner;

public class Recursion3$9 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(factorial(n));

	}

	public static int factorial(int n) {
		if (n == 1)
			return 1;

		int fnm1 = factorial(n - 1);

		int fn = fnm1 * n;
		return fn;
	}

}
