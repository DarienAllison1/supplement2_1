/**
 * Represents a node in a binary tree with unique ID, integer data, and left/right children.
 */
public class Node {
    private String nodeId; // Unique identifier for the node
    private int data; // Data stored in the node
    private Node left; // Left child node
    private Node right; // Right child node

    /**
     * Constructs a new Node with the specified ID and data.
     *
     * @param nodeId Unique identifier for the node.
     * @param data   The data value for the node.
     */
    public Node(String nodeId, int data) {
        this.nodeId = nodeId;
        this.data = data;
    }

    /**
     * Gets the Node ID.
     *
     * @return The unique identifier for the node.
     */
    public String getNodeId() {
        return nodeId;
    }

    /**
     * Gets the data stored in the node.
     *
     * @return The data value.
     */
    public int getData() {
        return data;
    }

    /**
     * Gets the left child of the node.
     *
     * @return The left child node.
     */
    public Node getLeft() {
        return left;
    }

    /**
     * Gets the right child of the node.
     *
     * @return The right child node.
     */
    public Node getRight() {
        return right;
    }

    /**
     * Inserts a new value into the binary tree based on the current node.
     * If the data is less than the current node's data, it goes to the left child;
     * otherwise, it goes to the right child.
     *
     * @param newData The value to insert into the tree.
     */
    public void insert(int newData) {
        if (newData < this.data) {
            if (this.left == null) {
                this.left = new Node(this.nodeId + "L", newData);
            } else {
                this.left.insert(newData);
            }
        } else {
            if (this.right == null) {
                this.right = new Node(this.nodeId + "R", newData);
            } else {
                this.right.insert(newData);
            }
        }
    }

    /**
     * Dumps the node and its children to a string representation with hierarchical formatting.
     *
     * @param level The current depth level of the node in the tree.
     * @return The string representation of the node and its children.
     */
    public String dump(int level) {
        StringBuilder builder = new StringBuilder();
        builder.append("\t".repeat(level)).append("Node ID: ").append(nodeId)
                .append(", Data: ").append(data).append("\n");

        if (left != null) {
            builder.append(left.dump(level + 1));
        }
        if (right != null) {
            builder.append(right.dump(level + 1));
        }

        return builder.toString();
    }
}
