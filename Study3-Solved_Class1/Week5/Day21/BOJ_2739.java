package boj.study3_solved_class1.week5.day21;

import java.util.Scanner;

public class BOJ_2739 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}
}
