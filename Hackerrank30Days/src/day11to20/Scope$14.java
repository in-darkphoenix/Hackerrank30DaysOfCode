package day11to20;

import java.util.Scanner;

class Scope$14 {
	private int[] elements;
  	public int maximumDifference;
  	
  	Scope$14(int[] elements){
  		this.elements=elements;
  	}
  	
  	void computeDifference() {
  		int mdiff=Integer.MIN_VALUE;
  		int diff=0;
  		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length; j++) {
				diff=elements[i]-elements[j];
				int d=Math.abs(diff);
				if(mdiff<d)
					mdiff=d;
			}
		}
  		maximumDifference=mdiff;
  	}
  	
  	public static void main(String[] args) {
  		Scanner scn=new Scanner(System.in);
  		int n=scn.nextInt();
  		int[] arr=new int[n];
  		for (int i = 0; i < arr.length; i++) {
			arr[i]=scn.nextInt();
		}
		Scope$14 s=new Scope$14(arr);
		s.computeDifference();
		System.out.println(s.maximumDifference);
	}


}
