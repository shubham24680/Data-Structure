import java.util.*;

public class List {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(n);
            int i;
            for (i = 0; i < n; i++) {
                adj.add(new ArrayList<Integer>());
            }

            addEdge(adj, 0, 1);
            addEdge(adj, 0, 4);
            addEdge(adj, 1, 2);
            addEdge(adj, 1, 3);
            addEdge(adj, 1, 4);
            addEdge(adj, 2, 3);
            addEdge(adj, 3, 4);
            print(adj);

            newList(n, adj);
        }
    }

    // inserting element in an List.
    static void addEdge(ArrayList<ArrayList<Integer>> list, int a, int b) {
        list.get(a).add(b);
        list.get(b).add(a);
    }

    // Clone of original list
    static void newList(int n, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(n);
        int i, j;

        for (i = 0; i < n; i++) {
            list.add(new ArrayList<Integer>());
        }

        // inserting
        for (i = 0; i < adj.size(); i++) {
            list.get(i).add(i);
            for (j = 0; j < adj.get(i).size(); j++) {
                list.get(i).add(adj.get(i).get(j));
            }
        }

        print(list);
    }

    // output
    static void print(ArrayList<ArrayList<Integer>> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print("HEAD");
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print("->" + list.get(i).get(j));
            }
            System.out.println();
        }
        System.out.println();
    }
}