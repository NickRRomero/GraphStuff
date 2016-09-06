
package graphapplication;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nickromero
 */
public class NodeTest {
    
    public NodeTest() {
    }
    
   
  
    /**
     * Test of getName method, of class Node.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Node instance = new Node(5, "!@#%^&%&^%&&^%%%");
        String expectedName = "!@#%^&%&^%&&^%%%";
        assertEquals(instance.getName(), expectedName);
        assertNotEquals(instance.getName(), "");
    }

    /**
     * Test of getAdjacentNodes method, of class Node.
     */
    @Test
    public void testGetAdjacentNodes() {
        System.out.println("getAdjacentNodes");
        Node mainNode = new Node(0, "");
        Node firstNode = new Node(0, "");
        Node secondNode = new Node(0, "");
        ArrayList<Node> adjNodes;
        
        mainNode.addAdjacentNode(firstNode);
        mainNode.addAdjacentNode(secondNode);
        
        adjNodes = mainNode.getAdjacentNodes();
        
        assertEquals(adjNodes.get(0), firstNode);
        assertEquals(adjNodes.get(1), secondNode);
    }

    /**
     * Test of getValue method, of class Node.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        Node node = new Node(123456, "");
        assertEquals(node.getValue(), 123456);
        
    }

    /**
     * Test of setValue method, of class Node.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        Node node = new Node(0, "");
        node.setValue(1234);
        assertEquals(node.getValue(), 1234);
    }

    /**
     * Test of addAdjacentNode method, of class Node.
     */
    @Test
    public void testAddAdjacentNode() {
        System.out.println("addAdjacentNode");
        Node mainNode = new Node(0, "");
        Node adjNode = new Node(0, "");
        mainNode.addAdjacentNode(adjNode);
        assertTrue(mainNode.getAdjacentNodes().contains(adjNode));
    }

    /**
     * Test of removeAdjacentNode method, of class Node.
     */
    @Test
    public void testRemoveAdjacentNode() {
        System.out.println("removeAdjacentNode");
         Node mainNode = new Node(0, "");
        Node adjNode = new Node(0, "");
        mainNode.addAdjacentNode(adjNode);
        mainNode.removeAdjacentNode(adjNode);
        assertFalse(mainNode.getAdjacentNodes().contains(adjNode));
    }
    
}
