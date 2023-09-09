public class DiameterOfATree {
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
        static int index = -1;

        Node buildTree(int nodes[]) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }

            Node newnode = new Node(nodes[index]);
            newnode.left = buildTree(nodes);
            newnode.right = buildTree(nodes);

            return newnode;
        }

        int height(Node root) {
            if (root == null)
                return 0;

            int left = height(root.left);
            int right = height(root.right);

            return Math.max(left, right) + 1;
        }

        // Approach 1 (Time Complexity: O(n^2))
        int diameter(Node root) {
            if (root == null)
                return 0;

            int left = diameter(root.left);
            int right = diameter(root.right);
            int dia = height(root.left) + height(root.right) + 1;
            return Math.max(dia, Math.max(left, right));
        }
    }

    // Approach 2 (Time Complexity: O(n))
    static class TreeDiameter {
        int diameter;
        int height;

        TreeDiameter(int diameter, int height) {
            this.diameter = diameter;
            this.height = height;
        }

        TreeDiameter eff_dia(Node root) {
            if (root == null)
                return new TreeDiameter(0, 0);

            TreeDiameter left = eff_dia(root.left);
            TreeDiameter right = eff_dia(root.right);
            int h = Math.max(left.height, right.height) + 1;

            int dia_left = left.diameter;
            int dia_right = right.diameter;
            int dia = left.height + right.height + 1;
            int d = Math.max(dia, Math.max(dia_left, dia_right));

            TreeDiameter final_diameter = new TreeDiameter(d, h);
            return final_diameter;
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        System.out.println(tree.diameter(root));

        TreeDiameter d = new TreeDiameter(0, 0);
        System.out.println(d.eff_dia(root).diameter);
    }
}
