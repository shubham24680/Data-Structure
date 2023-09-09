import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Insertion {
    static int index = -1;

    static Node buildTree(int[] nodes) {
        index++;
        if (nodes[index] == -1) {
            return null;
        }

        Node temp = new Node(nodes[index]);
        temp.left = buildTree(nodes);
        temp.right = buildTree(nodes);

        return temp;
    }

    static void insert(Node root, int value) {
        Queue<Node> store = new LinkedList<>();
        store.add(root);

        while (!store.isEmpty()) {
            Node temp = store.remove();
            if (temp.left != null) {
                store.add(temp.left);
            } else if (temp.left == null) {
                temp.left = new Node(value);
                break;
            }

            if (temp.right != null) {
                store.add(temp.right);
            } else if (temp.right == null) {
                temp.right = new Node(value);
                break;
            }
        }
    }

    static void print(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        print(root.left);
        print(root.right);
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = Insertion.buildTree(nodes);
        Insertion.print(root);
        System.out.println();
        Insertion.insert(root, 11);
        Insertion.print(root);
    }
}
