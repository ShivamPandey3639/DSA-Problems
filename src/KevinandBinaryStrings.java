import java.util.Scanner;

public class KevinandBinaryStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++) {
            String s=sc.next();
            char[] c=s.toCharArray();
            int cnt1=0,cnt2=0;
            int l1=1,r1=s.length(),l2=0,r2=0;
            for(int j=0;j<c.length;j++){
                if(c[j]=='1'){
                    cnt1++;
                }else {
                    break;
                }
            }
            for(int j=cnt1;j<c.length;j++){
                if(c[j]=='0'){
                    cnt2++;
                }else {
                    break;
                }
            }
            if(cnt2==0){
                l2=s.length();
                r2=l2;
            }
            else if(cnt1<=cnt2){
                l2=1;
                r2=s.length()-cnt1;

            }else {
                l2=cnt1-cnt2+1;
                r2=l2+s.length()-cnt1-1;
            }
            System.out.print(l1+" ");
            System.out.print(r1+" ");
            System.out.print(l2+" ");
            System.out.print(r2+" ");
            System.out.println();

        }
    }
}
