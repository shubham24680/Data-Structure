class Stack {
    int top, size;
    int arr[];

    public Stack(int size) {
        this.size = size;
        arr = new int[this.size];
        top = -1;
    }

    boolean isFull(Stack s) {
        return (this.top >= size);
    }

    void push(int num) {
        if (isFull(this)) {
            System.out.println("Stack Overflow.");
            return;
        }

        arr[++top] = num;
        System.out.println(num + " is pushed in Stack.");
    }

    boolean isEmpty(Stack s) {
        return (this.top < 0);
    }

    int pop() {
        if (isEmpty(this)) {
            System.out.println("Stack Underflow.");
            return -1;
        }

        return arr[top--];
    }

    int peek() {
        if (isEmpty(this)) {
            System.out.println("Stack Underflow.");
            return -1;
        }

        return arr[top];
    }

    int search(int x) {
        if (isEmpty(this))
            System.out.println("Stack Underflow.");
        else {
            for (int i = top; i >= 0; i--) {
                if (arr[i] == x)
                    return i;
            }
        }
        return -1;
    }

    void print() {
        for (int i = top; i >= 0; i--)
            System.out.print(arr[i] + " ");
    }
}

public class ImplementAStack {
    public static void main(String[] args) {
        Stack s = new Stack(100);
        s.push(58);
        s.push(38);
        s.push(18);
        s.push(8);

        int pos = s.search(18);
        if (pos != -1)
            System.out.println("Data found at position " + pos);
        else
            System.out.println("Data not found");
        System.out.println(s.pop() + " is popped from Stack.");
        System.out.println(s.peek() + " is top element of the Stack.");
        System.out.println(s.pop() + " is popped from Stack.");
        System.out.println(s.peek() + " is top element of the Stack.");
        s.print();
    }
}