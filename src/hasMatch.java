public class hasMatch {
    public static boolean hasMatch(String s, String p) {
        String s1="",s2="";
        int f=0;
        for(int i=0;i<p.length();i++){
            if(p.charAt(i)=='*'){
                f=1;
                continue;
            }
            if(f==0){
                s1+=p.charAt(i);
            }else{
                s2+=p.charAt(i);
            }

        }
        boolean x=lcs(s,s1)==s1.length();
        boolean y=lcs(s,s2)==s2.length();
        return x && y;

    }
    public static int lcs(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        // Create a 2D array to store LCS lengths
        int[][] dp = new int[n + 1][m + 1];
        int ans = 0; // Initialize a variable to store the maximum LCS length

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                // If the characters at the current indices are the same, extend the LCS
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    int val = 1 + dp[i - 1][j - 1];
                    dp[i][j] = val;
                    ans = Math.max(ans, val); // Update the maximum LCS length
                } else {
                    dp[i][j] = 0; // Reset LCS length if characters don't match
                }
            }
        }

        return ans; // Return the length of the Longest Common Substring (LCS)
    }

    public static void main(String[] args) {
        String s="leetcode",p="ee*e";
        System.out.println(hasMatch(s,p));
    }
}
