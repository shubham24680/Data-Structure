public class TrivialHashing {
    final static int max = 1000;
    static boolean[][] hasmap = new boolean[2][max + 1];

    static void insert(int a[], int len) {
        for (int i = 0; i < len; i++) {
            if (a[i] >= 0)
                hasmap[1][a[i]] = true;
            else {
                int change = Math.abs(a[i]);
                hasmap[0][change] = true;
            }
        }
    }

    static boolean search(int index) {
        if (index >= 0)
            return (hasmap[1][index] == true) ? true : false;

        int change = Math.abs(index);
        if (hasmap[0][change] == true)
            return true;
        return false;
    }

    public static void main(String args[]) {
        int arr[] = { -1, -2, -3, -5, 7, -9 };
        insert(arr, arr.length);
        int index = -5;
        if (search(index) == true)
            System.out.println("Element is Present.");
        else
            System.out.println("Element is not Present.");
    }
}
