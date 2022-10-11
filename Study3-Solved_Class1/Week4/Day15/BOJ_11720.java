package boj.study3_solved_class1.week4.day15;

import java.util.Scanner;

public class BOJ_11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String str = sc.next();
		int sum = 0;
		
		for(int i = 0; i < a; i++) {
			sum += Integer.parseInt(str.substring(i, i + 1));
		}
		System.out.println(sum);
	}
}
