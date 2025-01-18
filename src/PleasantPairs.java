import java.util.HashMap;
import java.util.Scanner;

public class PleasantPairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int l=0;l<t;l++){
            int n=sc.nextInt();
            HashMap<Integer,Integer> mpp=new HashMap<>();
            int[] a=new int[n+1];
            for(int i=1;i<n+1;i++){
                a[i]=sc.nextInt();
                mpp.put(a[i], i);
            }
            int ans=0;
            for(int i=1;i<n+1;i++){
                if(a[i]==1){
                    for(int j=2*i+1;j<=i+n;j++){
                        if(mpp.containsKey(j) && mpp.get(j)>i){
                            if(mpp.get(j)+i==j)ans++;

                        }
                    }
                }else {
                    int j=a[i];
                    int inc=1;
                    while(j<=2*n-1){
                        if(mpp.containsKey(inc) && mpp.get(inc)>i){
                            if(mpp.get(inc)+i==j)ans++;

                        }
                        inc++;
                        j=a[i]*inc;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
