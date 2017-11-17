package warmup;

import java.util.Scanner;

public class CandyLove {
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int k = sc.nextInt();
	        
	        int b[] = new int[n];
	        for(int i=0;i<n;i++){
	            b[i] = sc.nextInt();
	            
	            
	        }
	        
	        int result = findMinSec(k,b,n);
	        
	        System.out.println(result);
	    }
	    
	    static int findMinSec(int k, int[] b,int n){
	        int start = 0;
	        
	        int minSec = 0;
	        
	        int count = 0;
	        
	        for(int end = 1;end<n && count<2;end++){

	                if(b[end] == 1 && minSec == 0){
	                    minSec += Math.abs(start-end);
	                    start = end;
	                    count++;
	                    System.out.println("minSec"+minSec);
	                    System.out.println("count"+count);
	                    System.out.println("end"+end);
	                }else if(b[end] == 1){
	                	System.out.println("start"+start);
	                    minSec += (Math.abs(start-end)*k);
	                    start = end;
	                    count++;
	                    System.out.println("minSec"+minSec);
	                    System.out.println("count"+count);
	                    System.out.println("end"+end);
	                }

	        }
	        
	        return minSec;
	    }
}
