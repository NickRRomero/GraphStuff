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
public class EdgeTest {
    
    public EdgeTest() {
    }

    /**
     * Test of getNodes method, of class Edge.
     */
    @Test
    public void testGetNodes() {
        System.out.println("getNodes");
        Node firstNode = new Node(0, "");
        Node secondNode = new Node(1, "");
        Edge edge = new Edge(firstNode, secondNode, 0);
        ArrayList<Node> nodes = edge.getNodes();
        
        assertTrue(nodes.contains(firstNode));
        assertTrue(nodes.contains(secondNode));
    }

    /**
     * Test of getWeight method, of class Edge.
     */
    @Test
    public void testGetWeight() {
        System.out.println("getWeight");
        Node firstNode = new Node(0, "");
        Node secondNode = new Node(1, "");
        Edge edge = new Edge(firstNode, secondNode, 4321);
        
        assertEquals(edge.getWeight(), 4321);
        
    }

    /**
     * Test of setWeight method, of class Edge.
     */
    @Test
    public void testSetWeight() {
        System.out.println("setWeight");
        Node firstNode = new Node(0, "");
        Node secondNode = new Node(1, "");
        Edge edge = new Edge(firstNode, secondNode, 4321);
        
        edge.setWeight(0);
        
        assertEquals(edge.getWeight(), 0);
    }
    
}
