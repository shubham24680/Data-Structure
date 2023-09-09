// Enqueue(insertion) 	O(1)
// Deque(deletion)   	O(1)
// Front(Get front)   	O(1)
// Rear(Get Rear)	O(1)
// IsFull(Check queue is full or not)	O(1)
// IsEmpty(Check queue is empty or not)	O(1)

class Queue {
    int rear, front, size, count;
    int arr[];

    public Queue(int size) {
        this.size = size;
        arr = new int[size];
        this.front = this.count = 0;
        this.rear = size - 1;
    }

    boolean isFull() {
        return (count == size);
    }

    void enqueue(int n) {
        if (isFull()) {
            System.out.println("Queue is Full.");
            return;
        }

        rear = (rear + 1) % size;
        arr[rear] = n;
        count += 1;
        System.out.println(n + " is enqueued in the queue.");
    }

    boolean isEmpty() {
        return (count == 0);
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty.");
            return Integer.MIN_VALUE;
        }

        int data = arr[front];
        front = (front + 1) % size;
        count -= 1;
        return data;
    }

    int front() {
        if (isEmpty()) {
            System.out.println("Queue is Empty.");
            return Integer.MIN_VALUE;
        }

        return arr[front];
    }

    int rear() {
        if (isEmpty()) {
            System.out.println("Queue is Empty.");
            return Integer.MIN_VALUE;
        }

        return arr[rear];
    }
}

public class ArraysQueue {
    public static void main(String[] args) {
        Queue q = new Queue(10);

        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(70);
        q.enqueue(80);
        q.enqueue(90);

        System.out.println(q.dequeue() + " is dequeued from the queue.");
        System.out.println(q.dequeue() + " is dequeued from the queue.");
        System.out.println(q.front() + " is front element of the queue.");
        System.out.println(q.rear() + " is rear element of the queue.");
    }
}