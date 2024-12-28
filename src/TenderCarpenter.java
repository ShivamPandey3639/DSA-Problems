import java.util.Scanner;

public class TenderCarpenter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int l=0;l<t;l++){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                arr[i]=x;
            }
            int flag=0;
            for(int i=0;i<n;i++){
                int num=2*arr[i];
                for(int j=i+1;j<n;j++){
                    int num2=arr[j]*2;
                    if(num>arr[j] && arr[i]<num2){
                        System.out.println("YES");
                        flag=1;
                        break;
                    }
                    break;
                }
                if(flag!=0){
                    break;
                }
            }
            if(flag==0){
                System.out.println("NO");
            }


        }
    }
}
