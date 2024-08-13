package Function;
import java.util.*;
class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}


public class BinaryTree {
	public TreeNode constructBinaryTree(int n) {
        if (n <= 1) {
            return null;
        }
        TreeNode root = new TreeNode(n);
        root.left = new TreeNode(n + 1);
        root.right = new TreeNode(n - 2);
        return root;
    }

    // Utility function to print the tree (pre-order traversal)
    public void printTree(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " ");
        printTree(node.left);
        printTree(node.right);
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BinaryTree tree = new BinaryTree();
	        int n = 21; // Change this to your desired value
	        TreeNode root = tree.constructBinaryTree(n);
	        System.out.println("Constructed Binary Tree:");
	        
	    }


	}


