import java.util.Scanner;

public class ABalancedProblemset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int l=0;l<t;l++){
            int x= sc.nextInt();
            int n= sc.nextInt();
            if(n==1){
                System.out.println(x);
                continue;
            }

            if(x%n==0){
                System.out.println(x/n);
                continue;
            }
            int ans=1;
            int z=x/n;
            for(int i=z;i>=1;i--){
                if(x%i==0 && i*(n-1)<x){
                    int y=x-i*(n-1);
                    if(y/i>=1){
                        ans=i;
                        break;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
