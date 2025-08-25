import java.util.Scanner;
public class Reverse_a_number {

    // Problem Statement: Given an integer N return the reverse of the given number.
    // https://takeuforward.org/maths/reverse-digits-of-a-number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // Brute force, T.C - O(L^2) where L is the number of digits in N, S.C - O(L)
        String nstr = String.valueOf(n);
        String s = "";
        char c;
        
        for(int i=nstr.length()-1; i>=0; i--){
            c = nstr.charAt(i);
            s = s+c;
        }

        // Optimal, T.C - O(log10N+1), S.C - O(1)
        int rev = 0;
        while(n>0){
            int r = n%10;
            rev = 10*rev + r;
            n = n/10;
        }

        System.out.println(rev);

        // Optimal, T.C - O(1), S.C - o(L)
        // StringBuilder sb = new StringBuilder();
        // for(int i = nstr.length() - 1; i >= 0; i--) {
        //     sb.append(nstr.charAt(i));
        // }
        // String s = sb.toString();
        

        System.out.println(s);

        sc.close();

    }
}