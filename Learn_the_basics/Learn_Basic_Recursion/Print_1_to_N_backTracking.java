package Learn_the_basics.Learn_Basic_Recursion;

public class Print_1_to_N_backTracking {

    public static void print(int i, int n){

        if(i<1) return;
        print(i-1, n);
        System.out.println(i);

    }

    public static void main(String[] args) {

        int n = 3;

        print(n, n);
        
    }
    
}
