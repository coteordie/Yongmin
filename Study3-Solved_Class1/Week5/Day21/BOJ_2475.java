package boj.study3_solved_class1.week5.day21;

import java.util.Scanner;

public class BOJ_2475 {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int arr[] = new int[5];
	    int sum = 0;
	    
	    for(int i = 0; i < arr.length; i++) {
	        arr[i] = sc.nextInt();
	    }
	    
	    for(int i : arr) {
	        sum += i * i;
	    }
		System.out.println(sum % 10);
	}
}
