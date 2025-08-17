public class LngPalinSeq156 {
    public int longestPalindromeSubseq(String s) {
        int n=s.length();//5
        int[][] dp= new int[n][n];
        for(int i=0; i<n; i++){
            dp[i][i]=1;   //[[1,2,0,4,4],[0,1,2,2,4],[0,0,1,2,0],[0,0,0,1,1],[0,0,0,0,1]]
        }
        for(int i=2; i<=n; i++){//5
            // j<=3
            for(int j=0; j<=n-i; j++){//0
                int k= i+j-1;//4
                if(s.charAt(j)==s.charAt(k)){//b=b,
                    dp[j][k]= dp[j+1][k-1]+2;//
                }
                else{
                    dp[j][k]= Math.max(dp[j+1][k], dp[j][k-1]);//(1,1)
                }
            }
        }// yogesh
        return dp[0][n-1];
    }
}
