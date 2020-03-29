package day11to20;

import java.util.Scanner;

public class ExceptionString$16 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String s=scn.next();
		try {
			int si=Integer.parseInt(s);
			System.out.println(si);
		}catch(Exception e) {
			System.out.println("Bad String");
		}
		scn.close();
	}

}
