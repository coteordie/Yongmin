package boj.study2_greedy.week01.day02;

import java.util.Scanner;

public class BOJ_10162 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int a = 0;
		int b = 0;
		int c = 0;
		
		if(num % 10 == 0) {
			a = num / 300;
			num %= 300;
			
			b = num / 60;
			num %= 60;
			
			c = num / 10;
			num %= 10;
			
			System.out.println(a + " " + b + " " + c);
		} else {
			System.out.println(-1);
		}
	}
}
