class Tree {
    int root = 0;
    String s[] = new String[10];

    void Root(String data) {
        s[0] = data;
    }

    void setLeft(String data, int level) {
        int l = (2 * level) + 1;
        if (s[level] != null)
            create(data, l);
    }

    void setRight(String data, int level) {
        int l = (2 * level) + 2;
        if (s[level] != null)
            create(data, l);
    }

    void create(String data, int place) {
        s[place] = data;
    }

    void print() {
        for (String str : s) {
            if (str != null) {
                System.out.print(str);
            } else
                System.out.print("-");
        }
    }
}

public class ArrayRepresentation {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.Root("A");
        tree.setLeft("B", 0);
        tree.setRight("C", 0);
        tree.setLeft("D", 1);
        tree.setRight("E", 1);
        tree.setRight("F", 2);
        tree.print();
    }
}
