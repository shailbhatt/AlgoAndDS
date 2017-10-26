package algo.recursion;

/*greatest common divisor (GCD) of two numbers, 
 * the largest number that divides 
 * both of them without leaving a remainder*/


public class EuclideanAlgo_GCD {
	public static void main(String[] args) {

		System.out.println("Using Recursion -> GCD of 10 and 45: "+gcd(10, 45));
		
		System.out.println("Using Euclidean -> GCD of 10 and 45: "+euclideanGcd(10, 45));
	}

	// Recursive function to return gcd of a and b
	static int gcd(int a, int b) {
		// Everything divides 0
		if (a == 0 || b == 0) {
			return 0;
		}

		// base case
		if (a == b) {
			return a;
		}

		// a is greater
		if (a > b) {
			return gcd(a - b, b);
		}
		return gcd(a, b - a);
	}

	// extended Euclidean Algorithm
	/*Extended Euclidean algorithm also 
	 * finds integer coefficients x and y such that:
	 *  ax + by = gcd(a, b) */
	public static int euclideanGcd(int a, int b) {
		if (a == 0)
			return b;

		return euclideanGcd(b % a, a);
	}
}
