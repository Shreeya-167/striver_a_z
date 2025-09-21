package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Selection_Sort {

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    public static int min(int[] arr, int a){
        int min = Integer.MAX_VALUE;
        for(int i=a; i<arr.length; i++){
            // System.out.println(min);
            if(arr[i]<min) min = arr[i];
        }

        return min;
    }

    public static int[] selection_sort1(int[] arr){
        int a=0;
        for(int i=0; i<arr.length; i++){
            int min = min(arr, a);

            System.out.println(min + " Before swap");
            // swap(arr[i], min);
            int temp = arr[i];
            arr[i] = min;
            min = temp;
            a++;

            System.out.println(min + " After swap");
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

    // public static int[] selection_sort2(int[] arr){
    //     // int min = 0;
    //     for(int i=0; i<=arr.length-2; i++){
    //         int min = i;
    //         for(int j = i+1; j<arr.length; j++){
    //             if(arr[j]<arr[min]) {
    //             min = j; }
    //             swap(arr[min], arr[i]);
    //         }
            
    //     }       
    //     return arr;
    // }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] selection_sort2(int[] arr){
        for(int i = 0; i <= arr.length - 2; i++){
            int min = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[min]) 
                    min = j;
            }
            swap(arr, min, i);
        }       
        return arr;
    }


    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] arr = new int[n];

        // for(int i=0; i<n; i++){
        //     arr[i] = sc.nextInt();
        // }

        int[] arr = {2,100,5,99,8,34};

        System.out.println(Arrays.toString(arr));

        // System.out.println(min(arr), 1);
        
        System.out.println(Arrays.toString(selection_sort2(arr)));
        
    }
    
}