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
    Tree tree = new Tree();
    Node root = tree.buildBST(nodes);
    print(root);
  }

  static void print(Node root) {
    if (root == null) {
      return;
    }

    print(root.left);
    System.out.print(root.data + " ");
    print(root.right);
  }
}

class Tree {

  Node buildBST(int[] nodes) {
    Node root = null;
    for (int i : nodes) {
      root = insert(root, i);
    }

    return root;
  }

  private Node insert(Node root, int value) {
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
}
