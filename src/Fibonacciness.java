import java.util.HashMap;
import java.util.Scanner;

public class Fibonacciness {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int l=0;l<t;l++){
            int[] a=new int[6];
            a[1]=sc.nextInt();
            a[2]=sc.nextInt();
            a[4]=sc.nextInt();
            a[5]=sc.nextInt();
            int x=a[1]+a[2];
            int y=a[4]-a[2];
            int z=a[5]-a[4];
            HashMap<Integer,Integer> mpp=new HashMap<>();
            mpp.put(x,1);
            mpp.put(y,mpp.getOrDefault(y,0)+1);
            mpp.put(z,mpp.getOrDefault(z,0)+1);
            int mx=0;
            for(int it: mpp.values()){
                mx=Math.max(mx,it);
            }
            System.out.println(mx);
        }
    }
}
