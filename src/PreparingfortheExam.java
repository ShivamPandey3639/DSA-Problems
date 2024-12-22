import java.util.Scanner;

public class PreparingfortheExam {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n= sc.nextInt();
            int m= sc.nextInt();
            int k= sc.nextInt();
            int[] m1=new int[m];
            int[] h=new int[n+1];
            for(int j=0;j<m;j++){
                int x=sc.nextInt();
                m1[j]=x;
            }
            for(int j=0;j<k;j++){
                int x=sc.nextInt();
                h[x]++;
            }

            if(k>=n){
                String s="1".repeat(m);
                System.out.println(s);
            } else if (k<n-1) {
                String s="0".repeat(m);
                System.out.println(s);
            }else {
                for(int j=0;j<m;j++){
                    if(h[m1[j]]>0){
                        System.out.print("0");
                    }else {
                        System.out.print("1");
                    }
                }
                System.out.println();
            }
        }
    }
}
