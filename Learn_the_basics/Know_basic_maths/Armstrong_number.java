import java.util.Scanner;

public class Armstrong_number {

    // Problem Statement: Given an integer N, return true it is an Armstrong number otherwise return false.
    // https://takeuforward.org/maths/check-if-a-number-is-armstrong-number-or-not/
    public static void main(String[] args) {
        // T.C - O(log10N + 1), S.C - O(1)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n;
        int arm = 0;
        while(n!=0){
            int r = n%10;
            // System.out.println(r);
            arm = (int)Math.pow(r, 3) + arm;
            n = n/10;
            // System.out.println(n);
        }

        // System.out.println(arm);

        if(arm == a){
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not Armstrong Number");
        }


    }
    
}
