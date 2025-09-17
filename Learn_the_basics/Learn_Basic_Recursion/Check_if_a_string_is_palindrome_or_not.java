package Learn_the_basics.Learn_Basic_Recursion;

public class Check_if_a_string_is_palindrome_or_not {

    public static boolean check(String s, int start, int end){

        if(start>=end) return true;
        if(s.charAt(start)!=s.charAt(end)) {
            // System.out.println("Not a palindrome");
            return false;
        }

        check(s, start+1, end-1);
        return true;

    }

    public static void main(String[] args) {

        String s = "Conraddarno";
        System.out.println(check(s, 0, s.length()-1));
        
    }
    
}
