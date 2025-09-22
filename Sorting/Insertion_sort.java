package Sorting;

import java.util.Arrays;

public class Insertion_sort {

    public static int[] insertion_sort(int[] arr){
        
        int n = arr.length;

        for(int i=0; i<=n-1; i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    j--;
            }
        }
        
        
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {14,9,15,12,6,8,13};

        System.out.println(Arrays.toString(insertion_sort(arr)));
    }
    
}
