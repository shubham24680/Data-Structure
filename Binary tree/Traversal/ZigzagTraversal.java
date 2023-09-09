import java.util.Stack;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTree {
    static int index = -1;

    Node buildTree(int nodes[]) {
        index++;
        if (nodes[index] == -1) {
            return null;
        }

        Node newNode = new Node(nodes[index]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }

    void traversal(Node root) {
        Stack<Node> queue = new Stack<>();
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty() || !queue.isEmpty()) {
            while (!stack.empty()) {
                Node temp = stack.pop();
                System.out.print(temp.data + " ");

                if (temp.left != null)
                    queue.push(temp.left);
                if (temp.right != null)
                    queue.push(temp.right);
            }

            while (!queue.isEmpty()) {
                Node temp = queue.pop();
                System.out.print(temp.data + " ");

                if (temp.right != null)
                    stack.push(temp.right);
                if (temp.left != null)
                    stack.push(temp.left);
            }
        }
    }
}

public class ZigzagTraversal {
    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, 7, -1, -1, -1, 5, -1, -1, 3, -1, 6, 12, -1, -1, 15, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        tree.traversal(root);
    }
}
