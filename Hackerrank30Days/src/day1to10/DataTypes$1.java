package day1to10;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DataTypes$1 {

	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);

		int z = scan.nextInt();
		double f = scan.nextDouble();
		String str = scan.nextLine();
		str += scan.nextLine();  //string input with spaces
		scan.close();

		
		int sz = i + z;
		double sf = d + f;
		String ans = s + str;
		System.out.println(sz);
		System.out.println(sf);
		System.out.println(ans);

		

		scan.close();
	}
}
