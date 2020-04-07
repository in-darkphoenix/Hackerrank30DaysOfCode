package day21to30;

import java.util.Scanner;

public class Prime$25 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
         if(n==1){
             System.out.println("Not prime");
         }
         else{
     int ind=0;
     for(int i=2;i<=Math.sqrt(n);i++) {
         if(n%i==0) {
             ind=1;
             break;
         }
     }
     if(ind==0)
         System.out.println("Prime");
     else
         System.out.println("Not prime");
         }
	}

}
