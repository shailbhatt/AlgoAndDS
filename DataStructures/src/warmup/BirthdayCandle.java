package warmup;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;



//sample input 
/*	4
	3 2 1 3
*/
public class BirthdayCandle {
	static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
		int tallestCount = 0;
        if(n>0){
            Arrays.sort(ar);
        
            for(int i=n-1;i>=0;i--){
                if(ar[n-1] == ar[i]){
                    tallestCount++;
                }
            }
        }
        return tallestCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
