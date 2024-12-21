import java.util.Scanner;

public class PenchickandSataySticks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++) {
            int n = sc.nextInt();
            int[] arr=new int[n+1];
            for(int j=0;j<n;j++){
                int x=sc.nextInt();
                arr[j]=x;
            }
            int curr=arr[0],flag=0;
            for(int j=1;j<n;j++){
                if(curr<arr[j]){
                    curr=arr[j];
                } else if (curr-arr[j]==1) {
                    arr[j]=curr;

                }else {
                    System.out.println("NO");
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println("Yes");
            }

        }
    }
}
