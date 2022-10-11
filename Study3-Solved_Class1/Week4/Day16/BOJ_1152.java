package boj.study3_solved_class1.week4.day16;

import java.util.Scanner;

public class BOJ_1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().trim();
		
		if (input.isEmpty()) {
			System.out.println(0);
		} else {
			System.out.println(input.split(" ").length);
		}
	}
}
