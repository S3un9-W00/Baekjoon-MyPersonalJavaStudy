import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int burgerVal = 2000;
        int ummryoVal = 2000;
        
        for(int i = 0; i < 3; i++){
            int burger = sc.nextInt();
            if(burger < burgerVal){
                burgerVal = burger;
            }
        }
        
        for(int i = 0; i < 2; i++){
            int ummryo = sc.nextInt();
            if(ummryo < ummryoVal){
                ummryoVal = ummryo;
            }
        }
        
        System.out.println((burgerVal + ummryoVal) - 50);
        
        sc.close();
    }
}