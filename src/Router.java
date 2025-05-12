import java.util.Scanner;

public class Router {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int l=0;l<t;l++){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                if(x<0){
                    a[i]=-x;
                }else{
                    a[i]=x;
                }
            }
            int req=n%2==0?(n/2)-1:n/2;
            int smaller=0,tar=a[0];
            for(int i=0;i<a.length;i++){
                if(tar==a[i])continue;
                if(tar>a[i])smaller++;
            }
            int larger=n-smaller-1;
            if(smaller>req && larger!=req){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }
        }
    }


}
