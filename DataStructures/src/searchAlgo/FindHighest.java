package searchAlgo;

public class FindHighest {

	static void binarySearchRecursive(int array[], int left, int right) {

		while (left <= right) {
			int mid = left + (right - left) / 2;
			System.out.println("mid->"+ mid);
			if (array[mid] < array[mid - 1] ) {
				right = mid - 1;
				
			} else if (array[mid + 1] > array[mid]) {
				left = mid+1;
				
			} else {
				System.out.println(array[mid]);
				break;
			}
		}

	}

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1 };
		int ar[] ={1, 3, 4, 5, 7, 8, 9, 5, 2 };
		binarySearchRecursive(ar, 0, array.length);
	}

}
