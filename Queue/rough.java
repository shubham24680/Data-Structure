class Street {
    int[] need = new int[3];
    int sum, max;
}

public class rough {
    public static void main(String[] args) {
        boolean[][] area = { { false, true, false }, { true, false, false }, { true, true, false },
                { false, true, false }, { false, true, true } };

        int i, j, n = area.length;
        Street[] la = new Street[n];
        la[0] = new Street();
        la[0].need[0] = (area[0][0]) ? 0 : n;
        la[0].need[1] = (area[0][1]) ? 0 : n;
        la[0].need[2] = (area[0][2]) ? 0 : n;
        // from left to right.
        for (i = 1; i < n; i++) {
            la[i] = new Street();
            for (j = 0; j < area[i].length; j++) {
                la[i].need[j] = (area[i][j]) ? 0 : la[i - 1].need[j] + 1;
            }
        }

        la[n - 1].sum = la[n - 1].need[0] + la[n - 1].need[1] + la[n - 1].need[2];
        la[n - 1].max = Math.max(la[n - 1].need[0], Math.max(la[n - 1].need[1], la[n - 1].need[2]));
        // right to left.
        for (i = (n - 2); i >= 0; i--) {
            for (j = 0; j < area[i].length; j++) {
                la[i].need[j] = (area[i][j]) ? 0 : Math.min((la[i + 1].need[j] + 1), la[i].need[j]);
                la[i].sum += la[i].need[j];
                la[i].max = Math.max(la[i].need[j], la[i].max);
            }
        }

        int index = 0, sum = n, max = n;
        for (i = 0; i < n; i++) {
            if (sum >= la[i].sum && max > la[i].max) {
                sum = la[i].sum;
                max = la[i].max;
                index = i;
            }
            System.out.println(la[i].sum + " " + la[i].max);
        }

        System.out.println("The suitable home is at position " + (index + 1) + " form the left.");
    }
}
