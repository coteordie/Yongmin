package boj.study2_greedy.week3.day14;

import java.util.Scanner;

public class BOJ_20365 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String str = sc.next();
		
		int blue = 0;
		int red = 0;
		
		if(str.charAt(0) == 'B') {
			blue += 1;
		} else {
			red += 1;
		}
		
		char prev = str.charAt(0);
		
		for(int i = 1; i < str.length(); i++) {
			if(str.charAt(i) == prev) {
				continue;
			} else {
				if(str.charAt(i) == 'B') {
					blue +=1;
				} else {
					red += 1;
				}
			}
			prev = str.charAt(i);
		}
		
		if(blue > red) {
			System.out.println(1 + red);
		} else {
			System.out.println(1 + blue);
		}
	}

}
