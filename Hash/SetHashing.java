import java.util.HashSet;
import java.util.Iterator;

public class SetHashing {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // Insertion
        set.add(4);
        set.add(45);
        set.add(1);
        set.add(45);

        // Searching
        if (set.contains(1))
            System.out.println("Let exchange the element and set size is " + set.size());

        // Deletion
        set.remove(45);
        System.out.println("Set size: " + set.size());

        // Iterator
        Iterator<Integer> it = set.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}
