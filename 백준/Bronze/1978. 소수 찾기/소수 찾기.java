import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
			
		int cnt = 0;
		
		for(int i = 0; i < n; i++) {
			int sosu = sc.nextInt();
			if(sosu == 1) {
				continue;
			}
			
			for(int j = 2; j <= sosu; j++) {
				if(j == sosu) {
					cnt++;
				}
				
				if(sosu % j == 0) {
					break;
				}
				
			}
			
		}	
		
		System.out.println(cnt);
		
		
	}
}