package boj.study2_greedy.week3.day10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BOJ_11508 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		Integer[] arr = new Integer[num];
		
		for(int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr, Comparator.reverseOrder());
		
		int sum = 0;
		for(int i = 0; i < num; i++) {
			if(i % 3 == 2) {
				continue;
			}
			
			sum += arr[i];
		}
		System.out.println(sum);
	}
}
