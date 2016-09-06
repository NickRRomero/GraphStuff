package graphapplication;

import java.util.ArrayList;

/**
 *
 * @author nickromero
 */
public class Edge {
    
    //Weight of an edge
    private int weight;
    
    //One of the Node pairs on this edge
    private Node leftNode;
    
    //One of the Node pairs on this edge
    private Node rightNode;
    
    /**
     * Constructor for Edge Object
     * @param weight weight of the edge
     * @param firstNode Node edge is connected to
     * @param secondNode Node edge is connected to
     */
    public Edge(Node firstNode, Node secondNode, int weight) {
        leftNode = firstNode;
        rightNode = secondNode;
        this.weight = weight;
        
    }
    /**
     * Getter for an edges adjacent Nodes
     * @return ArrayList containing the two adjacent Nodes
     */
    public ArrayList<Node> getNodes() {
        ArrayList<Node> adjNodes = new ArrayList<Node>();
        adjNodes.add(leftNode);
        adjNodes.add(rightNode);
        return adjNodes;
    }
    
    /**
     * Getter for an Edge's weight
     * @return int the weight of the edge
     */
    public int getWeight() {
        return weight;
    }
    
    /**
     * Setter for the Edge's weight
     * @param newWeight new weight of the edge
     */
    public void setWeight(int newWeight) {
        weight = newWeight;
    }
}
