import java.util.Scanner;

public class FinalVerdict {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int l=0;l<t;l++){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int sum=0;
            for(int i=0;i<n;i++){
                sum+=sc.nextInt();
            }

            if(sum==n*x){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
