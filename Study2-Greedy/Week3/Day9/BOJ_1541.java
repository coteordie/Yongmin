package boj.study2_greedy.week3.day9;

import java.util.Scanner;

public class BOJ_1541 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = Integer.MAX_VALUE;
		String sub[] = sc.nextLine().split("-");
		
		for(int i = 0; i < sub.length; i++) {
			int result = 0;
			
			String add[] = sub[i].split("\\+");
			
			for(int j = 0; j < add.length; j++) {
				result += Integer.parseInt(add[j]);
			}
			
			if(sum == Integer.MAX_VALUE) {
				sum = result;
			} else {
				sum -= result;
			}
		}
		System.out.println(sum);
	}
}
