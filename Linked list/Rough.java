public class Rough {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static Node merge(Node list, Node arr) {
        // Node temp, temp1, sub;
        // if (list.data <= arr.data) {
        //     temp = list;
        //     temp1 = arr;
        //     sub = arr;
        // } else {
        //     temp = arr;
        //     temp1 = list;
        //     sub = list;
        // }
        // while (temp.next != null && temp1 != null) {
        //     if (temp.next.data > temp1.data) {
        //         temp1 = sub.next;
        //         sub.next = temp.next;
        //         temp.next = sub;
        //         sub = temp1;
        //     }
        //     temp = temp.next;
        // }
        // if (sub != null) {
        //     temp.next = sub;
        // }
        // return (list.data < arr.data) ? list : arr;
        Node temp = list;
        Node n = new Node(1);
        n.next = temp;
        temp = n;
        return list;
    }

    static void print(Node ans) {
        Node temp = ans;
        int count = 0;
        while (temp != null) {
            count++;
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        Rough list = new Rough();
        Rough arr = new Rough();

        arr.head = new Node(2);
        arr.head.next = new Node(8);
        arr.head.next.next = new Node(9);

        list.head = new Node(5);
        list.head.next = new Node(6);
        list.head.next.next = new Node(7);

        Rough ans = new Rough();
        ans.head = merge(list.head, arr.head);
        print(ans.head);
    }
}
