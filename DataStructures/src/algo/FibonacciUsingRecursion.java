package algo;

//recursive function for computing the nth Fibonacci number



/* A problem has "overlapping subproblems" if finding its solution involves solving the same subproblem multiple times.
 * As an example, let's look at the Fibonacci squence
 *  (the series where each number is the sum of the two previous ones—0,1,1,2,3,5,8...).*/

public class FibonacciUsingRecursion {

	public static int fibRecursive(int n) {

		if (n < 0) {
			throw new IllegalArgumentException();
		}

		// Base cases
		if (n == 0 || n == 1) {
			return n;
		}

		System.out.println(String.format("computing fibRecursive(%d)",n));

		return fibRecursive(n - 1) + fibRecursive(n - 2);
	}

	public static void main(String[] args) {
		System.out.println(fibRecursive(8));
	}

}

/*Our function ends up recursively calling fib(2) three times. 
 * So the problem of finding the nnth Fibonacci number has "overlapping subproblems".*/



//OUTPUT: 
/*computing fibRecursive(8)
computing fibRecursive(7)
computing fibRecursive(6)
computing fibRecursive(5)
computing fibRecursive(4)
computing fibRecursive(3)
computing fibRecursive(2)
computing fibRecursive(2)
computing fibRecursive(3)
computing fibRecursive(2)
computing fibRecursive(4)
computing fibRecursive(3)
computing fibRecursive(2)
computing fibRecursive(2)
computing fibRecursive(5)
computing fibRecursive(4)
computing fibRecursive(3)
computing fibRecursive(2)
computing fibRecursive(2)
computing fibRecursive(3)
computing fibRecursive(2)
computing fibRecursive(6)
computing fibRecursive(5)
computing fibRecursive(4)
computing fibRecursive(3)
computing fibRecursive(2)
computing fibRecursive(2)
computing fibRecursive(3)
computing fibRecursive(2)
computing fibRecursive(4)
computing fibRecursive(3)
computing fibRecursive(2)
computing fibRecursive(2)
21*/