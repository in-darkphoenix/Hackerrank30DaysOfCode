package day1to10;

import java.util.Scanner;

public class Operators$2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double cost = scn.nextDouble();
		int tipp = scn.nextInt();
		int taxp = scn.nextInt();
		totalCost(cost, tipp, taxp);
	}

	public static void totalCost(double cost, int tipp, int taxp) {
		double ic = (cost * tipp) / 100 + (cost * taxp) / 100 + cost;
		long fc = Math.round(ic);
		System.out.println(fc);
	}

}
