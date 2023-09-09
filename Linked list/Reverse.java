class LinkedList {
    Node head;
    Node current;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    void add(int num) {
        if (head == null) {
            head = new Node(num);
            current = head;
            return;
        }

        current.next = new Node(num);
        current = current.next;
    }

    void reverse() {
        Node prev = null;
        current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }

    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Reverse {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(47);
        list.add(98);
        list.add(12);
        list.add(8);
        list.print();
        list.reverse();
        list.print();
    }
}
