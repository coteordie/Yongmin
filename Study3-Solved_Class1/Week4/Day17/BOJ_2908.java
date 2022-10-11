package boj.study3_solved_class1.week4.day17;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ_2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		
		int num1 = Integer.parseInt(new StringBuffer(st.nextToken()).reverse().toString());
		int num2 = Integer.parseInt(new StringBuffer(st.nextToken()).reverse().toString());
		
		System.out.println(Math.max(num1, num2));
	}
}
