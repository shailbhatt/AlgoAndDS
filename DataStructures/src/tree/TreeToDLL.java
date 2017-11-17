package tree;

public class TreeToDLL {

	public static void main(String[] args) {
		/*int i=10;
		for(;i!=0;i--);
		
		System.out.println(i);*/
		
		BinaryTree2 tree = new BinaryTree2();
		  
        // Let us create the tree shown in above diagram
        tree.root = new Node(10);
        tree.root.left = new Node(12);
        tree.root.right = new Node(15);
        tree.root.left.left = new Node(25);
        tree.root.left.right = new Node(30);
        tree.root.right.left = new Node(36);
        
     // Convert to DLL
        Node head = tree.bintree2list(tree.root);
        
     // Print the converted list
        tree.printList(head);
  
	}
}

class BinaryTree2{
	Node root;
	
	Node binaryTreeToList(Node node){
		if(node == null){
			return node;
		}		
		if(node.left != null){
			Node left = binaryTreeToList(node.left);
			
			
			for(;left.right!=null;left = left.right);
			
			 // Make root as next of the predecessor
            left.right = node;
            System.out.println("node.data"+node.data);
            System.out.println("left.data"+left.data);
            // Make predecssor as previous of root
            node.left = left;
			
		}
		
		
		if(node.right != null){
			Node right = binaryTreeToList(node.right);
			
			 // Find inorder successor. After this loop, right
            // will point to the inorder successor
            for (; right.left != null; right = right.left);
  
            // Make root as previous of successor
            right.left = node;
            System.out.println("node.data"+node.data);
            System.out.println("right.data"+right.data);
            // Make successor as next of root
            node.right = right;
		}

		return node;
	}	
	
	 Node bintree2list(Node node) 
	    {
	        // Base case
	        if (node == null)
	            return node;
	  
	        // Convert to DLL
	        node = binaryTreeToList(node);
	  
	        // bintree2list returns root node of the converted
	        // DLL.  We need pointer to the leftmost node which is
	        // head of the constructed DLL, so move to the leftmost node
	        while (node.left != null)
	            node = node.left;
	  
	        return node;
	    }
	 

	    /* Function to print nodes in a given doubly linked list */
	    void printList(Node node) 
	    {
	        while (node != null) 
	        {
	            System.out.print(node.data + " ");
	            node = node.right;
	        }
	    }
}