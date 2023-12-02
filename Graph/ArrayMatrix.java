import java.util.Scanner;

public class ArrayMatrix {

  public static void main(String[] args) {
    Graph graph = new Graph();
    graph.builtGraph();
    graph.print();
  }
}

class Graph {

  int[][] matrix;

  public int[][] builtGraph() {
    try (Scanner scan = new Scanner(System.in)) {
      System.out.print("Enter the graph n: ");
      int n = scan.nextInt();
      System.out.print("Enter the graph m: ");
      int edges = scan.nextInt();
      matrix = new int[n + 1][n + 1];

      int u, v;
      for (int i = 0; i < edges; i++) {
        u = scan.nextInt();
        v = scan.nextInt();
        matrix[u][v] = 1;
        matrix[v][u] = 1;
      }
    }

    return matrix;
  }

  public void print() {
    for (int i = 1; i < matrix.length; i++) {
      for (int j = 1; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}
