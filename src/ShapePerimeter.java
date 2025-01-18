import java.util.Scanner;

public class ShapePerimeter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int l=0;l<t;l++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[] x=new int[n];
            int[] y=new int[n];
            for(int i=0;i<n;i++){
                x[i]=sc.nextInt();
                y[i]=sc.nextInt();
            }

            int ini=x[0],ini2=y[0];
            int fina=0,fina2=0,j=0;

                for(int i=0;i<n;i++){

                    fina+=x[i];
                    fina2+=y[i];

                }

            int var1=(fina+m-ini)*2;
            int var2=(fina2+m-ini2)*2;
            System.out.println(var1+var2);

        }
    }
}
