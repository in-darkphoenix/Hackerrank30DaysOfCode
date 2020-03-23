package day1to10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary$8 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		Map<String, Integer> t = new HashMap<String, Integer>();
		for(int i=0;i<n;i++) {
			String name=scn.next();
			int phone=scn.nextInt();
			t.put(name, phone);
		}
		while(scn.hasNext()) {
			String q=scn.next();
			if(t.containsKey(q)) {
				System.out.println(q+"="+t.get(q));
			}
			else {
				System.out.println("Not found");
			}
		}

	}

}
