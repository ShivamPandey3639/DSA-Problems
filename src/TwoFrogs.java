import java.util.Scanner;

public class TwoFrogs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int l=0;l<t;l++){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int[] h=new int[n+1];
            int cnt=0;
            int i=a;
            int j=b;
            if(a<b){
                h[a]=1;
                h[b]=1;
                while(true){
                    if(cnt%2==0){
                        if(i+1<=n && h[i+1]!=1){
                            h[i]=0;
                            h[i+1]=1;
                            i++;
                        } else if (i-1>0 && h[i-1]!=1) {
                            h[i]=0;
                            h[i-1]=1;
                            i--;
                        }else {
                            System.out.println("No");
                            break;
                        }
                    } else if (cnt%2!=0) {
                        if(j-1>0 && h[j-1]!=1){
                            h[j]=0;
                            h[j-1]=1;
                            j--;
                        } else if (j+1<=n && h[j+1]!=1) {
                            h[j]=0;
                            h[j+1]=1;
                            j++;
                        }else {
                            System.out.println("Yes");
                            break;
                        }
                    }
                    cnt++;
                }
            }else {
                h[a]=1;
                h[b]=1;
                while(true){
                    if(cnt%2==0){
                        if(i-1>0 && h[i-1]!=1){
                            h[i]=0;
                            h[i-1]=1;
                            i--;
                        } else if (i+1<=n && h[i+1]!=1) {
                            h[i]=0;
                            h[i+1]=1;
                            i++;
                        }else {
                            System.out.println("No");
                            break;
                        }
                    } else if (cnt%2!=0) {
                        if(j+1<=n && h[j+1]!=1){
                            h[j]=0;
                            h[j+1]=1;
                            j++;
                        } else if (j-1>0 && h[j-1]!=1) {
                            h[j]=0;
                            h[j-1]=1;
                            j--;
                        }else {
                            System.out.println("Yes");
                            break;
                        }
                    }
                    cnt++;
                }
            }

        }
    }
}
