package boj.study1_bruteforce.week1.day4;

import java.util.Scanner;

public class BOJ_1436 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int jongmal = 666;
		int cnt = 1;
		
		while(cnt != num) {
			jongmal++;
			if(String.valueOf(jongmal).contains("666")) {
				cnt++;
			}
		}
		System.out.println(jongmal);
	}
}
