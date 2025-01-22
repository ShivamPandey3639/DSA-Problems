import java.util.Scanner;

public class PalindromeGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int l=0;l<t;l++){
            int n=sc.nextInt();
            String s=sc.next();
            int cnt=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='0'){
                    cnt++;
                }
            }
            boolean pal=true,rev=false,first=true;
            int al=0,bo=0,turn=1;
            while(cnt>0){
                if(turn==1){
                    turn=0;
                    if(pal || rev){
                        al++;
                        cnt--;
                        if(first && (cnt+1)%2==1){
                            first=false;
                        }else {
                            pal=!pal;
                        }
                        first=false;
                    }else {
                        rev=true;
                        first=false;
                    }

                }else {
                    turn=1;
                    if(pal || rev){
                        bo++;
                        cnt--;
                        pal=!pal;
                    }else {
                        rev=true;
                    }

                }
            }
            if(al==bo){
                System.out.println("DRAW");
            }else if(al>bo){
                System.out.println("BOB");
            }else {
                System.out.println("ALICE");
            }

        }
    }
}
