

public class TreeTest {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6};
		
		Node tree1 = createBST(arr);
		
		printLeaf(tree1);
		
		Node n1 = new Node(4);
		Node n2 = new Node (6);
		
		Node node = fCA(tree1, n1, n2);
		System.out.println("Common ancestor of " + n1.data + " and " + n2.data + " is "+ node.data);
		

	}
	
	public static Node createBST(int[] arr) {
		return createBST(arr, 0, arr.length-1);
	}
	
	public static Node createBST(int[] arr, int start, int end) {
		
		if (end<start) {
			return null;
		}
		
		int mid = (start+end)/2;
		
		Node root = new Node(arr[mid]);
		root.left = createBST(arr, start, mid-1);
		root.right = createBST(arr, mid+1, end);
		
		return root;
		
	}
	
	public static void printBST (Node root) {
		
	}
	
	public static void printLeaf (Node root) {
		
		if (root.left != null) {
			System.out.println("No left, should be 1: " + root.data);
			printLeaf(root.right);
		}
		if (root.right != null) {
			System.out.println("Never reach: " + root.data);
			printLeaf(root.left);
		}
		if (root.left == null && root.right == null) {
			System.out.println("Leaf:" + root.data);
		}
	}
	
	public static Node fCA(Node root, Node n1, Node n2) {
		if (root == null) {
			return null;
		}
		if (root.data == n1.data) {
			return root;
		}
		if (root.data == n2.data) {
			return root;
		}
		if (isAnc(root.left, n1) && isAnc(root.left, n2)) {
			return fCA(root.left, n1, n2);
		}
		if (isAnc(root.right, n1) && isAnc(root.right, n2)) {
			return fCA(root.right, n1, n2);
		}
		return root;
		
	}

	private static boolean isAnc(Node root, Node n) {
		if (root == null) {
			return false;
		}
		if (root.data == n.data) {
			return true;
		}
		
		return isAnc(root.left, n) || isAnc(root.right, n);
	}

}
