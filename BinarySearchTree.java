class BinarySearchTree{
	private Node root;

	private static class Node{
		Node left;
		Node right; 
		int data; 

		Node(int newData){
			left = null;
			right = null;
			data = newData; 
		}
	}

	public void BinarySearchTree(){
		root = null;
	}

	//public method call
	public boolean lookup(int data){
		return lookup(root,data);
	}

	//private implementation checking whether node is in the current Binary
	private boolean lookup(Node node, int data){
		if(node == null)
			return false; 

		if(data == node.data)
			return true;

		else if(data < node.data)
			return lookup(node.left, data);
		
		else
			return lookup(node.right, data);
	}

	public void insert(int data){
		root = insert(root,data);
	}

	private Node insert(Node node, int data){
		if(node == null)
			node = new Node(data); 
		else if(data<=node.data)
			node.left = insert(node.left, data);
		else
			node.right = insert(node.right, data);
		
		return node; 
	}

	/*build a simple Tree of 
							 2
						 	/ \
						  1   3 */ 

	public void build123a(){
		root = new Node(2);
		Node leftChild = new Node(1);
		Node rightChild = new Node(3);

		root.left = leftChild;
		root.right = rightChild;
	}

	public void build123b(){
		root = new Node(2);
		root.left = new Node(1);
		root.right = new Node(3);
	}

	public void build123c(){
		root = null;
		root = insert(root,2);
		root = insert(root,1);
		root = insert(root,3);
	}

	//get the number of elements in the tree
	public int size(){
		return(size(root));
	}

	private int size(Node node){
		if(node == null)
			return 0; 

		else
			return (size(node.left) + size(node.right)+1); 
	}

	//get max depth (root to leaf)
	public int maxDepth(){
		return maxDepth(root);
	}

	private int maxDepth(Node node) {
		if(node == null)
			return 0; 
		else 
			return (Math.max(maxDepth(node.left), maxDepth(node.right)) + 1); 
	}

	//return the min value in a non-empty BinarySearchTree
	public int minValue(){
		return minValue(root);
	}

	private int minValue(Node node){
		Node current= node; 
		while(current!= null){
			current = current.left;
		}

		return current.data; 
	}

	//return the max value in a non-empty BinarySearchTree
	public int maxValue(){
		return maxValue(root);
	}

	private int maxValue(Node node){
		Node current = node; 
		while(current!= null){
			current = current.right;
		}

		return current.data; 
	}


	//print the binary tree (In Order print)
	public void printTree(){
		printTree(root);
	}

	private void printTree(Node node){
		if(node == null) return; 

		printTree(node.left);
		System.out.print(node.data + " ");
		printTree(node.right);
	}

	//print postOrder
	public void printPostOrder(){
		printPostOrder(root);
		System.out.println();
	}

	private void printPostOrder(Node node){
		if(node == null) return;

		printPostOrder(node.left);
		printPostOrder(node.right);
		System.out.println(node.data + " ");
	}

	//checking if the BST contains a path to the sum 
	public boolean hasPathSum(int sum){
		return hasPathSum(root, sum);
	}

	private boolean hasPathSum(Node node, int sum){
		if(node == null) return (sum == 0);

		else{
			int subSum = sum - node.data; 
			return (hasPathSum(node.left, subSum) || hasPathSum(node.right, subSum));
		} 
	}

	//print ALL root to leaf paths in tree
	public void printPaths(){
		int [] path = new int[1000];
		printPaths(root, path, 0);
	}

	private void printPaths(Node node, int [] path, int pathLength){
		if(node == null) return;

		path[pathLength] = node.data; 
		pathLength++; 

		if(node.left == null && node.right == null)
			printArray(path, pathLength);
		
		else{
			printPaths(node.left, path, pathLength);
			printPaths(node.right, path, pathLength);
		}
	}

	//array helper to print each path
	private void printArray(int [] path, int pathSize){
		for (int i = 0;i<pathSize;i++) {
			System.out.println(path[i] + " ");
		}
		System.out.println(); 
	}



/*
 Changes the tree into its mirror image.
 So the tree...
       4
      / \ 
     2   5
	 /     \ 
   1       3
 is changed to...
       4
	   / \ 
	  5	 2
	 /     \ 
   3	     1
*/
	public void mirror(){
		mirror(root);
	}

	private void mirror(Node node){
		if(node != null){
			mirror(node.left);
			mirror(node.right);

			Node temp = node.left; 
			node.left = node.right;
			node.right = temp; 
		}
	}

	/* Changes the tree by inserting a duplicate node to each node's left
	
	  2
	 / \ 
	1   3

	is changed to...

	    2
      / \ 
     2   3
    /   / 
   1   3
  / 
 1

*/

	public void doubleTree(){
		doubleTree(root);
	}

	private void doubleTree(Node node){
		if(node == null) return;

		Node oldLeft; 

		doubleTree(node.left);
		doubleTree(node.right);

		oldLeft = node.left; 
		node.left = new Node(node.data);
		node.left.left = oldLeft; 
	}

	//checks if two binary trees are identical 

	public boolean sameTree(BinarySearchTree other){
		return (sameTree(root, other.root));
	}

	private boolean sameTree(Node a, Node b){
		if(a == null && b == null) return true;  //both empty

		else if(a!= null && b!=null) //both non- empty
			return 
				(a.data == b.data && 
				sameTree(a.left, b.left) && 
				sameTree(a.right, b.right)
				);
		else
			return false;  //one empty, one non-empty
	}

	public boolean isBST(){
		return isBST(root);
	}

	private boolean isBST(Node node){
		if(node == null) return true; 

		if(node.left != null && (maxValue(node.left) > node.data)) //checking each node as its own root
			return false;		//the node's left child should not have data > than itself
		if(node.right != null && (minValue(node.right) <= node.data)) // the node's right child should not have data < than itself
			return false; 

		return(isBST(node.left) && isBST(node.right)); //recall the method on its children if the above checks out
	}

}