import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// In this we contains few of the operations.
public class Operations {
    public static void main(String[] args) {
        Queue<Integer> store = new LinkedList<>();
        store.add(1);
        store.offer(2);
        while (!store.isEmpty()) {
            System.out.print(store.remove() + " ");
        }
        System.out.println();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        store.addAll(list);
        System.out.println(store.hashCode());

        int i, size = store.size();
        for(i = 0; i < size; i++) {
            System.out.print(store.poll());
        }
        System.out.println();

    }
}
