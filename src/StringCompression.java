public class StringCompression {
    public static int minDifficulty(int[] jobDifficulty, int d) {
        if(d>jobDifficulty.length)return -1;
        return func(d,0,jobDifficulty);
    }
    public static int func(int d,int idx,int[] jobdiff){
        if(d==0 && idx==jobdiff.length){
            return 0;
        }
        if(d==0 || idx==jobdiff.length)return Integer.MAX_VALUE;
        int max=0,min=Integer.MAX_VALUE;
        for(int i=idx;i<jobdiff.length;i++){
            max=Math.max(max,jobdiff[i]);
            int diff=max;
            int fg=func(d-1,i+1,jobdiff);
            if(fg==Integer.MAX_VALUE){
                diff=fg;
            }else{
                diff+=fg;
            }
            min=Math.min(diff,min);
        }
        return min;
    }

    public static void main(String[] args) {
        int[] a={6,5,4,3,2,1};
        System.out.println(minDifficulty(a,2));
    }
}
