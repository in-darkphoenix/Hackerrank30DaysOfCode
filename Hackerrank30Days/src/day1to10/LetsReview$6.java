package day1to10;

import java.util.Scanner;

public class LetsReview$6 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		for(int i=0;i<t;i++) {
			String q=scn.next();
			for(int j=0;j<q.length();j++) {
				if(j%2==0)
					System.out.print(q.charAt(j));
			}
			System.out.print(" ");
			for(int k=0;k<q.length();k++) {
				if(k%2!=0)
					System.out.print(q.charAt(k));
			}
			System.out.println();
		}
	}

}
