package Learn_the_basics.Learn_Basic_Recursion;

import java.util.Arrays;

public class Reverse_an_array {

    public static void reverse(int[] arr, int start, int end){

        if(start >= end) return;
        
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        
        // if(start == end) return;

        // System.out.println(arr[start]);

        reverse(arr, start+1, end-1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        reverse(arr, 0, arr.length-1);

        for(int num : arr){
            System.out.println(num +  " ");
        }



        // int n = arr.length-1;

        // int start = 0;
        // int end = arr.length-1;

        // for(int i=0; i<=arr.length; i++){
        //     int temp = arr[start];
        //     arr[start] = arr[end];
        //     arr[end] = temp;

        //     if(start == end) break;
            
        //     // System.out.println(arr[start]);
        //     // System.out.println(arr[end]);

        //     start++;
        //     end--;
            
        // }

        // for(int i=0; i<n; i++){
        //     System.out.print(arr[i] + " ");
        // }

        // // System.out.println(Arrays.toString(arr));



    }
    
}
