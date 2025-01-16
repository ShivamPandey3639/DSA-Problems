import java.util.Arrays;
import java.util.Scanner;
//convert int to long;
public class DolceVita {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int l=0;l<t;l++){
            int n=sc.nextInt();
            int b=sc.nextInt();
            long[] a=new long[n];
            long[] a2=new long[n];
            long sum=0l;
            for(int i=0;i<n;i++){
                long x=sc.nextLong();

                a2[i]=x;
            }
            Arrays.sort(a2);
            if(a2[0]>b){
                System.out.println(0);
                continue;
            }
            long ans=0l,prev=0l;
            for(int i=0;i<n;i++){

                sum+=a2[i];
                a[i]=sum;
                if(sum<=b){
                    ans=i+1;
                }
            }

            for(int i=n-1;i>=0;i--){
                int diff=(int)(b-a[i]-prev*(i+1));
                if(diff<0){
                    continue;
                }
                int more=diff/(i+1);
                ans+=(i+1)*more;
                prev+=more;
            }
            System.out.println(ans);

        }
    }
}
