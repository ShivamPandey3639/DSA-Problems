import java.util.Scanner;

public class RoadConstruction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] hash=new int[n+1];
        for(int i=0;i<m;i++){
            int x= sc.nextInt();
            int y= sc.nextInt();
            hash[x]++;
            hash[y]++;
        }
        int ans=0;
        for(int i=1;i<hash.length;i++){
            if(hash[i]==0){
                ans=i;
                break;
            }
        }
        System.out.println(n-1);
        for(int i=1;i<=n;i++){
            if(i!=ans){
                System.out.println(ans +" "+i);
            }
        }
    }
}
