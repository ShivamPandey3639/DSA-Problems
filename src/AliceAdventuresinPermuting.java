import java.util.Scanner;

public class AliceAdventuresinPermuting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        for (long i = 0; i < t; i++) {
            long n = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            if(n==1 && b==0 && c==0){
                System.out.println(0);
                continue;
            }
            if (b == 0 && c == 0 && n>2) {
                System.out.println(-1);
                continue;
            }
            if (n - 1 < c) {
                System.out.println(n);
                continue;
            }
//            if (b == 0) {
//                System.out.println(n - 1);
//                continue;
//            }
            if (b == 0) {
                if(n-1>c){
                    System.out.println(-1);
                }else{
                    System.out.println(n-1);
                }

                continue;
            }
            if ((n - 1 - c) % b != 0) {
                long x = n - 2 - c;
                long ans = n - ((x / b) + 1);
                System.out.println(ans);
                continue;
            }
            long y = (n - 1 - c) / b;
            long res = n - y - 1;
            System.out.println(res);
        }
    }
}
