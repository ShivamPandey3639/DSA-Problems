import java.util.Scanner;

public class GrandmaCapaKnitsaScarf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int l=0;l<t;l++){
            int n=sc.nextInt();
            String s=sc.next();
            int i=0,j=s.length()-1;
            char c1='A',c2='B';
            int a=0,b=0;
            while(j>i){
                if(s.charAt(i)==s.charAt(j)){
                    i++;
                    j--;
                }else{
                    c1=s.charAt(i);
                    c2=s.charAt(j);
                    a=i;
                    b=j;
                    break;
                }
            }
            if(c1=='A' || c2=='B'){
                System.out.println(0);
                continue;
            }
            int ans=0;
            char prev=c1;
            boolean x1=true;
            while(j>i){
                if(s.charAt(i)==s.charAt(j)){
                    i++;
                    j--;
                }else{
                    if(prev==s.charAt(i)){
                        i++;
                        ans++;
                    } else if (prev==s.charAt(j)) {
                        j--;
                        ans++;
                    }else {
                        x1=false;
                        break;
                    }
                }
            }
            int ans2=0;
            char prev2=c2;
            boolean x2=true;
            while(b>a){
                if(s.charAt(a)==s.charAt(b)){
                    a++;
                    b--;
                }else{
                    if(prev2==s.charAt(a)){
                        a++;
                        ans2++;
                    } else if (prev2==s.charAt(b)) {
                        b--;
                        ans2++;
                    }else {
                        x2=false;
                        break;
                    }
                }
            }
            if(x2 && x1){
                System.out.println(Math.min(ans,ans2));
            } else if (x1) {
                System.out.println(ans);
            }else if(x2) {
                System.out.println(ans2);
            }else {
                System.out.println(-1);
            }

        }
    }
}
