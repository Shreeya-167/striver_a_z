package Learn_the_basics.Learn_Basic_Recursion;

public class Print_N_to_1_backTracking {

    public static void print(int i, int n){

        if(i>n) return;
        print(i+1, n);
        System.out.println(i);
    }

    public static void main(String[] args) {

        int n = 5;
        print(1, n);
        
    }
    
}
