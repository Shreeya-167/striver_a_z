import java.util.Scanner;
public class Check_palindrome {
    // Problem Statement: Given an integer N, return true if it is a palindrome else return false.
    // https://takeuforward.org/data-structure/check-if-a-number-is-palindrome-or-not/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int n = input;
        int rev = 0;

        // T.C - O(log10N+1), S.C - O(1)
        while(n>0){
            int r = n%10;
            rev = r + rev*10;
            n = n/10;
        }

        // System.out.println(rev);

        if(rev == input){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    
}
}
