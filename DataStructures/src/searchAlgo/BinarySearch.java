package searchAlgo;

public class BinarySearch {
	public static void main(String[] args) {

	}

	public static boolean bianarySearchRecursive(int[] array, int x, int left, int right) {
		if (left > right) {
			return false;
		}

		int mid = left + (right - left) / 2;

		if (array[mid] == x) {
			return true;
		} else if (array[mid] < x) {
			return bianarySearchRecursive(array, x, left, mid - 1);
		} else {
			return bianarySearchRecursive(array, x, mid + 1, right);
		}

	}

	public static boolean bianarySearchIterative(int[] array, int x) {
		int left = 0;
		int right = array.length;

		while (left <= right) {

			int mid = left + (right - left) / 2;

			if (array[mid] == x) {
				return true;
			} else if (array[mid] < x) {
				right = mid - 1;
				// return bianarySearchRecursive(array, x, left, mid - 1);
			} else {
				left = mid + 1;
				// return bianarySearchRecursive(array, x, mid + 1, right);
			}
		}
		return false;
	}
	
	
	///implement bianry serach for String datatype

}
