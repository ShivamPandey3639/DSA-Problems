import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FarmerJohnsCardGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int l=0;l<t;l++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[][] mat=new int[n][m];
            Map<Integer,Integer> mpp=new TreeMap<>();
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    mat[i][j]=sc.nextInt();
                    mpp.put(mat[i][j],i+1);
                }
            }
            int[] p=new int[n];
            int i=0,cnt=0,f=0;
            for(int key:mpp.keySet()){
                if(i>0  && p[i-1]==mpp.get(key)){
                    System.out.println(-1);
                    f=1;
                    break;
                }
                if(cnt<n){
                    p[i]=mpp.get(key);
                }
                cnt++;
                i++;
                if(i>=n)i=0;
            }
            if(f==1){
                continue;
            }
            if(n!=1 && p[0]==p[n-1]){
                System.out.println(-1);
                continue;
            }
            for(int j=0;j<n;j++){
                System.out.print(p[j]+" ");
            }
            System.out.println();


        }
    }
}
