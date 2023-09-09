public class Searching {
    Node head;
    Node current;
    int length = 1;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    void add(int num) {
        Node insert = new Node(num);
        current.next = insert;
        current = current.next;
        length++;
    }

    int search(int num) {
        Node temp = head;
        int count = 2;
        while (temp != null && temp.data != num) {
            temp = temp.next;
            count++;
        }

        return (temp != null && temp.data == num) ? count : -1;
    }

    int middleElement() {
        Node temp = head;
        int len = length / 2;
        while (len > 0) {
            temp = temp.next;
            len--;
        }

        return temp.data;
    }

    void print() {
        Node temp = head;
        System.out.print("List:- ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Searching list = new Searching();
        list.head = new Node(49);
        list.current = list.head;
        list.add(42);
        list.add(12);
        list.add(109);
        list.add(23);
        list.print();
        System.out.println("Searched element at position: " + list.search(19));
        System.out.println("Middle element of the LinkedList is " + list.middleElement());
    }
}
