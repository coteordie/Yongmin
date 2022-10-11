package boj.study3_solved_class1.week4.day16;

public class BOJ_10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		int max = -1000000;
		int min = 1000000;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < arr.length ; i ++) {
			if(arr[i] > max) {							
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min + " " + max);
	}
}
