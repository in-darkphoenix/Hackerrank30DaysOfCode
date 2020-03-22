package day1to10;

import java.util.Scanner;

public class Loop$5 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int res=1;
		for (int i = 1; i <=10; i++) {
			res=n*i;
			System.out.println(n+" x "+i+" = "+res);
		}
	}
}
