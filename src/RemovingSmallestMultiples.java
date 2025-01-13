import java.util.Scanner;

public class RemovingSmallestMultiples {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int l=0;l<t;l++){
            int n=sc.nextInt();
            String s=sc.next();
            char[] c=s.toCharArray();
            int[] vis=new int[n+1];
            int cost=0;
            for(int i=1;i<=n;i++){
                if(c[i-1]=='1'){
                    continue;
                }
                int sum=0,mul=1;
                if(vis[i]==0){

                } else if (vis[i]!=0) {

                    mul=2;
                }
                int j=i;
                while(j<=n && c[j-1]!='1'){
                    j=i*mul;
                    if(j>n)break;
                    if(c[j-1]=='1')break;
                    if(vis[j]==0){
                        sum+=i;
                        vis[j]=1;
                    }

                    mul++;
                }
                cost+=sum;
            }
            System.out.println(cost);
        }
    }
}
