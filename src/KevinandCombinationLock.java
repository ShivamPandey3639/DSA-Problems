import java.util.Scanner;

public class KevinandCombinationLock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++) {
            int n = sc.nextInt();
            if(n%33==0){
                System.out.println("Yes");
            }else{
                System.out.println("NO");
            }

        }

    }
}
