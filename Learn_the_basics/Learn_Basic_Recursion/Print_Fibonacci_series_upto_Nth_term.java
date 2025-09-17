package Learn_the_basics.Learn_Basic_Recursion;

public class Print_Fibonacci_series_upto_Nth_term {

    public static int printFibonacci(int n){

        if(n<=1) return n;

        return printFibonacci(n-1) + printFibonacci(n-2);

    }

    public static void main(String[] args) {

        int n = 6;
        
        System.out.println(printFibonacci(n));
        
    }
    
}
