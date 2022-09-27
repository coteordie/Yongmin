package boj.study2_greedy.week01.day03;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2217 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int arr[] = new int[num];
		
		for(int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < num; i++) {
			max = Math.max(max, arr[i] * (num - i));
		}
		
		System.out.println(max);

	}

}
