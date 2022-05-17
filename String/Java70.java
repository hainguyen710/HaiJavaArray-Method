package arrayMethod;

import java.util.Scanner;

public class Java70 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		String s = sc.next();
		char c = sc.next().charAt(0);
		for(int i = 0 ; i< s.length(); i ++) {
			if(s.charAt(i) == c) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
