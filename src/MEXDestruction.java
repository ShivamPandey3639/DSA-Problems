import java.util.Scanner;

public class MEXDestruction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int m=0;m<t;m++){
            int n= sc.nextInt();
            int[] arr=new int[n];
            int cnt=0,cnt1=0;
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                arr[i]=x;
                if(x==0){
                    cnt++;
                }else {
                    cnt1++;
                }
            }
            if(cnt==n ){
                System.out.println(0);
                continue;
            }
            if(cnt1==n){
                System.out.println(1);
                continue;
            }
            int cnt3=0,x=0,y=0,flag=0;
            for(int i=0;i<n;i++){
                if(arr[i]!=0){
                    cnt3++;
                }
                if (cnt3!=0 && arr[i]==0) {
                    flag=1;
                    if(cnt3!=cnt1){
                        System.out.println(2);
                        break;
                    }else{
                        System.out.println(1);
                        break;
                    }
                }

            }
            if(cnt3==cnt1 && flag==0){
                System.out.println(1);
            }

        }
    }
}
