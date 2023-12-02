public class DisjointSetUnion {

  public static void main(String[] args) {
    Graph graph = new Graph();
    int[][] matrix = graph.builtGraph();
    int len = matrix.length;
    int[] parent = new int[len];
    int[] rank = new int[len];
    makeSet(parent);
    unionset(parent, rank, 1, 2);
  }

  static void makeSet(int[] parent) {
    for (int i = 0; i < parent.length; i++)
        parent[i] = i;
  }

  static int findParent(int[] parent, int node) {
    if (node == parent[node]) 
        return node;

    return parent[node] = findParent(parent, parent[node]);
  }

  static void unionset(int[] parent, int[] rank, int a, int b) {
    a = findParent(parent, a);
    b = findParent(parent, b);

    if (rank[a] == rank[b]) {
      parent[b] = a;
      rank[a]++;
    } else if (rank[a] > rank[b]) 
        parent[b] = a; 
    else 
        parent[a] = b;
  }
}
