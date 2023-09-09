// Error in running.
public class SubTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        Node buildTree(int nodes[], int index) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }

            Node newnode = new Node(nodes[index]);
            newnode.left = buildTree(nodes, index);
            newnode.right = buildTree(nodes, index);

            return newnode;
        }

        boolean isidentical(Node root, Node subroot) {
            if (root == null && subroot == null)
                return true;

            if (root == null || subroot == null)
                return false;

            if (root.data == subroot.data)
                return isidentical(root.left, subroot.left) && isidentical(root.right, subroot.right);

            return false;
        }

        public boolean isSubtree(Node root, Node subroot) {
            if (subroot == null)
                return true;

            if (root == null)
                return false;

            if (root.data == subroot.data) {
                if (isidentical(root, subroot))
                    return true;
            }

            return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        int subnodes[] = { 2, 4, -1, -1, 5, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes, -1);
        Node subroot = tree.buildTree(subnodes, -1);
        System.out.println(tree.isSubtree(root, subroot));
    }
}
