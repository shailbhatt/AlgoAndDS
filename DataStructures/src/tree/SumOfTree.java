package tree;

public class SumOfTree {
	public static void main(String[] args) {
		BinaryTreeSum tree = new BinaryTreeSum();
		tree.root = new Node(10);
        tree.root.left = new Node(-2);
        tree.root.right = new Node(6);
        tree.root.left.left = new Node(8);
        tree.root.left.right = new Node(-4);
        tree.root.right.left = new Node(7);
        tree.root.right.right = new Node(5);
        
        tree.toSumTree(tree.root);
        
        tree.printInorder(tree.root);
	}

}


class BinaryTreeSum{
	
	Node root;
	
	int toSumTree(Node node){
		if(node == null){
			return 0;
		}

		// Store the old value
        int old_val = node.data;

        // Recursively call for left and right subtrees and store the sum
        // as new value of this node
        node.data = toSumTree(node.left) + toSumTree(node.right);
		return node.data + old_val;
	}
	
	 void printInorder(Node node) 
	    {
	        if (node == null)
	            return;
	        printInorder(node.left);
	        System.out.print(node.data + " ");
	        printInorder(node.right);
	    }
}