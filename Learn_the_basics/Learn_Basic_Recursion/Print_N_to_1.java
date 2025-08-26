package Learn_the_basics.Learn_Basic_Recursion;

public class Print_N_to_1 {

    public static void print(int n){
        if(n<1) return;
        System.out.println(n);
        print(--n);
    }
    public static void main(String[] args) {

        int n =  5;
        print(n);
        
    }
}
