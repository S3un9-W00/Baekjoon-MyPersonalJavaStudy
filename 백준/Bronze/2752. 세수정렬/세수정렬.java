import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> array = new ArrayList<>();
		
		for(int i = 0; i < 3; i++) {
			int num = sc.nextInt();
			array.add(num);
		}
		
		Collections.sort(array);
		
		for(int arrayi : array) {
			System.out.print(arrayi + " ");
		}
	}
}