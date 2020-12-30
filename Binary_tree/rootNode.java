package Binary_tree;

import java.util.Collection;
import java.util.*;
// This function extends Node class in to rootNode class
public class rootNode extends Node {
	
	// Start of the range
	private int min;
	// end of the range
	private int max;
	 //collection of nodes 
	private Collection<Node>nodes;
	 
	//The constructor for the root class
	public rootNode(int min, int max, Collection<Node>nodes) {
		this.min = min;
		this.max = max;
		this.nodes = nodes;
	}
		
	
	// this function will search for the value on all the child nodes, if it lies in the range it will move on to this node
		// else if the value is in leaf node it will search for the value and print the boolean value
	
	
	public boolean search(int value) {
		for(Node node: this.nodes) {
			if(node instanceof rootNode) {
				if(value < this.min || value > this.max) {
					continue;
				}
			}
			if(node.search(value) == true) {
				return true;
				
			}
		}
		return false;
	}
		 
		 
	
		
	}


 