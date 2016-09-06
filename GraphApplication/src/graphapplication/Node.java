
package graphapplication;

import java.util.ArrayList;

/**
 *
 * @author nickromero
 */
public class Node {

    //Value of a Node
    private int value;
    
    //Node specifier
    private String name;
    
    //Data structure to hold all adjacent Node objects
    private ArrayList<Node> adjacentNodes;
    
    /**
     * Node constructor
     * @param value value to assign to a Node
     */
    public Node(int value, String name) {
        this.value = value;
        this.name = name;
        adjacentNodes = new ArrayList<Node>();
    }
    
    /**
     * Getter for a Node's name
     * @return String representation of the Node
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for this Node's list of adjacent Nodes
     * @return 
     */
    public ArrayList<Node> getAdjacentNodes() {
        return adjacentNodes;
    }
    
    /**
     * Getter for a Node's value
     * @return int the stored in a Node
     */
    public int getValue() {
        return value;
    }
    
    /**
     * Setter for a Node's value
     * @param newValue new value for the node
     */
    public void setValue(int newValue) {
        value = newValue;
    }
    
    /**
     * Add a Node to this Node's list of adjacent Nodes
     * @param adjNode Node to add
     */
    public void addAdjacentNode(Node adjNode) {
        adjacentNodes.add(adjNode);
    }
    
    /**
     * Remove a Node from this Node's list of adjacent Nodes
     * @param adjNode Node to remove
     */
    public void removeAdjacentNode(Node adjNode) {
        adjacentNodes.remove(adjNode);
    }

   
}
