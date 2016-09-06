/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphapplication;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nickromero
 */
public class GraphTest {
    
    public GraphTest() {
    }

    /**
     * Test of areNodesAdjacent method, of class Graph.
     */
    @Test
    public void testAreNodesAdjacent() {
        System.out.println("areNodesAdjacent");
        Node firstNode = new Node(0, "");
        Node secondNode = new Node(1, "");
        Graph graph = new Graph();
        
        graph.addNodeToGraph(firstNode);
        graph.addNodeToGraph(secondNode);
        assertFalse(graph.areNodesAdjacent(firstNode, secondNode));
        
        graph.addEdgeToGraph(firstNode, secondNode, 0);
        
        assertTrue(graph.areNodesAdjacent(firstNode, secondNode));
    }

    /**
     * Test of getAdjacentNodes method, of class Graph.
     */
    @Test
    public void testGetAdjacentNodes() {
        System.out.println("getAdjacentNodes");
        Graph graph = new Graph();
        Node firstNode = new Node(0, "");
        Node secondNode = new Node(1, "");
        Node thirdNode = new Node(2, "");
        Node fourthNode = new Node(3, "");
        
        Edge firstEdge = new Edge(firstNode, secondNode, 0);
        Edge secondEdge = new Edge(secondNode, thirdNode, 0);
        Edge thirdEdge = new Edge(thirdNode, firstNode, 0);
        Edge fourthEdge = new Edge(thirdNode, fourthNode, 0);
        
        graph.addNodeToGraph(firstNode);
        graph.addNodeToGraph(secondNode);
        graph.addNodeToGraph(thirdNode);
        graph.addNodeToGraph(fourthNode);
        
        ArrayList<Node> adjNodes = graph.getAdjacentNodes(firstNode);
        System.out.println(adjNodes);
        assertEquals(adjNodes.toArray().length, 3);
        
        assertTrue(adjNodes.contains(firstNode));
        assertTrue(adjNodes.contains(secondNode));
        assertTrue(adjNodes.contains(thirdNode));
        assertFalse(adjNodes.contains(fourthNode));
    }

    /**
     * Test of addNodeToGraph method, of class Graph.
     */
    @Test
    public void testAddNodeToGraph() {
        System.out.println("addNodeToGraph");
        Node newNode = null;
        Graph instance = new Graph();
        boolean expResult = false;
        boolean result = instance.addNodeToGraph(newNode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeNodeFromGraph method, of class Graph.
     */
    @Test
    public void testRemoveNodeFromGraph() {
        System.out.println("removeNodeFromGraph");
        Node nodeToRemove = null;
        Graph instance = new Graph();
        boolean expResult = false;
        boolean result = instance.removeNodeFromGraph(nodeToRemove);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addEdgeToGraph method, of class Graph.
     */
    @Test
    public void testAddEdgeToGraph() {
        System.out.println("addEdgeToGraph");
        Node node1 = null;
        Node node2 = null;
        int edgeWeight = 0;
        Graph instance = new Graph();
        boolean expResult = false;
        boolean result = instance.addEdgeToGraph(node1, node2, edgeWeight);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeEdgeFromGraph method, of class Graph.
     */
    @Test
    public void testRemoveEdgeFromGraph() {
        System.out.println("removeEdgeFromGraph");
        Edge edgeToRemove = null;
        Graph instance = new Graph();
        boolean expResult = false;
        boolean result = instance.removeEdgeFromGraph(edgeToRemove);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNodeValue method, of class Graph.
     */
    @Test
    public void testGetNodeValue() {
        System.out.println("getNodeValue");
        Node node = null;
        Graph instance = new Graph();
        int expResult = 0;
        int result = instance.getNodeValue(node);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNodeValue method, of class Graph.
     */
    @Test
    public void testSetNodeValue() {
        System.out.println("setNodeValue");
        Node node = null;
        int value = 0;
        Graph instance = new Graph();
        instance.setNodeValue(node, value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEdgeWeight method, of class Graph.
     */
    @Test
    public void testGetEdgeWeight() {
        System.out.println("getEdgeWeight");
        Edge edge = null;
        Graph instance = new Graph();
        int expResult = 0;
        int result = instance.getEdgeWeight(edge);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEdgeWeight method, of class Graph.
     */
    @Test
    public void testSetEdgeWeight() {
        System.out.println("setEdgeWeight");
        Edge edge = null;
        int weight = 0;
        Graph instance = new Graph();
        instance.setEdgeWeight(edge, weight);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
