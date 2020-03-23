package day1to10;

import java.util.Scanner;

public class BinaryNumbers$10 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		long multiplier = 1;
		long ans = 0;

		while (n != 0) {

			long rem = n % 2;

			ans = ans + rem * multiplier;

			multiplier = multiplier * 10;
			n = n / 2;
		}
		int count = 0;
		int maxc = 0;
		String bn = Long.toString(ans);
		for (int i = 0; i < bn.length(); i++) {
			if (bn.charAt(i) == '1') {
				count++;
			} else {
				count=0;

			}
			if (maxc <= count)
				maxc = count;
		}
		System.out.println(maxc);

	}

}
