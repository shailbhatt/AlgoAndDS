package tree;

import java.util.Stack;

public class InOrderUsingStack {

	Node root;

	void inOrder() {
		if (root == null) {
			return;
		}

		Stack<Node> s = new Stack();
		Node current = root;

		// first node to be visited will be the left one
		while (current != null) {
			s.push(current);
			current = current.left;
		}

		while (s.size()>0) {

			current = s.pop();
			System.out.print(current.data + " ");

			if (current.right != null) {
				current = current.right;

				while (current != null) {
					s.push(current);
					current = current.left;
				}
			}
		}
	}

	public static void main(String[] args) {
		InOrderUsingStack tree = new InOrderUsingStack();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.inOrder();
	}

}
