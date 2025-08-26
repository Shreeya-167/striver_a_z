package Learn_the_basics.Learn_Basic_Recursion;

public class Print_1_to_N {

    public static void print(int n, int i){

        if(i>n) return;
        System.out.println(i);
        print(n, ++i); //Not i++, it leads to stack overflow


    }
    public static void main(String[] args) {

        int n = 5;
        int i=1;
        print(n, i);
        
    }
}
