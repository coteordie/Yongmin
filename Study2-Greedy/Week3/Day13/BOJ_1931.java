package boj.study2_greedy.week3.day13;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1931 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int timeTable[][] = new int[num][2];
		
		for(int i = 0; i < num; i++) {
			timeTable[i][0] = sc.nextInt();
			timeTable[i][1] = sc.nextInt();
		}
		
		Arrays.sort(timeTable, (a, b) -> {
			if(a[1] == b[1]) return a[0] - b[0];
			return a[1] - b[1];
		});
		
		int cnt = 0;
		int time = 0;
		
		for(int i = 0; i < num; i++) {
			if(timeTable[i][0] >= time) {
				time = timeTable[i][1];
				cnt++;
			}
		}
		
		System.out.println(cnt);	
	}
}
