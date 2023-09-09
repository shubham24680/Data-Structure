import java.util.Comparator;
import java.util.PriorityQueue;

import javax.swing.text.html.HTMLDocument.Iterator;

class Customer {
    int uid;
    String name;

    Customer(int uid, String name) {
        this.uid = uid;
        this.name = name;
    }
}

class cmp implements Comparator<Customer> {
    public int compare(Customer a, Customer b) {
        return a.uid - b.uid;
    }
}

public class Priority {
    public static void main(String[] args) {
        PriorityQueue<Customer> store = new PriorityQueue<>(new cmp());
        store.add(new Customer(432, "shubham Patel"));
        store.add(new Customer(7765, "Patel"));
        store.add(new Customer(764, "shubham"));
        store.add(new Customer(2374, "Unknown"));

        while(!store.isEmpty()) {
            Customer current = store.poll();
            System.out.println(current.uid + " " + current.name);
        }
    }
}
