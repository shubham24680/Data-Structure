class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BinaryTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        print(root);
    }

    static void print(Node root) {
        if (root == null) {
            return;
        }

        System.out.println(root.data);
        print(root.left);
        print(root.right);
    }
}
