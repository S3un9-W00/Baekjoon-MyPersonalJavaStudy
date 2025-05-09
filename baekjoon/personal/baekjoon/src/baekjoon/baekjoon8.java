package baekjoon;

import java.util.*;

public class baekjoon8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lengthh = sc.nextInt();
		
		HashSet<String> yet_array = new HashSet<>();
		
		for(int i = 0; i < lengthh; i++) {
			String word = sc.next();
			yet_array.add(word);
		}
		
		List<String> array = new ArrayList<>(yet_array);
		
		Collections.sort(array, new Comparator<String>(){ //사용자설정 정렬
			public int compare(String s1, String s2) { //오버라이딩
				if(s1.length() == s2.length()){
					return s1.compareTo(s2);
				} else {
					return s1.length() - s2.length();
				}
			}

		});
		
		for(String i: array) {
			System.out.println(i);
		}
		
		sc.close();
		
	}
}
