

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		//1-based 인덱스를 사용하기 위해 크기를 N+1로 설정
		int[] nums = new int[N+1];
		int[] prefix = new int[N+1];
		
		for (int i = 1; i <= N; i++) {
			nums[i] = sc.nextInt();
			prefix[i] = prefix[i-1] + nums[i];
		}
		
		for(int i = 0; i < M; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			System.out.println(prefix[end] - prefix[start - 1]);
		}
		sc.close();
	}
}
