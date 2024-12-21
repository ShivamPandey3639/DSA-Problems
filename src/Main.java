import java.util.Scanner;
//Paint a Strip
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
           int len=sc.nextInt();
           if(len==1) System.out.println(1);
           else if(len<=4) System.out.println(2);
           else if(len<=10) System.out.println(3);
           else{
               int cnt=3,x=10,y=6;
               while(len>x){
                   cnt++;
                   y*=2;
                   x+=y;
               }
               System.out.println(cnt);
           }

        }
    }
}