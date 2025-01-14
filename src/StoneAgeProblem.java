import java.util.Scanner;

public class StoneAgeProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        long[] arr = new long[n + 1];
        long[] lastUpdated = new long[n + 1];
        long resetTime = -1, resetValue = 0;
        long sum = 0;

        // Initialize array and compute the initial sum
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextLong();
            sum += arr[i];
        }

        for (int query = 0; query < q; query++) {
            int t = sc.nextInt();

            if (t == 1) {
                int i = sc.nextInt();
                long x = sc.nextLong();

                // Check if the element has been reset or individually updated
                long currentValue = (lastUpdated[i] > resetTime) ? arr[i] : resetValue;

                // Update the sum
                sum += x - currentValue;

                // Update the element and its timestamp
                arr[i] = x;
                lastUpdated[i] = query; // Record the query timestamp
                System.out.println(sum);
            } else {
                // Type-2 Query: Global reset
                resetValue = sc.nextLong();
                resetTime = query; // Update the reset time
                sum = resetValue * n; // Recalculate the sum
                System.out.println(sum);
            }
        }
    }
}
