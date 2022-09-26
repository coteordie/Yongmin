package boj.study2_greedy.week01.day05;

import java.util.Scanner;
import java.util.Arrays;

public class BOJ_11399 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] P = new int[n];
	    for (int i = 0; i < n; i++) {
	        P[i] = sc.nextInt();
			}
	
	    Arrays.sort(P);
	
	    int resultMemory = 0, result = 0;
	    for (int p : P) {
	        resultMemory += p;
	        result += resultMemory;
	    }
	    System.out.println(result);
	}
}
