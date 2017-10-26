package algo;

import java.util.HashMap;
import java.util.Map;

/**
 * To avoid the duplicate work caused by the branching, 
 * we can wrap the function in a class that stores an instance variable,
 *  memo, that maps inputs to outputs. Then we simply:
 *
 * 	1. Check memo to see if we can avoid computing the answer for any given input, and
 *	2. Save the results of any calculations to memo.
 *
 */

//common strategy for dynamic programming problems is memoization.
public class FibonacciUsingMemo_DP {

	private static Map<Integer, Integer> memo = new HashMap();
	
	public static int fib(int n) {

        if (n < 0) {
            throw new IllegalArgumentException(
                "Index was negative. No such thing as a negative index in a series.");

        // base cases
        } else if (n == 0 || n == 1) {
            return n;
        }

        // see if we've already calculated this
        if (memo.containsKey(n)) {
            System.out.println(String.format("grabbing memo[%d]", n));
            return memo.get(n);
        }

        System.out.println(String.format("computing fib(%d)", n));
        int result = fib(n - 1) + fib(n - 2);

        // memoize
        memo.put(n, result);

        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(fib(8));
	}

}
