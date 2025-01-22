class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length + 2;

        int[] newNums = new int[n + 2];

        newNums[0] = 1;
        newNums[n - 1] = 1; // nums 배열의 길이를 넘어가게 되면 1이 그려진 풍선이 있다고 처리

        for(int i = 1; i < n - 1; i++){
          newNums[i] = nums[i - 1];
        } // 새로운 배열 생성

        int[][] dp = new int[n][n];

        for(int left = n - 2; left > -1; left--){ // 계산할 범위의 왼쪽 끝
          for(int right = left + 2; right < n; right++){ // 계산할 범위의 오른쪽 끝
            for(int i= left + 1; i < right; ++i){ // 터트릴 풍선의 인덱스
              dp[left][right] = Math.max(dp[left][right], 
                newNums[left] * newNums[i] * newNums[right] + dp[left][i] + dp[i][right]);
            }
          }
        }

        int answer = dp[0][n - 1];

        return answer;
    }
}