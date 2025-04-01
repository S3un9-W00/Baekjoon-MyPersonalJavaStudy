import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> crainarr = new ArrayList<>();
		List<Integer> boxarr = new ArrayList<>();
		
		int crainN = sc.nextInt();
		
		for(int i = 0; i < crainN; i++) {
			int crain = sc.nextInt();
			crainarr.add(crain);
		}
		
		Collections.sort(crainarr, Collections.reverseOrder());
		
		
		int boxN = sc.nextInt();
		
		for(int i = 0; i < boxN; i++) {
			int box = sc.nextInt();
			boxarr.add(box);
		}
		
		Collections.sort(boxarr, Collections.reverseOrder());
		
		int time = 0;
		int cnt = 0;
		
		while(cnt != boxarr.size()) {
			int boxin = 0;
			int mmm = 0;
			for(int i = 0; i < crainarr.size(); i++) {
				while(boxin < boxN) {
					int boxw = boxarr.get(boxin);
					if(boxw == 0) {
						boxin++;
					} else if(crainarr.get(i) >= boxw) {
						boxarr.set(boxin, 0);
						cnt++;
						mmm++;
						boxin++;
						break;
					} else {
						boxin++;
					}
				}
			}
			
			if(mmm == 0) {
				System.out.println("-1");
				return;
			}
			
			time++;
		}
		
		System.out.println(time);
		
	}
}
