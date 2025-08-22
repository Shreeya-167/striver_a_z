import java.util.Scanner;
public class Find_gcd_of_two_numbers {

    // Problem Statement: Given two integers N1 and N2, find their greatest common divisor.
    // https://takeuforward.org/data-structure/find-gcd-of-two-numbers/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int gcd = 0;
        int gcd2 = 0;
        int gcd3 = 0;

        // Brute force, T.C - O(min(N1, N2)), S.C - O(1)
        for(int i=2; i<=Math.min(n1, n2); i++){
            
            if(n1%i == 0 && n2%i == 0)
            gcd = i;
            
        }

        System.out.println(gcd);

        // Better approach; T.C - O(min(N1, N2)), S.C - O(1)
        // time complexity of this approach remains O(min(N1, N2)) but in practice, it will execute fewer iterations on average.
        for(int i = Math.min(n1, n2); i>1; i--){
            if(n1%i == 0  && n2%i == 0){
            gcd2 = i;
            break;
            }
        }

        System.out.println(gcd2);

        // Optimal Approach, T.C -  O(min(N1, N2)), S.C - O(1)
        // Euclidean algorithm

        while (n1>0 && n2>0) {
            if(n1>n2){
                n1 = n1%n2;
            } else {
                n2 = n2%n1;
            }
        }

        if(n1 == 0) gcd3 = n2;
        else gcd3 = n1;

        System.out.println(gcd3);

    }
}

