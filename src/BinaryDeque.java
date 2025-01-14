import java.util.Scanner;

public class BinaryDeque {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int l=0;l<t;l++){
            int n=sc.nextInt();
            int s=sc.nextInt();
            int[] a=new int[n];
            int sum=0;
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                sum+=x;
                a[i]=sum;
            }
            if(sum==s){
                System.out.println(0);
                continue;
            }
            if(sum<s){
                System.out.println(-1);
                continue;
            }
            int j=0;
            for(int i=0;i<n;i++){
                if(a[i]>s){
                    j=i;
                    break;
                }
            }
            int i=0;
            int ans=j;
            while(j<n){
                if(a[j]>s){
                    while (a[j]-a[i]!=s){
                        i++;
                    }
                    i++;
                    int x=a[j];
                    while(j<n && a[j]==x){
                        j++;
                    }
                    ans=Math.max(j-i,ans);
                }
            }
            System.out.println(n-ans);
        }
    }
}
