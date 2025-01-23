import java.util.Scanner;

public class MinimalCoprime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int l=sc.nextInt();
            int r=sc.nextInt();
            int ans=r-l;
            if(ans==0){
                if(l==1)ans++;
            }
            System.out.println(ans);
        }
    }
}
