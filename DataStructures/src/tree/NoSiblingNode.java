package tree;

public class NoSiblingNode {
	
	public static void main(String[] args) {
		BinaryTree1 tree = new BinaryTree1();
		
		tree.root = new Node(10);
		tree.root.left = new Node(30);
		tree.root.left.left = new Node(20);
		tree.root.left.left.right = new Node(5);
		tree.root.right = new Node(15);
		
		tree.printNoSiblingNode(tree.root);
	}

}



class BinaryTree1{
	Node root;
	
	void printNoSiblingNode(Node node){
		if(node == null){
			return;
		}
		
		if(node.left != null && node.right != null){
			printNoSiblingNode(node.left);
			printNoSiblingNode(node.right);
		}else if(node.left != null){
			System.out.print(node.left.data+ " ");
			printNoSiblingNode(node.left);
		}else if( node.right != null){
			System.out.print(node.right.data+ " ");
			printNoSiblingNode(node.right);
		}	
		
	}
	
}