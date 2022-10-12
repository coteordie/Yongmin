package boj.study3_solved_class1.week4.day18;

import java.util.Scanner;

public class BOJ_8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int num = sc.nextInt();
		String str;
		
		for(int i = 0; i < num; i++) {
			str = sc.next();
			int sum = 0;
			int cnt = 0;
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == 'O') {
					cnt++;
					sum += cnt;
				} else {
					cnt = 0;
				}
			}
			System.out.println(sum);
		}
	}
}
