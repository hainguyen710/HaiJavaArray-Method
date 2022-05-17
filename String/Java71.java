package arrayMethod;

import java.util.Scanner;

public class Java71 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int answer = -1;
		char c = sc.next().charAt(0);
		for(int i = 0 ; i < s.length();i++) {
			if(s.charAt(i) == c) {
				answer=i;
				break;
			}
		}
		System.out.println(answer);
	}

}
