import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
//convert this to cpp it will work.
public class MaximizeMex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int l=0;l<t;l++){
            int n=sc.nextInt();
            int x=sc.nextInt();
            HashMap<Integer,Integer> mpp=new HashMap<>();
            int flag=0;
            for(int i=0;i<n;i++){
                int y=sc.nextInt();
                if(y==0){
                    flag=1;
                }
                mpp.put(y,mpp.getOrDefault(y,0)+1);
            }
            if(flag==0){
                System.out.println(0);
                continue;
            }

            flag=0;
            ArrayList<Integer> a=new ArrayList<>();
            if(mpp.get(0)>1){
                a.add(0);
            }
            for(int i=1;i<=n;i++){
                int f=0;

                if(mpp.containsKey(i)){
                    if(mpp.get(i)>1){
                        a.add(i);
                    }
                }else{
                    int y=i,z=x;
                    if(y<z){

                        System.out.println(i);
                        break;
                    }
                    y=i-x;
                    if(mpp.containsKey(y) && mpp.get(y)>1){
                        mpp.put(y,mpp.get(y)-1);
                        mpp.put(i,1);
                        if(mpp.get(y)==1){
                            a.remove(Integer.valueOf(y));
                        }
                        continue;
                    }
                    y=i;
                    for(int j=0;j<a.size();j++){
                        int it=a.get(j);
                        int s=y-it;
                        if(s<0){
                            continue;
                        }
                        if(s%x==0){
                            mpp.put(it,mpp.get(it)-1);
                            mpp.put(i,1);
                            if(mpp.get(it)==1){
                                a.remove(j);
                            }
                            f=1;
                            break;
                        }
                    }

                    if(f==0){

                        System.out.println(i);
                        break;
                    }

                }
            }
        }
    }
}
