package tree;

public class PreOrderToInOrder {

	public static void main(String[] args) {
		int pre[] = { 10, 30, 20, 5, 15 };
		char[] preLN = { 'N', 'N', 'L', 'L', 'L' };
		
	/*	int a = 0;
		int b = 0;
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++b);
		System.out.println(b);*/
		
		BinaryTree bt = new BinaryTree();

		Node root =bt.buildTree(pre, preLN);
		
		bt.printInOrder(root);
	}

}


class BinaryTree {
	Node root;
	int preIndex = 0;
	int preLNIndex = 0;
	
	Node buildTree(int pre[], char[] preLN) {
		
		Node node = new Node(pre[preIndex++]);
		
		if(preLN[preLNIndex++] == 'L'){
			return node;
		}
		
		node.left = buildTree(pre,preLN);
		node.right = buildTree(pre,preLN);
		
		return node;
		
	}
	
	void printInOrder(Node root){
		if(root == null){
			return;
		}
		
		if(root.left != null){
			printInOrder(root.left);
		}
		
		System.out.print(root.data+ " ");
		
		if(root.right != null){
			printInOrder(root.right);
		}
	}
}