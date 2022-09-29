package boj.study1_bruteforce.week1.day1;

import java.util.Scanner;

public class BOJ_2231 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int con = n; // 생성자
		int res = 0; // 결과 값
		
		while(con > 0) {
			con--;
			int num = con; // 본인 저장
			int unit = con; // 각 자릿수를 구할 변수
			
			while(unit != 0) { // 10으로 나누었을때 몫이 0이면 모든 자릿수 검사 완료
				num += unit % 10; // 10으로 나누고 나머지를 더함 (1의 자리)
				unit /= 10; // 10으로 나누고 몫을 저장 (한 자릿수 씩 낮춰짐)
			} // while 다 돌면 자신 수 + 각 자릿수 다 더함
			
			if(num == n) {
				res = con;
			}
		}
		System.out.println(res);
	}
}
