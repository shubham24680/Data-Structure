class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BST {
    public static void main(String[] args) {
        int nodes[] = { 6, 4, 8, 1, 9, 23, 11 };
        Node root = null;
        for (int i : nodes) {
            root = insert(root, i);
        }
        print(root);
    }

    static Node insert(Node root, int value) {
        if (root == null) {
            return root = new Node(value);
        }

        if (root.data > value) {
            root.left = insert(root.left, value);
        } else if (root.data < value) {
            root.right = insert(root.right, value);
        }
        return root;
    }

    static void print(Node root) {
        if(root == null){
            return;
        }

        print(root.left);
        System.out.print(root.data + " ");
        print(root.right);
    }
}