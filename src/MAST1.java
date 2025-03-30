import java.util.Arrays;
import java.util.PriorityQueue;

public class MAST1 {
    public static void main(String[] args) {
        int[] cost={5,3,4,1,3,2};
        System.out.println(Arrays.toString(minCosts(cost)));
    }
    public static int[] minCosts(int[] cost) {
        int[] ans=new int[cost.length];
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<cost.length;i++){
            if(!pq.isEmpty()){
                if(pq.peek()<=cost[i]){
                    ans[i]=pq.peek();
                }else{
                    ans[i]=cost[i];
                    pq.add(cost[i]);
                }
            }else{
                pq.offer(cost[i]);
                ans[i]=cost[i];
            }

        }
        return ans;
    }
}
