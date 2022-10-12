package boj.study3_solved_class1.week4.day18;

import java.util.Scanner;

public class BOJ_3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int arr[] = new int[10];
		int temp = 0;
		int cnt = 0;
		
		for(int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt() % 42;
		}
		
		for(int i = 0; i < 10; i++) {
			temp = 0;
			for(int j = i + 1; j < 10; j++) {
				if(arr[i] == arr[j]) {
					temp++;
				}
			}
			if(temp == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
