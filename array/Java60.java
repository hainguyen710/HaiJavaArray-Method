package arrayMethod;

import java.util.Scanner;

public class Java60 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr= new int[n];
		for(int i =0; i < n; i++) {
			arr[i]=sc.nextInt();
			
		}
		int maxValue = arr[0];
		for(int i = 0 ; i<n; i++) {
			if(maxValue<arr[i]) {
				arr[i]=maxValue;
			}
		}
		System.out.println(maxValue);

	}

}
