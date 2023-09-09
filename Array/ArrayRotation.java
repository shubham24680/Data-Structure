import java.io.*;

class ArrayRotation {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number: ");
        int n = Integer.parseInt(buffer.readLine());
        int arr[] = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(buffer.readLine());
        System.out.print("Enter the no. of left rotation: ");
        int d = Integer.parseInt(buffer.readLine());
        d %= n;

        int method = Integer.parseInt(buffer.readLine());
        switch (method) {
            case 1:
                normal(arr, d);
                break;
            case 2:
                juggler(arr, d);
                break;
            case 3:
                reversal(arr, d);
                break;
        }

        printArray(arr);
    }

    // Time complexity: O(N)
    // Auxiliary Space: O(N)
    public static void normal(int a[], int d) {
        int temp[] = new int[d];
        for (int i = 0; i < d; i++)
            temp[i] = a[i];

        for (int i = 0; i < a.length - d; i++)
            a[i] = a[i + d];

        for (int i = 0; i < d; i++)
            a[d + 1 + i] = temp[i];
    }

    // Time complexity: O(N)
    // Auxiliary Space: O(1)
    public static void juggler(int a[], int d) {
        int temp = gcd(a.length, d);
        int store, j, k;
        for (int i = 0; i < temp; i++) {
            store = a[i];
            j = i;
            while (true) {
                k = j + d;
                if (k >= a.length)
                    k = k - a.length;
                if (k == i)
                    break;
                a[j] = a[k];
                j = k;
            }
            a[j] = store;
        }
    }

    public static int gcd(int x, int y) {
        if (x == 0)
            return y;
        if (y == 0)
            return x;

        if (x < y)
            return gcd(x, y % x);
        return gcd(x % y, y);
    }

    // Time Complexity: O(N*d)
    // Auxiliary Space: O(1)
    public static void reversal(int a[], int d) {
        rev(a, 0, d);
        rev(a, d, a.length);
        rev(a, 0, a.length);
    }

    public static void rev(int x[], int beg, int end) {
        for (int i = beg; i <= beg + (end - 1 - beg) / 2; i++) {
            int change = x[i];
            x[i] = x[beg + (end - 1 - i)];
            x[beg + (end - 1 - i)] = change;
        }

    }

    public static void printArray(int x[]) {
        for (int i = 0; i < x.length; i++)
            System.out.print(Integer.toString(x[i]) + " ");
    }
}