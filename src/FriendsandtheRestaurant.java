import java.util.Arrays;
import java.util.Scanner;

public class FriendsandtheRestaurant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int l=0;l<t;l++){
            int n=sc.nextInt();
            int[] a=new int[n];
            int[] b=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                b[i]=sc.nextInt();
            }
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=b[i]-a[i];
            }
            Arrays.sort(arr);
            int i=0,j=n-1,ans=0;
            while(j>i){
                if(arr[i]>=0 && arr[j]>=0){
                    ans++;
                    i++;
                    j--;
                } else if (arr[i]<0 && arr[j]>0 &&  Math.abs(arr[i])<=arr[j]) {
                    ans++;
                    i++;
                    j--;
                } else  {
                    i++;
                }
            }
            System.out.println(ans);
        }
    }
}
