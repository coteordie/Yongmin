package boj.study2_greedy.week01.day01;

import java.util.Scanner;

public class BOJ_5585 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int money = 1000;
		int coinTypes[] = {500, 100, 50, 10, 5, 1};
		int cnt = 0;
		int result = money - num;
		for(int i = 0; i < coinTypes.length; i++) {
			cnt += result / coinTypes[i];
			result %= coinTypes[i];
		}
		System.out.println(cnt);
	}
}
