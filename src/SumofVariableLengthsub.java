public class SumofVariableLengthsub {
    public static void main(String[] args) {
        int[] nums={2,3,1};
        System.out.println(subarraySum(nums));
    }
    public static int subarraySum(int[] nums) {
        int sum=0;
        int[] arr=nums.clone();
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            nums[i]=sum;
        }
        int start=0,end=0,ans=0;;
        for(int i=0;i<nums.length;i++){
            start=Math.max(0,i-nums[i]);
            end=i;
            if(start==end){
                ans+=arr[start];

            }else{
                if(start==0){
                    ans+=nums[end];
                    continue;
                }
                ans+=nums[end]-nums[start-1];
            }
        }
        return ans;
    }
}
