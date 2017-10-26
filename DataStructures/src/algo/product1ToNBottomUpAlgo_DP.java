package algo;

/**
 * Going bottom-up is a way to avoid recursion, saving the memory cost that
 * recursion incurs when it builds up the call stack. Put simply, a bottom-up
 * algorithm "starts from the beginning," while a recursive algorithm often
 * "starts from the end and works backwards."
 */

public class product1ToNBottomUpAlgo_DP {

	/*
	 * This approach has a problem: it builds up a call stack of size O(n)O(n),
	 * which makes our total memory cost O(n)O(n). This makes it vulnerable to a
	 * stack overflow error, where the call stack gets too big and runs out of
	 * space.
	 */
	public static int product1ToNRecursive(int n) {

		// top-down, recursive one-liner
		return (n > 1) ? (n * product1ToNRecursive(n - 1)) : 1;
	}

	/*
	 * Going bottom-up is a common strategy for dynamic programming problems,
	 * which are problems where the solution is composed of solutions to the
	 * same problem with smaller inputs
	 */
	
	public static int product1ToNBottomUp(int n) {
		int result = 1;
		
		// This approach uses O(1)O(1) space (O(n)O(n) time).
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}

}
