package boj.study1_bruteforce.week1.day2;

import java.util.Scanner;

public class BOJ_2440 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(1 <= num && num <= 100) {
			for(int i = 1; i <= num; i++) {
				for(int j = i; j <= num; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
