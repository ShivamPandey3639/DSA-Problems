import java.util.Scanner;
import java.util.Vector;

public class StalinSort {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int l=0;l<t;l++){
            int n = sc.nextInt();


            Vector<Integer> v = new Vector<>();


            for (int i = 0; i < n; i++) {
                v.add(sc.nextInt());
            }

            int ans = n;


            for (int i = 0; i < n; i++) {
                int res = 0;
                for (int j = i + 1; j < n; j++) {
                    if (v.get(j) > v.get(i)) {
                        res++;
                    }
                }
                ans =Math.min(res+i,ans) ;
            }


            System.out.println(ans);
        }

    }
}

