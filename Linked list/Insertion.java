public class Insertion {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    void insertionAtBeginning(int num) {
        Node insert = new Node(num);
        insert.next = head;
        head = insert;
    }

    void insertionAtPosition(Node pos, int num) {
        if (pos == null) {
            System.out.println("Warning: Given position is not available.");
            return;
        }

        Node insert = new Node(num);
        insert.next = pos.next;
        pos.next = insert;
    }

    void insertionAtEnd(int num) {
        Node insert = new Node(num);

        if (head == null) {
            head = new Node(num);
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = insert;
    }

    void print() {
        if (head == null)
            System.out.println("List is empty.");

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Insertion list = new Insertion();
        list.insertionAtEnd(412);
        list.insertionAtEnd(68);
        list.insertionAtEnd(94);
        list.insertionAtBeginning(54);
        list.insertionAtPosition(list.head.next, 108);
        list.print();
    }
}
