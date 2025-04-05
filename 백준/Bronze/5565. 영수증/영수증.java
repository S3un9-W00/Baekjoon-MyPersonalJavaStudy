import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tt = sc.nextInt();
		
		for(int i = 0; i < 9; i++) {
			int book = sc.nextInt();
			
			tt -= book;
		}
		
		System.out.println(tt);
		
		sc.close();
	}
}