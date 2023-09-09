class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    Node front, rear;

    Queue() {
        this.front = this.rear = null;
    }

    void enqueue(int data) {
        System.out.println(data + " is enqueued in the queue.");
        Node temp = new Node(data);
        if (rear == null) {
            rear = temp;
            front = temp;
            return;
        }

        rear.next = temp;
        rear = temp;
    }

    int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return -1;
        }

        int data = front.data;
        front = front.next;
        if (front == null)
            rear = null;
        return data;
    }
}

public class LinkedListQueue {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(70);
        q.enqueue(80);
        q.enqueue(90);

        System.out.println(q.dequeue() + " is dequeued from the queue.");
        System.out.println(q.dequeue() + " is dequeued from the queue.");
        System.out.println(q.front.data + " is front element of the queue.");
        System.out.println(q.rear.data + " is rear element of the queue.");
    }
}
