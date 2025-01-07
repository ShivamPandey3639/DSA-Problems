public class isInterleave {
    //memoize it.
    public static boolean isInterleave(String s1, String s2, String s3) {
        return func(0,0,0,-1,0,0,s1,s2,s3);
    }
    public static boolean func(int i,int j,int k,int prev,int cnt1,int cnt2,String s1, String s2, String s3){
        if(k==s3.length()){
            return Math.abs(cnt2-cnt1)<=1?true:false;
        }
        if(j>=s2.length()){
            if(cnt1-cnt2>1)return false;
        }
        if(i>=s1.length()){
            if(cnt2-cnt1>1)return false;
        }
        boolean x=false,y=false;
        if(i<s1.length() && s1.charAt(i)==s3.charAt(k)){
            if(prev==-1 || prev==1){
                cnt1++;
            }
            x=func(i+1,j,k+1,0,cnt1,cnt2,s1,s2,s3);
            if(!x && (prev==1 || prev==-1))cnt1--;
        }
        if(j<s2.length() && s2.charAt(j)==s3.charAt(k)){
            if(prev==-1 || prev==0){
                cnt2++;
            }
            y=func(i,j+1,k+1,1,cnt1,cnt2,s1,s2,s3);
            if(!y && (prev==0 || prev==-1))cnt2--;
        }
        return x || y;

    }

    public static void main(String[] args) {
        String s1="aabcc";
        String s2="dbbca";
        String s3="aadbbcbcac";
        System.out.println(isInterleave(s1,s2,s3));
    }
}
