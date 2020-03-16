package day1to10;

import java.util.Scanner;

public class Conditional$3 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		if(n%2==0) {
			if(n>=2&&n<=5) {
				System.out.println("Not Weird");
			}
			else if(n>=6&&n<=20) {
				System.out.println("Weird");
			}
			else {
				System.out.println("Not Weird");
			}
		}
		else {
			System.out.println("Weird");
		}
	}

}
