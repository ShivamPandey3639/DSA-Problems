import java.util.Scanner;
//1 2 3 4 5 6 7 8 9 10     idx
//0 2 1 6 3 4 1 2 8 3
//1 1 2 2 3 4 5 6 7 8      pre
//8 7 7 6 6 5 4 3 2 1      post

public class RudolfandSnowflakes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int l=0;l<t;l++){
            int n=sc.nextInt();
            int i=2,f=0;
            int x=(int) Math.pow(n,(double) 1/i);
            while(x>1){
                long ans=0;
                for(int j=i;j>=0;j--){
                    ans+=Math.pow(x,j);
                }
                if(ans==n){
                    f=1;
                    System.out.println("Yes");
                    break;
                }
                if(ans<n){
                    i++;
                    x=(int) Math.pow(n,(double) 1/i);
                }else {
                    x--;
                }
            }
            if(f==0){
                System.out.println("No");
            }

        }



    }
}
