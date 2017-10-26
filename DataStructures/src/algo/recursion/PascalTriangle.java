package algo.recursion;

/*The entry in the nth row and rth column of 
 * Pascal's triangle is denoted nPr
 * 
 * nPr = n!/(n-r)!
 * 
 * 
 * The number of combinations of n things taken r at a time: nCr = n!/r!(n-r)!
 */

//Output the first K rows of Pascal's triangle
public class PascalTriangle {
	// A O(n^2) time and O(n^2) extra space method for Pascal's Triangle
	static void printPascal(int n) {
		int[][] arr = new int[n][n]; // An auxiliary array to store generated
										// pscal triangle values

		// Iterate through every line and print integer(s) in it
		for (int line = 0; line < n; line++) {
			// Every line has number of integers equal to line number
			for (int i = 0; i <= line; i++) {
				// First and last values in every row are 1
				if (line == i || i == 0)
					arr[line][i] = 1;
				else // Other values are sum of values just above and left of above
					arr[line][i] = arr[line - 1][i - 1] + arr[line - 1][i];
				System.out.print(arr[line][i]+ " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		printPascal(4);
	}

}
