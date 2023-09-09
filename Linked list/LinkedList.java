public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    void countNode() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        System.out.println("Total number of Node is " + count);
    }

    void print() {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);

        list.head.next = n1;
        n1.next = n2;
        list.countNode();
        list.print();
    }
}