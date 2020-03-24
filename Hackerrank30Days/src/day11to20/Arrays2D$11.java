package day11to20;

import java.util.Scanner;

public class Arrays2D$11 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[][] arr = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = scn.nextInt();
			}
		}

		int maxs = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1]
						+ arr[i + 2][j + 2];
				if (maxs <= sum)
					maxs = sum;
			}
		}
		System.out.println(maxs);
	}

}
