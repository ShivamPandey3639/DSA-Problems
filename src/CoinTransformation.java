import java.util.Scanner;

public class CoinTransformation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int l=0;l<t;l++){
            long n= sc.nextLong();
            int ans=1;
            while(n>3){
                ans*=2;
                n/=4;
            }

            System.out.println(ans);
        }
    }
}
