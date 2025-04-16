import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] A = new int[N];
		
		for(int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
		
		Stack<Integer> stack =  new Stack<Integer>();
		StringBuffer bf = new StringBuffer();
		
		int num = 1;
		boolean result = true;
		
		for(int i = 0; i < A.length; i++) {
			int su = A[i];
			if(su >= num) {
				while(su >= num) {
					stack.push(num++);
//					bf.append("+").append("\n");
					bf.append("+\n");
				}
				stack.pop();
//				bf.append("-").append("\n");
				bf.append("-\n");
			} else {
				int p = stack.pop();
				
				if(p != su) {
					System.out.println("NO");
					result = false;
					break;
				} else {
//					bf.append("-").append("\n");					
					bf.append("-\n");
				}
			
			}
		}
		if(result == true) {
			System.out.println(bf.toString());
		}
		
		sc.close();
		
	}
}
