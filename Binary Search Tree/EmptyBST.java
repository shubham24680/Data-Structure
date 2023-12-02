public class EmptyBST {

  public static void main(String[] args) {
    int nodes[] = { 1, 5, 4, 9, 8, 6, 10 };
    Tree tree = new Tree();
    Node root = tree.buildBST(nodes);
    System.out.println(empty(root));
  }

  public static Node empty(Node root) {
    if (root == null) 
      return null;

    root.left = empty(root.left);
    root.right = empty(root.right);
    System.out.print(root.data + " ");
    return null;
  }
}
