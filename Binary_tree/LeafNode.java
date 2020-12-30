package Binary_tree;

import java.util.Collection;

public class LeafNode extends Node {
 // Initialize the collection of integer values
private Collection<Integer> values;
	
// Create a constructor for Leaf Node and store the values
  public LeafNode(Collection<Integer> values) {
	  this.values = values;
  }

	  
  // This function will search the given value and print true if it contains the value.
  public boolean search (int value) {
	  return values.contains(value);
  }
}
