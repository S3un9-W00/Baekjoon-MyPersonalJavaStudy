package baekjoon;
import java.util.*;

public class baekjoon3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double[] array = new double[n];
		
		double avg = 0;
		double sum = 0;
		
		if(n > 1000) {
			System.out.println(0);
		}else {
			for(int i = 0; i < array.length; i++) {
				int score = sc.nextInt();
				array[i] = score;
			}
			
			
			double max = array[0];
			
			for(int i = 0; i < array.length; i++) {
				if(max < array[i]) {
					max = array[i];
				}
			}
			
			
			for(int i = 0; i < array.length; i++) {
				array[i] = (array[i]/max)*100;
				sum += array[i];
			}
			
			avg = sum / n;
			System.out.println(avg);
			
		}
		
		
		sc.close();
		
    }
}
