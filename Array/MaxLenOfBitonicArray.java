import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxLenOfBitonicArray {
    public static void main(String[] args) throws IOException{
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the length of the Array: ");
        int n = Integer.parseInt(buffer.readLine());

        System.out.print("Enter the element of the Array: ");
        int a[] = new int[n];
        for(int i=0; i<n; i++)
            a[i] = Integer.parseInt(buffer.readLine());

        int ltor[] = new int[n];
        int rtol[] = new int[n];
        ltor[n - 1] = 1;
        rtol[0] = 1;
        int i, j = 1, k = 1;
        for(i=1; i<n - 1; i++)
        {
            j = (a[i] >= a[i - 1]) ? j + 1 : 1;
                ltor[i] = j;

            k = (a[n - i] <= a[n - i - 1]) ? k + 1 : 1;
                rtol[n - i - 1] = k;
        }

        int max = 0;
        for(i=0; i<n; i++)
            max = ((ltor[i] + rtol[i] - 1) > max) ? (ltor[i] + rtol[i] - 1) : max;
        System.out.println(max);
    }
}
