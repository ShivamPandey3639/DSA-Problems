import java.util.Scanner;

public class PreparingfortheOlympiad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int[] a=new int[n];
            int[] b=new int[n];
            for(int j=0;j<n;j++){
                int x= sc.nextInt();
                a[j]=x;
            }
            for(int j=0;j<n;j++){
                int x= sc.nextInt();
                b[j]=x;
            }
            int ans=0;
            for(int j=0;j<n;j++){
                if(j+1<n && a[j]>b[j+1] ){
                    ans+=a[j]-b[j+1];
                } else if (j+1>=n) {
                    ans+=a[j];
                }
            }
            System.out.println(ans);
        }
    }
}
