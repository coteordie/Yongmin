package boj.study2_greedy.week3.day12;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_13164 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int result = 0;
		
		int member[] = new int[n];
		int diff[] = new int[n-1];
		
		for(int i = 0; i < n; i++) {
			member[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n - 1; i++) {
			diff[i] = member[i + 1] - member[i];
		}
		
		Arrays.sort(diff);
		
		for(int i = 0; i < n - k; i++) {
			result += diff[i];
		}
		
		System.out.println(result);
	}

}
