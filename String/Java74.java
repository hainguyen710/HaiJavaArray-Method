package arrayMethod;

import java.util.Scanner;

public class Java74 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int answer=0;
		for(int i = 0; i<s.length(); i++) {
			if(s.charAt(i) >= 'A'&& s.charAt(i) <='Z') {
				answer++;
			}
		}
		System.out.println(answer);
				
	}

}
