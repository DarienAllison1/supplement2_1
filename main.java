/**
 * Main class to demonstrate the functionality of the Node class.
 */
public class Main {
    public static void main(String[] args) {
        Node root = new Node("Root", 10);
        root.insert(5);
        root.insert(15);
        root.insert(3);
        root.insert(7);

        System.out.println(root.dump(0));
    }
}
