package boj.study3_solved_class1.week4.day17;

import java.util.Scanner;

public class BOJ_2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = a * b * c;
		
		int[] count = new int[10];
		
		while(sum > 0) {
			count[sum % 10] ++;
			sum /= 10;
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(count[i]);
		}
	}
}
