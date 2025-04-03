import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			String room = sc.next();
			if(room.equals("Algorithm")) {
				System.out.println("204");
			}else if(room.equals("DataAnalysis")) {
				System.out.println("207");
			}else if(room.equals("ArtificialIntelligence")) {
				System.out.println("302");
			}else if(room.equals("CyberSecurity")) {
				System.out.println("B101");
			}else if(room.equals("Network")) {
				System.out.println("303");
			}else if(room.equals("Startup")) {
				System.out.println("501");
			}else if(room.equals("TestStrategy")) {
				System.out.println("105");
			}
			
		}
	}
}