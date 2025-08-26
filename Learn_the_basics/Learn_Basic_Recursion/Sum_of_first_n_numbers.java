package Learn_the_basics.Learn_Basic_Recursion;

public class Sum_of_first_n_numbers {

    public static int findSum(int n, int sum){   //Functional Way

        if(n<0) return sum;

        sum = sum+n;
        // n = n-1;
        return findSum(--n, sum);
 
    }

    public static int findSum(int n){
        if (n==0) return 0;
        return n + findSum(n-1);
    }

    public static void findSumParameterized(int n, int sum){
        if(n<1) {
            System.out.println(sum);
            return;
        }
        sum = sum + n;
        findSumParameterized(n-1, sum);
        

    }

    public static void main(String[] args) {

        int n = 10;
        // int i = 0;
        int sum = 0;

        findSumParameterized(n, sum);
        System.out.println(findSum(n, sum));
        System.out.println(findSum(n));
    }
    
}
