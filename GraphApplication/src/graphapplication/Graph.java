package graphapplication;

import java.util.ArrayList;

/**
 *
 * @author nickromero
 */
public class Graph {
    
    private ArrayList<Node> theNodes;
    
    private ArrayList<Edge> theEdges;
    
    public Graph() {
        theNodes = new ArrayList<Node>();
        theEdges = new ArrayList<Edge>();
    }
    
    
    
    
    /**
     * This function returns true if two nodes contain an edge between
     * them. This is true if a Node contains another on its list
     * of adjacent nodes.
     * @param firstNode first Node to compare
     * @param secondNode second Node to compare 
     * @return boolean if 
     */
    public boolean areNodesAdjacent(Node firstNode, Node secondNode) {
        return firstNode.getAdjacentNodes().contains(secondNode);
    }
    
    /**
     * This function returns all Node's adjacent to the desired Node.
     * If the Node does not exist in the graph the function will return null.
     * @param theNode Node object to test for adjacent Node's
     * @return ArrayList<Node> adjacency lists
     */
    public ArrayList<Node> getAdjacentNodes(Node theNode) {
        if (theNodes.contains(theNode))
            return theNode.getAdjacentNodes();
        System.out.println("Error Node " + theNode.getName() + " does not exist");
        return null;
    }
    
    /**
     * Add a new Node to the graph
     * @param newNode Node to be added to the graph
     * @return true if a Node was successfully removed
     */
    public boolean addNodeToGraph(Node newNode) {
        if (!theNodes.contains(newNode)) {
            theNodes.add(newNode);
            return true;
        }
        return false;
    }
    
    /**
     * Remove a Node from the graph
     * @param nodeToRemove
     * @return 
     */
    public boolean removeNodeFromGraph(Node nodeToRemove) {
        if (theNodes.contains(nodeToRemove)) {
            theNodes.remove(nodeToRemove);
            return true;
        }
        return false;
    }
    
    public boolean addEdgeToGraph(Node node1, Node node2, int edgeWeight) {
        
        //Check if the graph contains the needed Nodes
        if (theNodes.contains(node1) && theNodes.contains(node2)) {
            
            //Determine if an ede already exists between the two Nodes
            if (!node1.getAdjacentNodes().contains(node2)) {
                node1.addAdjacentNode(node2);
                node2.addAdjacentNode(node1);
                
                theEdges.add(new Edge(node1, node2, edgeWeight));
                return true;
            }
        }
        return false;
    }
    
    /**
     * Remove an edge from the graph.
     * @param edgeToRemove The edge to remove
     * @return true if an edge was successfully removed
     */
    public boolean removeEdgeFromGraph(Edge edgeToRemove) {
        
        if (theEdges.contains(edgeToRemove)) {
            theEdges.remove(edgeToRemove);
            ArrayList<Node> toRemove = edgeToRemove.getNodes();
            Node firstNode = toRemove.get(0);
            Node secondNode = toRemove.get(1);     
            
            firstNode.removeAdjacentNode(secondNode);
            secondNode.removeAdjacentNode(firstNode);
            return true;
        }
        return false;
    }
    
    /**
     * Get a Node's value
     * @param node THe node to get the value of
     * @return int value of the Node
     */
    public int getNodeValue(Node node) {
        return node.getValue();
    }
    
    /**
     * Set the value of a Node in the graph
     * @param node Node to set the value of
     * @param value new value for the Node
     */
    public void setNodeValue(Node node, int value) {
        node.setValue(value);
    }
    
    /**
     * Get a Node's value
     * @param node THe node to get the value of
     * @return int value of the Node
     */
    public int getEdgeWeight(Edge edge) {
        return edge.getWeight();
    }
    
    /**
     * Set the value of a Node in the graph
     * @param node Node to set the value of
     * @param value new value for the Node
     */
    public void setEdgeWeight(Edge edge, int weight) {
        edge.setWeight(weight);
    }
}
