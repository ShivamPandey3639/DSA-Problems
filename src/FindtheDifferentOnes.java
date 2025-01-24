import java.util.Scanner;

public class FindtheDifferentOnes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int l=0;l<t;l++){
            int n=sc.nextInt();
            int[] a=new int[n+1];
            for(int i=1;i<=n;i++){
                a[i]=sc.nextInt();
            }
            int[] hash=new int[n+1];
            int i=1,j=2;
            while(j<=n){
                if(a[i]!=a[j]){
                    int x=a[i];
                    while(a[i]==x){
                        hash[i]=j;
                        i++;
                    }
                }
                j++;
            }
            int q=sc.nextInt();
            for(int k=0;k<q;k++){
                int q1=sc.nextInt();
                int q2=sc.nextInt();
                if(hash[q1]>q2 || hash[q1]==0){
                    System.out.println(-1+" "+-1);
                }else {
                    System.out.println(q1+" "+hash[q1]);
                }
            }
        }
    }
}
