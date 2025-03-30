package baekjoon;
import java.util.*;

public class baekjoon5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] mushrooms = new int[10];
        for (int i = 0; i < 10; i++) {
            mushrooms[i] = sc.nextInt();
        }

        int sum = 0;
        int result = 0;

        for (int i = 0; i < 10; i++) {
            sum += mushrooms[i];

            if (Math.abs(100 - sum) < Math.abs(100 - result)) {
                result = sum;
            } else if (Math.abs(100 - sum) == Math.abs(100 - result)) {
                result = Math.max(result, sum);
            }
        }

        System.out.println(result);
		
		
		
		sc.close();
		
    }
}
