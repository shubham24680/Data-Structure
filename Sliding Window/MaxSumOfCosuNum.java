import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxSumOfCosuNum {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        // Input
        int i, n, k;
        System.out.print("Enter the Array length: ");
        n = Integer.parseInt(buffer.readLine());
        int a[] = new int[n];
        for (i = 0; i < n; i++)
            a[i] = Integer.parseInt(buffer.readLine());
        k = Integer.parseInt(buffer.readLine());

        // Processing
        int sum = window(a, n, k);
        System.out.println("Sum: " + sum);
    }

    static int window(int a[], int n, int k) {
        int sum, max_sum, i;
        sum = 0;
        if (n < k)
            return -1;

        for (i = 0; i < k; i++)
            sum += a[i];
        max_sum = sum;
        for (i = k; i < n; i++) {
            sum += (a[i] - a[i - k]);
            if (sum > max_sum)
                max_sum = sum;
        }

        return max_sum;
    }
}
