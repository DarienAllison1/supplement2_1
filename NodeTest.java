import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Node class to ensure functionality and correctness.
 * 
 * This class contains tests to verify the creation of nodes, 
 * insertion of data into the binary tree, and the hierarchical 
 * dump of the tree structure.
 */
public class NodeTest {

    /**
     * Tests the creation of a Node object.
     * This test ensures that a Node is correctly initialized with the specified 
     * node ID and data, and that its left and right child nodes are initially null.
     */
    @Test
    public void testNodeCreation() {
        Node node = new Node("Root", 10);

        // Verify the node's ID and data
        assertEquals("Root", node.getNodeId(), "Node ID should match the provided ID.");
        assertEquals(10, node.getData(), "Node data should match the provided value.");

        // Verify the left and right children are null
        assertNull(node.getLeft(), "Left child should be null upon creation.");
        assertNull(node.getRight(), "Right child should be null upon creation.");
    }

    /**
     * Tests the insertion of new data into the binary tree.
     * This test checks that data is correctly inserted into the left or right 
     * child of the node based on the binary search tree rules. 
     * Specifically: If the new data is less than the node's data, it should go to the left child.
     *  If the new data is greater than or equal to the node's data, it should go to the right child.
     */
    @Test
    public void testInsert() {
        Node root = new Node("Root", 10);

        // Insert data into the tree
        root.insert(5);
        root.insert(15);

        // Verify the left and right children are correctly populated
        assertNotNull(root.getLeft(), "Left child should not be null after insertion.");
        assertNotNull(root.getRight(), "Right child should not be null after insertion.");
        assertEquals(5, root.getLeft().getData(), "Left child data should match the inserted value.");
        assertEquals(15, root.getRight().getData(), "Right child data should match the inserted value.");
    }

    /**
     * Tests the hierarchical dump of the binary tree to a string.
     * This test ensures that the `dump` method produces the correct string 
     * representation of the node and its children. The format must include: The node ID, The data, Proper indentation based on the depth level in the tree
     */
    @Test
    public void testDump() {
        Node root = new Node("Root", 10);

        // Insert data into the tree
        root.insert(5);
        root.insert(15);

        // Expected hierarchical dump format
        String expectedDump = 
                "Node ID: Root, Data: 10\n" +
                "\tNode ID: RootL, Data: 5\n" +
                "\tNode ID: RootR, Data: 15\n";

        // Verify the dump output matches the expected format
        assertEquals(expectedDump, root.dump(0), "Dump output should match the expected string representation.");
    }
}


