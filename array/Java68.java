package arrayMethod;

import java.util.Scanner;

public class Java68 {
	public static void main(String[] args) {
		int sum = 0;
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int m = sc.nextInt();
	int[][] arr= new int[n][m];
	for(int i = 0 ; i<n; i++) {
		for(int j = 0 ; j<m ; j++) {
			arr[n][m]=sc.nextInt();
		}
	}
	for(int i = 0 ; i<n ; i++) {
		for(int j = 0; j<m; j++) {
			if(arr[n][m] % 5 == 0) {
				sum +=arr[n][m];
			}
		}
	}
	System.out.println(sum);
	}

}
