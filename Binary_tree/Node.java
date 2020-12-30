package Binary_tree;

/*
 * @author Varun Chandan
 * Assignment 1 Binary tree
 */


public class Node {

	int value; // the value to be stored
    Node left; // left child
    Node right; // right child
 
    
 // Constructor for the leaf nodes
    
 public Node (int value){
	 this.value = value;
	 right = null;
	 left = null;
	 
 }
 // Empty Node
 public Node() {}
 
 // Create a new Node
 public Node newNode(int value, Node current) {
	 Node x = new Node(value);
	 x.value = value;
	 x.left = null;
	 x.right = null;
	 return x;
 }
 
 //Constructor for non-leaf nodes
 
 public Node(int val, Node lChild, Node rChild) {
	 this.value = val;
	 left = lChild;
	 right = rChild;
 }
public boolean search(int value) {
	// TODO Auto-generated method stub
	return false;
}
 
 
	 
 

 
 /* public boolean contains (int value, Node nodes) {
	
	 
	 if ( nodes == null) {
		return false;
	 } if (value == nodes.value) {
		 return true;
	 } if (value < nodes.value) {
		 return contains(value, nodes.left);
	 } else {
		 return contains(value, nodes.right);
	 }
	
	 
	 
	 
 }
*/
  
}