import java.util.Scanner;

public class Crafting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int l=0;l<t;l++){
            int n=sc.nextInt();
            int[] a=new int[n];
            int[] b=new int[n];
            for(int i=0;i<n;i++){
                a[i]= sc.nextInt();

            }
            for(int i=0;i<n;i++){
                b[i]= sc.nextInt();
            }
            int prev=0,f=0,max=Integer.MAX_VALUE;
            boolean eq=false,ze=false;
            for(int i=0;i<n;i++){

                if(a[i]-prev>b[i]){
                    max=Math.min(max,a[i]-prev-b[i]);
                    continue;
                }
                if(a[i]-prev==b[i]){
                    eq=true;
                } else if (!eq && prev==0) {
                    prev+=b[i]-a[i];
                    if(max<b[i]-a[i]){
                        f=1;
                        System.out.println("No");
                        break;
                    }
                }else {
                    f=1;
                    System.out.println("No");
                    break;
                }
            }
            if(f==0){
                System.out.println("Yes");
            }
        }
    }
}
