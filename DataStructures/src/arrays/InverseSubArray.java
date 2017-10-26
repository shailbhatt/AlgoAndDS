package demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InverseSubArray {

	public static void main(String[] args) throws IOException {

		Scan sc = new Scan();

		int T = sc.scanInt(); // no of testcase
		
		while(T>0){
			int N = sc.scanInt(); // array size
			String arrayInput = sc.scanLine();
			String[] ip = arrayInput.trim().split("\\s+");
			int[] A = Arrays.stream(ip).mapToInt(Integer::parseInt).toArray();
					
//			Integer[] wrapperInt = Arrays.stream( A ).boxed().toArray( Integer[]::new );
//			List<Integer> result = LDS(wrapperInt);
			
			int result = lbs(A,N);
			
			  Print print=new Print();
		      print.println(result);
		      print.close();
			
			T--;
		}
		
	}
	
	   static int lbs( int arr[], int n )
	    {
	        int i, j;
	 
	        /* Allocate memory for LIS[] and initialize LIS values as 1 for
	            all indexes */
	        int[] lis = new int[n];
	        for (i = 0; i < n; i++)
	            lis[i] = 1;
	 
	        /* Compute LIS values from left to right */
	        for (i = 1; i < n; i++)
	            for (j = 0; j < i; j++)
	                if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
	                    lis[i] = lis[j] + 1;
	 
	        /* Allocate memory for lds and initialize LDS values for
	            all indexes */
	        int[] lds = new int [n];
	        for (i = 0; i < n; i++)
	            lds[i] = 1;
	 
	        /* Compute LDS values from right to left */
	        for (i = n-2; i >= 0; i--)
	            for (j = n-1; j > i; j--)
	                if (arr[i] > arr[j] && lds[i] < lds[j] + 1)
	                    lds[i] = lds[j] + 1;
	 
	 
	        /* Return the maximum value of lis[i] + lds[i] - 1*/
	        int max = lis[0] + lds[0] - 1;
	        for (i = 1; i < n; i++)
	            if (lis[i] + lds[i] - 1 > max)
	                max = lis[i] + lds[i] - 1;
	 
	        return max;
	    }
	public static int getDecreasingSegment(int[] segment, int N){
		int[] length = new int[N];
	    int maxStart = 0;
	    int maxEnd = 0;

	    for(int i = 1; i < segment.length; i++){

	        if(segment[i] < segment[i-1]){

	            length[i] = length[i-1]+1;

	            if(length[i] > length[maxEnd]){

	                maxEnd = i;
	                maxStart = maxEnd - length[maxEnd];

	            }

	        }else{

	            length[i] = 0;

	        }

	    }

	 

	    return maxEnd-maxStart+1;
	}
	
	
	private static int decreasing(int[] a) {
	    int result=1, temp=0, br=1;
	         
	        //Checking all the elements one by one:
	        for(int i=0;i<a.length;i++){
	            temp=a[i];  //placing the element on a temp value
	         
	        for(int j=i+1;j<a.length;j++) // I start another for cyclys, from the next element of a[i]
	        { 
	            if(a[j]<temp)                   // I start comparing if this element is SMALLER than the one I have
	            {                                    // if yes, put that element on temp 
	                temp=a[j];
	                br++;                        //and rise my counter (to keep track of the length of the decreasing array)
	            }
	                 
	        }
	            if(br>result)                   //when I finish comparing a[i] with all the elements to it's right, 
	                result=br;                  //i check if the length of the sub-array is longer than the one before
	            br=1;
	        }
	         
	         
	        return result;
	    }
	 static int CeilIndex(int A[], int l, int r, int key)
	 {
	     while (r - l > 1)
	     {
	         int m = l + (r - l)/2;
	         if (A[m]>=key)
	             r = m;
	         else
	             l = m;
	     }

	     return r;
	 }

	 static int LongestIncreasingSubsequenceLength(int A[], int size)
	 {
	     // Add boundary case, when array size is one

	     int[] tailTable   = new int[size];
	     int len; // always points empty slot

	     tailTable[0] = A[0];
	     len = 1;
	     for (int i = 1; i < size; i++)
	     {
	         if (A[i] < tailTable[0])
	             // new smallest value
	             tailTable[0] = A[i];

	         else if (A[i] > tailTable[len-1])
	             // A[i] wants to extend largest subsequence
	             tailTable[len++] = A[i];

	         else
	             // A[i] wants to be current end candidate of an existing
	             // subsequence. It will replace ceil value in tailTable
	             tailTable[CeilIndex(tailTable, -1, len-1, A[i])] = A[i];
	     }

	     return len;
	 }
	 
	 public static List<Integer> LDS(Integer[] A) {
		    int[] m = new int[A.length];
		    //Arrays.fill(m, 1);//not important here
		    for (int x = A.length - 2; x >= 0; x--) {
		      for (int y = A.length - 1; y > x; y--) {
		        if (m[x] <= m[y] && A[x] > A[y]) {
		          m[x]=m[y]+1;//or use m[x]++
		        }
		      }
		    }
		    int max = m[0];
		    for (int i = 0; i < m.length; i++) {
		      if (max < m[i]) {
		        max = m[i];
		      }
		    }
		    List<Integer> result = new ArrayList<Integer>();
		    for (int i = 0; i < m.length; i++) {
		      if (max == m[i]) {
		        result.add(A[i]);
		        max--;
		      }
		    }
		    return result;
		  }
}
