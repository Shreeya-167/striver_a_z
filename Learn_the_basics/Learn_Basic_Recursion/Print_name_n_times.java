package Learn_the_basics.Learn_Basic_Recursion;

public class Print_name_n_times {

    //T.C - O(N), S.C - O(N)

    public static void printName(String name, int n){

        if(n<=0) return;

        System.out.println("Shreeya");

        printName(name, --n);
        
    }
    
    public static void main(String[] args) {

        int n = 5;
        String name = "Shreeya";
        
        // for(int i=0; i<n; i++){
        //     System.out.println(name);
        // }

        printName(name, n);

    }

}
