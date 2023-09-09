import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindPairWithAGivenSum {
    public static void main(String[] args) throws IOException{
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the length of the Array: ");
        int n = Integer.parseInt(buffer.readLine());
        System.out.print("Enter the element of the Array: ");
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = Integer.parseInt(buffer.readLine());
        sort(arr,n-1);

        System.out.print("Enter the no. of rotation: ");
        int d = Integer.parseInt(buffer.readLine());
        ArrayRotation.reversal(arr,d%n);

        System.out.print("Enter the sum of element you want: ");
        int sum = Integer.parseInt(buffer.readLine());
        if(find(arr,n,sum))
            System.out.println("Data Match, you found desired result.");
        else
            System.out.println("Data not found.");
    }

    public static void sort(int x[], int len){
        int i, key, j;
        for(i = 1; i <= len; i++){
            key = x[i];
            j = i - 1;
            while(j >= 0 && x[j] > key){
                x[j + 1] = x[j];
                j--;
            }
            x[j + 1] = key;
        }
    }

    public static boolean find(int x[], int len, int sum){
        int i, dec = len - 1, inc = 0;
        for(i=0; i<len-1; i++)
            if(x[i] > x[i + 1])
            {
                dec = i;
                inc = i+1;
                break;
            }

        int count = 0;
        while(count <= (len - 2)){
            if((x[inc] + x[dec]) == sum)
                return true;
            else if((x[inc] + x[dec]) < sum)
            {
                inc++;
                count++;
            }
            else 
            {
                dec--;
                count++;
            }

            if(inc == len)
                inc = 0;
            if(dec == -1)
                dec = len - 1;
        }
        return false;
    }
}
