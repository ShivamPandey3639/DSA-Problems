import java.util.Scanner;

public class KevinandPermutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int nos=n/k;
            int[] ans=new int[n];
            int x=1,y=n,j=0;
            while(n!=0){
                if((j+1)%(k)==0){
                    ans[j++]=x;
                    x++;
                    n--;
                }else{
                    ans[j++]=y;
                    y--;
                    n--;
                }
            }
            for(int l=0;l<ans.length;l++){
                System.out.print(ans[l]+" ");
            }
            System.out.println();

        }

    }
}

