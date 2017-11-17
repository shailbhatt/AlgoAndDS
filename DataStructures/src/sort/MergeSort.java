package sort;

public class MergeSort {

	public static void main(String[] args) {
		int arr[] = {12, 11, 13, 5, 6, 7};
		
        System.out.println("Given Array");
        printArray(arr);
 
        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length-1);
 
        System.out.println("\nSorted array");
        printArray(arr);
	}
	
	void sort(int[] arr , int l, int r){

		if(r>l){
		
			int m = l + (r-l)/2;
			
			sort(arr,l,m);
			
			sort(arr,m+1,r);
			
			merge(arr, l, m, r);
		}
		
	}
	
	void merge(int arr[], int l, int m, int r) {
		
		//find size of two sub array
		int n1 = m - l + 1 ;
		int n2 = r - m;
		
		/* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];
        
        /*Copy data to temp arrays*/
        System.arraycopy(arr, l, L, 0, n1);
        System.arraycopy(arr, m+1, R, 0, n2);
        
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
        int k = l;
        
        while(i<n1 && j <n2){
        	if(L[i] >= R[j]){
        		arr[k] = R[j];
        		j++;
        	}else{
        		arr[k] = L[i];
        		i++;
        	}
        	k++;
        }
        
        while(i<n1){
        	arr[k] = L[i];
        	i++;
        	k++;
        }
        
        while(j<n2){
        	arr[k] = R[j];
        	j++;
        	k++;
        }
        
	}
	
	 static void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
}
