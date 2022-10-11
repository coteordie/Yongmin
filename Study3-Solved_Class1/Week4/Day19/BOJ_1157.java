package boj.study3_solved_class1.week4.day19;

import java.util.Scanner;

public class BOJ_1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int arr[] = new int[m];
		
		int max = 0;
		int sum = 0;
		double avg = 0.0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] > max) {
				max = arr[i];				
			}
			sum += arr[i];
		}
		avg = 100.0 * sum  / max / m;
		System.out.println(avg);
	}
}
