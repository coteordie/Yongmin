package boj.study3_solved_class1.week4.day17;

import java.util.Scanner;

public class BOJ_2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			int inputNum = sc.nextInt();
			String str = sc.next();
			
			for(int j = 0; j < str.length(); j++) {
				for(int k = 0; k < inputNum; k++) {
					System.out.print(str.charAt(j));
				}
			}
			System.out.println();
		}
	}
}
