import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n= sc.nextInt();
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            int sum=a+b+c;
            int sum1=a;
            int sum2=a+b;
            if(n<=sum){
                if(n<=sum1){
                    System.out.println(1);
                    continue;
                } else if (n<=sum2) {
                    System.out.println(2);
                    continue;
                }else {
                    System.out.println(3);
                    continue;
                }
            }
            int no3s=n/sum;
            int rem=n-no3s*sum;
            int x=no3s*3;
            if(rem==0){
                System.out.println(x);
            } else if (rem<=sum1) {
                System.out.println(x+1);

            }else if(rem<=sum2){
                System.out.println(x+2);
            }else {
                System.out.println(x+3);
            }
        }
    }
}
