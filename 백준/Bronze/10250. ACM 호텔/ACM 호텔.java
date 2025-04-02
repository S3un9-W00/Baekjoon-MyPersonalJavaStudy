import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			
			if(N % H == 0) {
				System.out.println((H*100)+(N/H));
			} else {
				System.out.println(((N%H)*100) + ((N/H)+1));
			}
		}
		
		sc.close();
	}
}