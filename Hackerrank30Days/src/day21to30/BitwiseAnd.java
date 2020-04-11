package day21to30;

import java.util.Scanner;

public class BitwiseAnd {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		int max = Integer.MIN_VALUE;
		for (int i = 1; i <= n; i++) {
			for (int j = i + 1; j <= n; j++) {
				int r = i & j;
				if (r < k) {
					if (max < r)
						max = r;
				}
			}
		}
		System.out.println(max);
	}

}
