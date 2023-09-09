class Stack {
    int size = 100;
    int arr[] = new int[size];
    int top, bottom;

    public Stack() {
        top = -1;
        bottom = size;
    }

    void push(int num, int id) {
        if (top >= bottom - 1) {
            System.out.println("Stack Overflow.");
            return;
        }

        if (id == 1)
            arr[++top] = num;
        else
            arr[--bottom] = num;
    }
}

public class ImplementTwoStackInArray {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        Stack s2 = new Stack();
        s1.push(45, 1);
        s2.push(68, 2);
        s1.push(123, 1);
    }
}