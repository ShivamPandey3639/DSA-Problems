import java.util.Scanner;

public class pspspsps {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n= sc.nextInt();
            String str=sc.next();
            char[] c=str.toCharArray();
            boolean flag=false;
            int cnt=0,p=0,s=0;
            for(int j=0;j<c.length;j++){
                if(c[j]=='p'){
                    p++;
                }else if(c[j]=='s'){
                    s++;
                }
            }
            if(s==0 || p==0){
                System.out.println("Yes");
                continue;
            }
            if(s==n || p==n){
                System.out.println("Yes");
            }

            for(int j=0;j<c.length;j++){
                if(c[j]=='p'){
                    flag=true;
                }
                if(c[j]=='s' && flag){
                    cnt=1;
                    System.out.println("No");
                    break;
                }
            }
            if(cnt==1){
                continue;
            }else{

                if(p==1 && c[c.length-1]=='p' || (s==1 && c[0]=='s')){
                    System.out.println("Yes");
                }else {
                    System.out.println("No");
                }
            }
        }
    }
}
//ss.p.
//12345