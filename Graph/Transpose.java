import java.util.ArrayList;

// Transpose of a graph possible in directed graph.
public class Transpose {
    public static void main(String[] args) {
        int n = 5;
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(n);
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<Integer>());
        }

        addEdge(list, 0, 1);
        addEdge(list, 0, 3);
        addEdge(list, 0, 4);
        addEdge(list, 2, 0);
        addEdge(list, 3, 2);
        addEdge(list, 4, 1);
        addEdge(list, 4, 3);
        print(list);

        ArrayList<ArrayList<Integer>> trans = transpose(list, n);
        print(trans);
    }

    // insert.
    static void addEdge(ArrayList<ArrayList<Integer>> list, int a, int b) {
        list.get(a).add(b);
    }

    // getting the transpose(only sign of the direct graph will be changed).
    static ArrayList<ArrayList<Integer>> transpose(ArrayList<ArrayList<Integer>> list, int n) {
        ArrayList<ArrayList<Integer>> trans = new ArrayList<ArrayList<Integer>>(n);
        int i, j;
        for (i = 0; i < n; i++) {
            trans.add(new ArrayList<Integer>());
        }
        for (i = 0; i < list.size(); i++) {
            for (j = 0; j < list.get(i).size(); j++) {
                trans.get(list.get(i).get(j)).add(i);
            }
        }
        return trans;
    }

    static void print(ArrayList<ArrayList<Integer>> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(i);
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print("->" + list.get(i).get(j));
            }
            System.out.println();
        }
        System.out.println();
    }
}
