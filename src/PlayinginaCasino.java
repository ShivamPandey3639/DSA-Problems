import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
//covert int to long.
public class PlayinginaCasino {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int l=0;l<t;l++){
            int n= sc.nextInt();
            int m=sc.nextInt();
            HashMap<Integer, ArrayList<Integer>> mpp=new HashMap<>();
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    int x= sc.nextInt();
                    if(!mpp.containsKey(j)){
                        ArrayList<Integer> a=new ArrayList<>();
                        a.add(x);
                        mpp.put(j,a);
                        continue;
                    }
                    mpp.get(j).add(x);
                }
            }

            for(var it:mpp.keySet()){

                Collections.sort(mpp.get(it));
            }
            int sum=0;
            for(int i=0;i<m;i++){
                ArrayList<Integer> a=mpp.get(i);
                int prev_sum=0;
                int x=a.get(0);
                for(int j=1;j<n;j++){
                    sum+=Math.abs(x-a.get(j));
                    prev_sum+=Math.abs(x-a.get(j));
                }

                for(int j=1;j<n-1;j++){
                    prev_sum=prev_sum-(a.get(j)-x)*(n-j);
                    sum+=prev_sum;
                    x=a.get(j);
                }

            }
            System.out.println(sum);

        }
    }
}
