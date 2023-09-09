class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Tree {
    Node root = null;

    void insert(int value) {
        if (root == null) {
            root = new Node(value);
            return;
        }

        Node newNode = new Node(value);
        Node temp = root;
        while (true) {
            if (temp.left == null) {
                temp.left = newNode;
                break;
            } else if (root.right == null) {
                temp.right = newNode;
                break;
            } else
                temp = temp.left;
        }
    }
}

public class FullBinaryTree {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        print(tree.root);
    }

    static void print(Node root) {
        if(root == null) {
            return ;
        }

        System.out.println(root.data);
        print(root.left);
        print(root.right);
    }
}
