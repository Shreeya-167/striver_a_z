public class LargestElementInArray {

    public static void main(String[] args){

        int[] arr = {2, 5, 1, 3, 0};
        int max = Integer.MIN_VALUE;
        int smax = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                smax = max;
                max = arr[i];
            } else if(arr[i]>smax){
                
            }
        }

        System.out.println(smax);


    }
}