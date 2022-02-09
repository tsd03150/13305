import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] dis = new int[n - 1];
        int[] cost = new int[n];

        for (int i = 0; i < n - 1; i++) {
            dis[i] = kb.nextInt();
        }

        for (int i = 0; i < n; i++) {
            cost[i] = kb.nextInt();
        }

        long sum = 0;
        int minCost = cost[0];

        for (int i = 0; i < n - 1; i++) {

            if (minCost > cost[i]) {
                minCost = cost[i];
            }

            sum += ((long)dis[i] * minCost);
        }

        System.out.println(sum);
    }
}