import java.util.Scanner;

public class SimpleMolecules {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int max=-1,sum=0,flag=0;

        if(a>b && a>c){
            max=a;
            sum+=b+c;
            if(sum<a){
                System.out.println("Impossible");
                flag=1;
            }
        }
        else if(b>a && b>c){
            max=b;
            sum+=a+c;
            if(sum<b){
                System.out.println("Impossible");
                flag=1;
            }
        }
        else if(c>a && c>b){
            max=c;
            sum+=b+a;
            if(sum<c){
                System.out.println("Impossible");
                flag=1;
            }
        }
        if(flag==0) {
            int[] ans={0,0,0};
            int[] in={a,b,c};
            while(in[0]>0){
                if(in[1]<in[2]){
                    in[2]--;
                    in[0]--;
                    ans[2]++;
                }else {
                    in[1]--;
                    in[0]--;
                    ans[0]++;
                }
            }
            while(in[1]>0){
                if(in[0]<in[2]){
                    in[2]--;
                    in[1]--;
                    ans[1]++;
                }
            }
            int x=ans[0]+ans[2];
            int y=ans[0]+ans[1];
            int z=ans[1]+ans[2];
            if(x<a || y<b || z<c){
                System.out.println("Impossible");
            }else {
                System.out.print(ans[0]+" ");
                System.out.print(ans[1]+" ");
                System.out.print(ans[2]+" ");
            }


        }

    }
}
