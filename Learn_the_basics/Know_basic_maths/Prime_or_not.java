import java.util.Scanner;

public class Prime_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 0;

        //Brute Force, T.C - O(N), S.C - O(1)
        for(int i=2; i<=n; i++){
            if (n%i==0 && i!=n) {
                System.out.println("Not Prime");
                break;
            } 

            p = i;
        }

        if(p==n) System.out.println("Prime");

        // System.out.println(p);
        
        // else {
        //     System.out.println("Not Prime");
        // }

        // Optimal Approach, T.C - O(sqrt(N), S.C - O(1)
        int n2 = sc.nextInt();
        int nsq = (int)Math.sqrt(n2);
        int count = 0;

        for(int i=1; i<=nsq; i++){
            if(n2%i==0){
                count++;
                // count = count+1;
                if(n2/i!=i) count++; //count = count+1;
            }
        }

        // System.out.println(count);
        if(count == 2){
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }


}

}
