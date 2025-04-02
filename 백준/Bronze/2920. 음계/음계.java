import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr_main = new int[8];
		
		for(int i = 0; i < 8; i++) {
			int eum = sc.nextInt();
			arr_main[i] = eum;
		}
	
		
		String text = "";
		
			
		for(int i = 0; i < arr_main.length - 1; i++) {
			
			if(arr_main[i+1] == arr_main[i] + 1) {
				text = "ascending";
			} else if(arr_main[i+1] == arr_main[i] - 1) {
				text = "descending";
			} else {
				text = "mixed";
                break;
			}
			
			
		}
		
		System.out.println(text);
		sc.close();
	
		
	}
}