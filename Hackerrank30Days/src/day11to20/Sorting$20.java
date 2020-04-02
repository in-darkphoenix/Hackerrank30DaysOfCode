package day11to20;

import java.util.Scanner;

public class Sorting$20 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scn.nextInt();
		}
		System.out.println("Array is sorted in "+bubbleSort(arr)+" swaps.");
		System.out.println("First Element: "+arr[0]);
		System.out.println("Last Element: "+arr[arr.length-1]);
	}
	
	public static int bubbleSort(int[] arr) {

		int n = arr.length;
		int ns=0;

		for (int count = 0; count <= n - 2; count++) {

			boolean flag = true;

			for (int j = 0; j <= n - count - 2; j++) {

				if (arr[j] > arr[j + 1]) {

					flag = false;

					// swap
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					ns++;
				}
			}

			if (flag)
				break;

		}
		return ns;

	}

}
