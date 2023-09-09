public class Deletion {
    Node head;

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
            return;
        }

        Node insert = new Node(num);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        insert.next = temp.next;
        temp.next = insert;
    }

    void print() {
        Node temp = head;
        System.out.print("List :- ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void deletionAtBeginning() {
        if (head == null) {
            System.out.println("No available element.");
            return;
        }

        head = head.next;
    }

    void deletionAtPositon(int pos) {
        Node temp = head.next, prev = head;
        int count = 2;
        while (temp.next != null && count != pos) {
            prev = temp;
            temp = temp.next;
            count++;
        }
        if (prev.next == null || temp.next == null) {
            System.out.println("No available element.");
            return;
        }

        prev.next = temp.next;
    }

    void deletionAtEnd() {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    void deletionOfAKey(int num) {
        Node temp = head, prev = null;
        while (temp != null && temp.data != num) {
            prev = temp;
            temp = temp.next;
        }

        prev.next = temp.next;
    }

    public static void main(String[] args) {
        Deletion list = new Deletion();
        list.add(48);
        list.add(982);
        list.add(12);
        list.add(6);
        list.add(1265);
        list.print();
        list.deletionOfAKey(12);
        list.print();
        list.deletionAtPositon(2);
        list.print();
        list.deletionAtBeginning();
        list.print();
        list.deletionAtEnd();
        list.print();
    }

}
