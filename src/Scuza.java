import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Scuza {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int l=0;l<t;l++){
            long n=sc.nextLong();
            long q=sc.nextLong();
            long[] a=new long[(int)n];
            Map<Long, ArrayList<Long>> mpp=new TreeMap<>();
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
            }
            for(long i=0;i<q;i++){
                long x=sc.nextLong();
                if(mpp.containsKey(x)){
                    mpp.get(x).add(i);
                    continue;
                }
                ArrayList<Long> ar=new ArrayList<>();
                ar.add(i);
                mpp.put(x,ar);
            }
            long sum=0,i=0;
            long[] a2=new long[(int) q];
            for(long key: mpp.keySet()){
                long leg=key;

                long idx=mpp.get(key).get(0);
                mpp.get(key).remove(0);
                for(long j=i;j<n;j++){
                    if(leg>=a[(int)j]){
                        sum+=a[(int)j];
                        i++;
                    }else{
                        break;
                    }
                }

                a2[(int)idx]=sum;
                for(int j=0;j<mpp.get(key).size();j++){
                    long x=mpp.get(key).get(j);
                    a2[(int)x]=sum;
                }
            }

            for(int j=0;j<q;j++){
                System.out.print(a2[j]+" ");
            }
            System.out.println();
        }


    }
}
