package tree;

public class LevelOrderTree {
	
	Node root;
	
	int heightTree(Node node){
		if(node == null){
			return 0;
		}
		
		int lHeight = heightTree(node.left);
		int rHeight = heightTree(node.right);
		
		
		if(lHeight>rHeight){
			return lHeight+1;
		}else{
			return rHeight+1;
		}
	}
	
	void printGivenLevel(Node root ,int level){
		if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1)
        {
            printGivenLevel(root.left, level-1);
            printGivenLevel(root.right, level-1);
        }
	}
	
	void printLevelOrder(){
		int h = heightTree(root);
		
		for(int i=1;i<=h;i++){
			printGivenLevel(root,i);
		}
	}
	
	
	public static void main(String[] args) {
		   LevelOrderTree tree = new LevelOrderTree();
	       tree.root= new Node(1);
	       tree.root.left= new Node(2);
	       tree.root.right= new Node(3);
	       tree.root.left.left= new Node(4);
	       tree.root.left.right= new Node(5);
	       
	       System.out.println("Level order traversal of binary tree is ");
	       tree.printLevelOrder();
	}


}
