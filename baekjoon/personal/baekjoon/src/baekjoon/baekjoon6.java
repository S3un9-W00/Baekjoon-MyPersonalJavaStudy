package baekjoon;
import java.util.*;

public class baekjoon6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		int[] alpha = new int[26];
		
		for(int i = 0; i < alpha.length; i++) {
			alpha[i] = -1;
		}
		
		for(int i = 0; i < s.length(); i++) {
			char alphab = s.charAt(i);
			int in = alphab - 'a';
			
			if(alpha[in] == -1) {
				alpha[in] = i;
			}
		}
		
		for(int i = 0; i < alpha.length; i++) {
			System.out.print(alpha[i] + " ");
		}
		
		sc.close();
				
	}
}
