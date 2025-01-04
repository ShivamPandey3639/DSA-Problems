import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
//Convert this in Cpp.Then It will work.
public class Equalize {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int l=0;l<t;l++){
            int n=sc.nextInt();
            Set<Integer> set=new TreeSet<>();
            for(int i=0;i<n;i++){
                int x= sc.nextInt();
                set.add(x);
            }
            ArrayList<Integer> a=new ArrayList<>();
            for (int element : set) {
                a.add(element);
            }
            int i=0,j=1;
            int ans=1;
            while(j<a.size()){
                int x=a.get(i);
                int y=a.get(j);
                int f=0;
                if(y-x>=n){
                    ans=Math.max(ans,j-i);
                    i++;
                    f=1;
                }
                if(f==0){
                    ans=Math.max(ans,j-i+1);
                }

                j++;
            }

            System.out.println(ans);
        }
    }
}
