import java.util.Random;

/**
 * Main class to demonstrate the functionality of the Node class.
 */
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        
        // Generate a random root value between 1 and 100
        int rootValue = random.nextInt(100) + 1;
        Node root = new Node("Root", rootValue);

        // Insert random values into the tree
        for (int i = 0; i < 4; i++) {
            int randomValue = random.nextInt(100) + 1;
            root.insert(randomValue);
        }

        System.out.println(root.dump(0));
    }
}

