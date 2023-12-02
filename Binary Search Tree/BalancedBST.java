import java.util.ArrayList;

class Node {

  int data;
  Node left;
  Node right;

  Node(int data) {
    this.data = data;
    left = right = null;
  }
}

public class BalancedBST {

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

  static void inorder(Node root, ArrayList<Integer> list) {
    if (root == null) {
      return;
    }

    inorder(root.left, list);
    list.add(root.data);
    System.out.print(root.data + " ");
    inorder(root.right, list);
  }

  static Node balance(ArrayList<Integer> list, int beg, int end) {
    if (beg > end) {
      return null;
    }

    int mid = (beg + end) / 2;
    Node temp = new Node(list.get(mid));
    temp.left = balance(list, beg, mid - 1);
    temp.right = balance(list, mid + 1, end);

    return temp;
  }

  public static void main(String[] args) {
    int nodes[] = { 6, 4, 8, 1, 9, 23, 11 };
    Node root = null;
    for (int i : nodes) {
      root = insert(root, i);
    }

    ArrayList<Integer> list = new ArrayList<>();
    inorder(root, list);
    System.out.println();
    root = balance(list, 0, list.size() - 1);
    inorder(root, list);
  }
}
