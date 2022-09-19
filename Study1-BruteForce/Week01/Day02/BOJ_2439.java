package boj.study1_bruteforce.week01.day02;

import java.util.Scanner;

public class BOJ_2439 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(1 <= num && num <= 100) {
			for(int i = 1; i <= num; i++) {
				for(int j = 1; j <= num - i; j++) {
					System.out.print(" ");
				}
				for(int k = 1; k <= i; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
