package Learn_the_basics.Learn_Basic_Recursion;

public class Factorial {

    public static int findFact(int n, int fact){  //Functional

        if(n<1) return fact;

        fact = fact*n;

        return findFact(--n, fact);
    }

    public static void findFactParameterized(int n, int fact){  //Parameterized
        if(n<1){
            System.out.println(fact);
            return;
        }
        fact = fact*n;
        findFactParameterized(n-1, fact);
    }

    public static void main(String[] args) {
        int n = 5;
        int fact = 1;

        System.out.println(findFact(n, fact));
        findFactParameterized(n, fact);

    }
}