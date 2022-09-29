package boj.study2_greedy.week2.day7;

import java.util.Scanner;

public class BOJ_2864 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String strA = sc.next();
        String strB = sc.next();
        
        String maxA = "";
        String maxB = "";
        String minA = "";
        String minB = "";
        
        for (int i = 0; i < strA.length(); i++) {
            if (strA.charAt(i) == '5' || strA.charAt(i) == '6') {
                minA += "5";
                maxA += "6";
            } else {
                minA += strA.charAt(i);
                maxA += strA.charAt(i);
            }
        }
        
        for (int i = 0; i < strB.length(); i++) {
            if (strB.charAt(i) == '5' || strB.charAt(i) == '6') {
                minB += "5";
                maxB += "6";
            } else {
                minB += strB.charAt(i);
                maxB += strB.charAt(i);
            }
        }
        
        int min = Integer.parseInt(minA) + Integer.parseInt(minB);
        int max = Integer.parseInt(maxA) + Integer.parseInt(maxB);
        
        System.out.print(min + " " + max);
	}
}
