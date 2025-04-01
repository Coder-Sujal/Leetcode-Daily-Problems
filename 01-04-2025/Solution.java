class Solution {
    
    public long mostPoints(int[][] questions) {
        int n = questions.length;
        long[] dp = new long[n];
        
        for(int i = n-1;i>=0;i--){
            int pt = questions[i][0];
            int bp = questions[i][1];

            int fri = bp + i + 1;

            if(fri <  n){
               dp[i] = dp[fri] + pt;
            }
            else{
               dp[i] = pt;
            }

            if(i<n && i+1<n){
                dp[i] = Math.max(dp[i+1],dp[i]);
            }

        }

        return dp[0];
    }
}