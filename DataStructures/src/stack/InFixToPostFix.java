package stack;

import java.util.Scanner;
import java.util.Stack;

//Infix Notation: Operators are written between the operands they operate on, e.g. 3 + 4 .

//Prefix Notation: Operators are written before the operands, e.g + 3 4

//Postfix Notation: Operators are written after operands.
public class InFixToPostFix {

	static int prec(char ch) {
		switch (ch) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		}
		return -1;
	}

	static String infixToPostfix(String exp) {
		char[] cArray = exp.toCharArray();

		String result = "";

		Stack<Character> stack = new Stack();

		int size = cArray.length;

		for (int i = 0; i < size; ++i) {
			char ch = cArray[i];

			if (Character.isLetterOrDigit(ch)) {
				result += ch;
			} else if (ch == '(') {
				stack.push(ch);
			} else if (ch == ')') {
				while (!stack.isEmpty() && stack.peek() != '(') {
					result += stack.pop();
				}
				
				if (!stack.isEmpty() && stack.peek() != '(')
                    return "Invalid Expression"; // invalid expression                
                else
                    stack.pop();
				
			}else{
				while(!stack.isEmpty() && prec(ch) <= prec(stack.peek())){
					result += stack.pop();
				}
				stack.push(ch);
			}

		}
		
		while(!stack.isEmpty()){
			result += stack.pop();
		}

		return result;
	}
	
	public static void main(String[] args) {
		//String exp = "a+b*c+d";
		
		Scanner scan = new Scanner(System.in);
		String exp = scan.nextLine();
		
		System.out.print(infixToPostfix(exp));
	}
}
