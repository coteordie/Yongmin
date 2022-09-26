package boj.study2_greedy.week01.day01;

import java.util.Scanner;

public class BOJ_11047 {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		int coin = sc.nextInt(); // 동전의 갯수
		int money = sc.nextInt(); // 잔돈
		
		int cnt = 0;
		int coinTypes[] = new int[coin]; // 동전의 종류
		for(int i = 0; i < coinTypes.length; i++) {
		    coinTypes[i] = sc.nextInt();
		}
		
		for (int i = coin-1; i >= 0; i--) {
		    if(coinTypes[i] <= money) {
		        cnt += money / coinTypes[i];
		        money %= coinTypes[i];
		    }
		    
		}
		
		System.out.println(cnt);
	}
}
