import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String Dong = sc.next();
		
		if(Dong.equals("M")) {
			System.out.println("MatKor");
		} else if(Dong.equals("W")) {
			System.out.println("WiCys");
		} else if(Dong.equals("C")) {
			System.out.println("CyKor");
		} else if(Dong.equals("A")) {
			System.out.println("AlKor");
		} else if(Dong.equals("$")) {
			System.out.println("$clear");
		}
	}
}