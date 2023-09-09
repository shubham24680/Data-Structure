class BinaryHeap {
    int heap[], size, capacity;

    BinaryHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        heap = new int[capacity];
    }

    int parent(int i) {
        return ((i - 1) / 2);
    }

    int left(int i) {
        return ((2 * i) + 1);
    }

    int right(int i) {
        return (2 * (i + 1));
    }

    void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    void insert(int data) {
        if (size == capacity) {
            System.out.println("Overflow");
            return;
        }

        int i = size;
        heap[i] = data;
        while (i != 0 && heap[parent(i)] > heap[i]) {
            swap(heap[parent(i)], heap[i]);
            i = parent(i);

        }
        size++;
    }

    public static void main(String[] args) {
        BinaryHeap minHeap = new BinaryHeap(10);
        minHeap.insert(10);
        minHeap.insert(20);
        minHeap.insert(30);
        minHeap.insert(40);
        minHeap.insert(50);
        minHeap.insert(60);
        minHeap.insert(70);
    }
}