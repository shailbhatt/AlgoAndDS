package warmup;

import java.util.Scanner;

public class MinMaxSum {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        int minSum = 0;
        int maxSum = 0;
        
        for(int i=0;i<5;i++){
            int tempSum = 0;
            for(int j=0;j<5;j++){
                if(i != j){
                    tempSum = Math.addExact(arr[j],tempSum);
                }
            }
            
            if(i !=0 && tempSum>maxSum){
            	System.out.println("i->"+ i+ " sum: "+ tempSum);
               maxSum = tempSum;
            }else if(tempSum<minSum){
               minSum = tempSum;
            }else{
               maxSum = tempSum;
               minSum = tempSum;
            }
        }
        
        System.out.print(minSum+ " "+ maxSum);
    }
}
