class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Searching {
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

    static boolean search(Node root, int value) {
        if(root == null) {
            return false;
        }

        if(root.data == value) {
            return true;
        }

        boolean check = false;
        if(root.data > value) {
            check =  search(root.left, value);
        }

        if(root.data < value) {
            check = search(root.right, value);
        }

        return check;
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
        int nodes[] = { 5, 8, 2, 77, 2, 9 };
        Node root = null;
        for (int i : nodes) {
            root = insert(root, i);
        }
        print(root);
        System.out.println();
        System.out.println(search(root, 11));
    }
}
