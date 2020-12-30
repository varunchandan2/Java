package Binary_tree;

import java.util.*;

public class Main {
	
	

	
	
	public static void main(String[] args){
		
		// Lets create new nodes and store the values
		LeafNode ln1,ln2,ln3;
		rootNode rn1, rn2, rn3, rn4;
		
		ln1 = new LeafNode(new ArrayList<Integer>(){
			{
			add(100);
			add(120);
			add(140);
			add(160);
		}
		});
		
		ln2 = new LeafNode(new ArrayList<Integer>(){
			{
			add(200);
			add(220);
			add(240);
			add(260);
		}
		});
		
		ln3 = new LeafNode(new ArrayList<Integer>(){
			{
			add(300);
			add(320);
			add(340);
			add(360);
		}
		});
		
		
		
		// Order of initializing  is from bottom top for root nodes, we initialize the child nodes first
		
		
		
		// This function has min and max values as arguments
		rn4 = new rootNode(300, 399, new ArrayList<Node>() {
			{
				add(ln3);
				
				
			}
		});
		
		rn3 = new rootNode(201, 299, new ArrayList<Node>() {
			{
				add(ln2);
				add(rn4);
				
				
			}
		});
		
		rn2 = new rootNode(100, 199, new ArrayList<Node>() {
			{
				add(ln1);
				
			}
		});
		
		rn1 = new rootNode(1, 1000, new ArrayList<Node>() {
			{
				add(rn2);
				add(rn3);
				
				
			}
		});
		
		// Print the output for search results in the binary tree
		
		System.out.println("Search the number in binary tree:");
		System.out.println("Search for value 112 and the result is " + rn1.search(112));
		System.out.println("Search for value 78 and the result is  " + rn1.search(78));
		System.out.println("Search for value 15 and the result is  " + rn1.search(15));
	
		
	
		
		
		
		
	
		
		
	
	}
	
	
	
	
	
	

}
