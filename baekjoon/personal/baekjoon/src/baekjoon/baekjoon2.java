package baekjoon;
import java.util.*;

public class baekjoon2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		
		
		int n = sc.nextInt();
		
		List<Integer> array = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();
			array.add(num);
		}
		
		Collections.sort(array);
		
		for(int cnt: array) {
			sb.append(cnt + "\n");
		}
		
		System.out.println(sb);
		
		sc.close();
		
    }
}
