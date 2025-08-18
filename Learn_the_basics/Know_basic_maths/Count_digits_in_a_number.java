import java.util.Scanner;
public class Count_digits_in_a_number{

    // Problem Statement: Given an integer N, return the number of digits in N.
    // https://takeuforward.org/data-structure/count-digits-in-a-number/
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        //Optimal  //T.C - O(1), S.C - O(1)
        int counto = (int)(Math.log10(n)+1);
        System.out.println(counto);

        // Brute Force //T.C - O(log10N + 1), S.C - O(1)
        while(n>0){
            count++;        ////In the while loop we divide N by 10 until it becomes 0 which takes log10N iterations.
            n = n/10;
        }

        System.out.println(count);                
        
        sc.close();
    }
}
