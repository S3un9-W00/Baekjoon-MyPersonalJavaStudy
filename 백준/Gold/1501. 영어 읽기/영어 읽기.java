import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> words = new HashMap<>();

        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++){
            String word = sc.nextLine();
            String key = getKey(word);
            words.put(key, words.getOrDefault(key, 0) + 1);
        }

        int n2 = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n2; i++){
            String word = sc.nextLine();
            System.out.println(solution(word, words));
        }

        sc.close();
    }

    private static String getKey(String word){
        int n = word.length();
        if(n<=2) return word;

        char[] mid = word.substring(1, n - 1).toCharArray();
        Arrays.sort(mid);
        return word.charAt(0) + new String(mid) + word.charAt(n - 1);

    }

    private static int solution(String word, HashMap<String, Integer> map){
        String[] words = word.split(" ");
        int answer = 1;

        for(String word_ : words) {
            String key = getKey(word_);
            if(!map.containsKey(key)){
                return 0;
            }
            answer *= map.get(key);
        }
        return answer;
    }
}
