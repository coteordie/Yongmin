package boj.study3_solved_class1.week5.day23;

import java.util.Scanner;

public class BOJ_10809 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int[] arr = new int[26];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
 
		String S = in.nextLine();
 
		for(int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);
		
			if(arr[ch - 'a'] == -1) {
				arr[ch - 'a'] = i;
			}
		}
 
		for(int val : arr) {
			System.out.print(val + " ");
		}
	}
}
