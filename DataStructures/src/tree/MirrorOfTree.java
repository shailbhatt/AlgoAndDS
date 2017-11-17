package tree;

public class MirrorOfTree {

	Node root;

	void mirror() {
		root = mirror(root);
	}

	Node mirror(Node node) {
		if (node == null) {
			return node;
		}

		Node left = mirror(node.left);
		Node right = mirror(node.right);

		node.left = right;
		node.right = left;

		return node;
	}

	void inOrder() {
		inOrder(root);
	}

	void inOrder(Node root) {
		if(root == null){
			return;
		}
		
		if(root.left != null){
			inOrder(root.left);
		}
		
		System.out.print(root.data+ " ");
		
		if(root.right != null){
			inOrder(root.right);
		}

	}

	public static void main(String[] args) {
		MirrorOfTree tree = new MirrorOfTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		/* print inorder traversal of the input tree */
		System.out.println("Inorder traversal of input tree is :");
		tree.inOrder();
		System.out.println("");

		/* convert tree to its mirror */
		tree.mirror();

		/* print inorder traversal of the minor tree */
		System.out.println("Inorder traversal of binary tree is : ");
		tree.inOrder();
	}

}
