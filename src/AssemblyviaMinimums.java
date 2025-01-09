import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class AssemblyviaMinimums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int l=0;l<t;l++){
            int n=sc.nextInt();
            int b=(n*(n-1))/2;
            int[] arr=new int[b];
            int[] ans=new int[n];
            HashMap<Integer,Integer> mpp=new HashMap<>();
            for(int i=0;i<b;i++){
                int x=sc.nextInt();
                arr[i]=x;
                mpp.put(x,mpp.getOrDefault(x,0)+1);
            }
            if(mpp.size()==1){
                Arrays.fill(ans,arr[0]);
                for(int i=0;i<n;i++){
                    System.out.print(ans[i]+" ");
                }
                System.out.println();
                continue;
            }
            Arrays.sort(arr);
            int j=0;
            for(int i=0;i<b;i++){
                if(mpp.get(arr[i])==0){
                    continue;
                }
                int x=mpp.get(arr[i])-(n-j-1);
                if(x>0){
                    ans[j]= arr[i];
                    mpp.put(arr[i],x);
                    j++;
                }else {
                    ans[n-mpp.get(arr[i])-1]=arr[i];
                    mpp.put(arr[i],0);
                    j++;
                }

            }
            if(arr[b-1]==1000000000){
                ans[n-1]=arr[b-1];
            }else {
                ans[n-1]=arr[b-1]+1;
            }

            for(int i=0;i<n;i++){
                System.out.print(ans[i]+" ");
            }
            System.out.println();
        }
    }
}
