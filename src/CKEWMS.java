import java.util.*;

public class CKEWMS {
    public static void main(String[] args) {
        int[] n={18,11,24,9,10,11,7,29,16};
        int[] s1={28,26,27,4,2,19,23,1,2};
        System.out.println(Arrays.toString(findMaxSum(n,s1,1)));
    }
    public static long[] findMaxSum(int[] nums1, int[] nums2, int k) {
        Map<Integer, ArrayList<Integer>> mpp=new TreeMap<>();
        for(int i=0;i<nums1.length;i++){
            if(mpp.containsKey(nums1[i])){
                mpp.get(nums1[i]).add(i);
                continue;
            }
            ArrayList<Integer> a=new ArrayList<>();
            a.add(i);
            mpp.put(nums1[i],a);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        long[] ans=new long[nums1.length];
        long sum=0;
        for(int key : mpp.keySet()){
            long ds=sum;
            for(int i=0;i<mpp.get(key).size();i++){
                ans[mpp.get(key).get(i)]=ds;
                if(pq.size()<k){

                    pq.add(nums2[mpp.get(key).get(i)]);
                    sum+=nums2[mpp.get(key).get(i)];
                }else{

                    if(pq.peek()<nums2[mpp.get(key).get(i)]){
                        sum-=pq.peek();
                        pq.poll();
                        pq.add(nums2[mpp.get(key).get(i)]);
                        sum+=nums2[mpp.get(key).get(i)];
                    }
                }
            }

        }
        return ans;
    }
}
