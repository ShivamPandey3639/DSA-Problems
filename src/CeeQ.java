import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CeeQ {
    public static void main(String[] args) {
        int[] a={1,3,1,4,1,3,2};
        int[] b={0,3,5};
        System.out.println(solveQueries(a,b));
    }
    public static List<Integer> solveQueries(int[] nums, int[] queries) {
        int[] hash=new int[1000000+1];
        int[] ans=new int[nums.length];
        Arrays.fill(hash,-1);
        Arrays.fill(ans,Integer.MAX_VALUE);
        int n=nums.length;
        for(int i=0;i<2*nums.length;i++){
            if(hash[nums[i%n]]==-1){
                hash[nums[i%n]]=i%n;
            }else{
                int prv=hash[nums[i%n]];
                int diff=Math.abs(i-prv);
                ans[i%n]=Math.min(ans[i%n],diff);
                ans[prv]=Math.min(ans[prv],diff);
                hash[nums[i%n]]=i%n;
            }
        }
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<queries.length;i++){
            if(ans[queries[i]]==n){
                l.add(-1);
                continue;
            }
            l.add(ans[queries[i]]);
        }
        return l;
    }
}
