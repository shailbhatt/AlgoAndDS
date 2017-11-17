package stack;

import java.util.Stack;

public class PostFixEvalution {

	static int postfixEvalution(String exp) {
		char[] cArray = exp.toCharArray();
		int size = cArray.length;

		Stack stack = new Stack();
		for (int i = 0; i < size; i++) {
			char ch = cArray[i];
			if (Character.isDigit(ch)) {
				/*
				 * char that represents a ASCII/unicode digit (like '1'), and
				 * you subtract the smallest possible ASCII/unicode digit from
				 * it (e.g. '0'), then you'll be left with the digit's
				 * corresponding value (hence, 1)
				 */
				stack.push(ch - '0');
			} else {
				int val1 = (int) stack.pop();
				int val2 = (int) stack.pop();

				switch (ch) {
				case '+':
					stack.push(val1 + val2);
					break;
				case '-':
					stack.push(val1 - val2);
					break;
				case '*':
					stack.push(val1 * val2);
					break;
				case '/':
					stack.push(val1 / val2);
					break;
				case '^':
					stack.push(val1 ^ val2);
					break;
				}
			}
		}

		return (int) stack.pop();

	}

	public static void main(String[] args) {
		String exp = "231*+9-";
		System.out.println(postfixEvalution(exp));
	}
}
