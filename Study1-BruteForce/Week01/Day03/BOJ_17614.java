package boj.study1_bruteforce.week01.day03;

import java.util.Scanner;

public class BOJ_17614 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int clap = 0;
		int rest = 0;

		for(int i = 1; i <= num; i++) {
			
			int temp = i;
			
			while(temp > 0) {
				rest = temp % 10; 
				if(rest == 3 || rest == 6 || rest == 9) {
					clap++;
				}
				temp = temp / 10;
			}
		}
		System.out.println(clap);
	}
}
