class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Deletion {
    static Node insert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
        }

        if (root.data > value) {
            root.left = insert(root.left, value);
        }

        if (root.data < value) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    static Node delete(Node root, int value) {
        if (root == null) {
            return root;
        }

        if (root.data > value) {
            root.left = delete(root.left, value);
        } else if (root.data < value) {
            root.right = delete(root.right, value);
        } else {
            if (root.left == null) {
                root = root.right;
            } else if (root.right == null) {
                root = root.left;
            } else {
                value = successor(root.right);
                root.data = value;
                root.right = delete(root.right, value);
            }
        }

        return root;
    }

    static int successor(Node root) {
        if (root.left == null) {
            return root.data;
        }

        return successor(root.left);
    }

    static void print(Node root) {
        if (root == null) {
            return;
        }

        print(root.left);
        System.out.print(root.data + " ");
        print(root.right);
    }

    public static void main(String[] args) {
        int nodes[] = { 6, 4, 8, 1, 9, 23, 11 };
        Node root = null;
        for (int i : nodes) {
            root = insert(root, i);
        }
        root = delete(root, 12);
        print(root);
        System.out.println();
        root = delete(root, 11);
        print(root);
        System.out.println();
        root = delete(root, 8);
        print(root);
        System.out.println();
        root = delete(root, 6);
        print(root);
        System.out.println();
    }
}
