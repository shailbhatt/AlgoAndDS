package sort;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = {12, 11, 13, 5, 6};
		
		InsertionSort ob = new InsertionSort();        
        ob.sort(arr);
        
        printArray(arr);
	}
	
	void sort(int[] arr){
		int n = arr.length;
		
		for(int i=1; i<n ; i++){
			int key = arr[i];
			System.out.println("key->"+ key);
			int j = i-1;
			
			while(j>=0 && arr[j]>key){
				System.out.println("Enter While loop: j->"+ j);
				arr[j+1]= arr[j];
				System.out.println("arr["+(j+1)+"]=arr["+j+"]->"+ arr[j+1]);
				j= j-1;
				System.out.println("j->"+ j);
			}
			
			arr[j+1] = key;
			System.out.println("arr["+(j+1)+"]=key->"+ arr[j+1]);
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
