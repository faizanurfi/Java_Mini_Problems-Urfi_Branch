class BinarySearchTreeTester {
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree(); 
		bst.insert(20);
		bst.insert(10);
		bst.insert(25);
		bst.insert(40);
		bst.insert(50);
		bst.insert(15);
		bst.insert(8);
		bst.insert(5);
		bst.insert(18);
		bst.insert(35);
		//System.out.println(bst.hasPathSum(135));
		//bst.mirror();
		//bst.doubleTree();
		//bst.printTree(); 
		System.out.println(bst.size()); 
	}
}