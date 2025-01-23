import java.util.*;

public class SubsequenceUpdate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++){
            int n=sc.nextInt();
            int l=sc.nextInt();
            int r=sc.nextInt();
            ArrayList<Pairs> in=new ArrayList<>();
            ArrayList<Pairs> out=new ArrayList<>();
            int a=0;
            int[] a1=new int[n+1];
            for(int i=1;i<n+1;i++){
                int x=sc.nextInt();
                a1[i]=x;
                Pairs p=new Pairs(x,i);
                if(l<=i && i<=r){
                    a+=x;
                    in.add(p);
                }else {
                    out.add(p);
                }
            }


            if(out.size()==0){
                System.out.println(a);
                continue;
            }
            Collections.sort(in, Comparator.comparingInt(x -> x.val));
            Collections.sort(out, Comparator.comparingInt(x -> x.val));
            ArrayList<Pairs> in1=new ArrayList<>(in);
            ArrayList<Pairs> out1=new ArrayList<>(out);
            int ans1=0,ans2=0;

            for(int i=0;i<in.size();i++){
                if(out.size()==0){

                    break;
                }
                if(out.get(0).idx>r){
                    out.remove(0);
                    continue;
                }

                int x=out.get(0).val;
                int y=in.get(in.size()-i-1).val;
                if(y<=x){
                    break;

                }else {
                    out.remove(0);
                    in.set(in.size()-i-1,new Pairs(x,0));
                }

            }

            for(int i=0;i<in1.size();i++){
                if(out1.size()==0){
                    break;
                }
                int y=in1.get(in1.size()-i-1).val;
                if(out1.get(0).idx<l){
                    out1.remove(0);
                    continue;
                }
                int x=out1.get(0).val;
                if(y<=x){
                    break;
                }else {
                    out1.remove(0);
                    in1.set(in1.size()-i-1,new Pairs(x,0));
                }

            }
            for(var it: in){
                ans1+= it.val;
            }
            for(var it: in1){
                ans2+= it.val;
            }

            System.out.println(Math.min(ans1,ans2));







        }
    }
}
class Pairs{
    int val;
    int idx;

    public Pairs(int x,int y){
        this.val=x;
        this.idx=y;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }
}
