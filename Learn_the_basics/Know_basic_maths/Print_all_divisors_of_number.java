import java.util.ArrayList;
import java.util.Scanner;

public class Print_all_divisors_of_number {
    // Problem Statement: Given an integer N, return all divisors of N.
    // https://takeuforward.org/data-structure/print-all-divisors-of-a-given-number/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Brute force, T.C - O(N), S.C - O(N)
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                arr[count++] = i;
            }
        }

        


        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        // arr = null;

        //Optimal Approach, T.C - O(sqrt(N)), S.C - O(2*sqrt(N))
        int n2 = sc.nextInt();
        
        ArrayList<Integer> al = new ArrayList<Integer>();

        int nsq = (int)Math.sqrt(n2);

        for(int i=1; i<=nsq; i++){
            if(n%i==0) {al.add(i);}
            if(i!=n/i) {al.add(n/i);};
        }

        System.out.println(al);

        sc.close();
    }
}
