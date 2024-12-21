import java.util.Scanner;

public class Medians {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            System.out.println();
            int actmed = (n / 2) + 1;
            if (actmed == k) {
                System.out.println(n);
                for (int j = 1; j <= n; j++) {
                    System.out.print(j+" ");
                }
                System.out.println();
            } else {
                int idx=k-1;
                int right=n-1-idx;
                int left=idx;
                if(right<=0 || left<=0){
                    System.out.println(-1);
                }
                if (left % 2 == 0 && right % 2 == 0) {
                    System.out.println(5);
                    System.out.print(1+" ");
                    System.out.print(k-1+" ");
                    System.out.print(k+" ");
                    System.out.print(k + 1+" ");
                    System.out.println(k + 2);
                } else if (left % 2 != 0 && right % 2 != 0) {
                    System.out.println(3);
                    System.out.print(1+" ");
                    System.out.print(k+" ");
                    System.out.println(k+1);
                } else {
                        idx = k - 1;
                    right = n - idx - 2;
                    left = idx - 1;
                    if(right<=0 || left<=0) {
                        System.out.println(-1);
                        continue;
                    }
                    if (left % 2 == 0 && right % 2 == 0) {
                        System.out.println(5);
                        System.out.print(1+" ");
                        System.out.print(idx - 1+" ");
                        System.out.print(idx+" ");
                        System.out.print(idx + 3+" ");
                        System.out.println(idx + 4);
                    } else if (left % 2 != 0 && right % 2 != 0) {
                        System.out.println(3);
                        System.out.print(1+" ");
                        System.out.print(idx+" ");
                        System.out.println(idx + 3);
                    } else {
                        System.out.println(-1);
                    }
                }

            }
        }
    }
}
