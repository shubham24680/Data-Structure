public class LevelOrder {

  public static void main(String[] args) {
    int nodes[] = { 9, 23, 11, 6, 4, 8, 1 };
    Tree tree = new Tree();
    Node root = tree.buildBST(nodes);

    Height treeHeight = new Height();
    int h = treeHeight.height(root);

    for (int i = 0; i <= h; i++) {
      levelOrder(root, i);
    }
  }

  public static void levelOrder(Node root, int level) {
    if (root == null) return;
    if (level == 1) 
        System.out.print(root.data + " ");
     else {
      levelOrder(root.left, level - 1);
      levelOrder(root.right, level - 1);
    }
  }
}
