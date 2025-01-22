class Solution {
    public int maxArea(int[] height) {
        // 투포인터
        int left = 0; 
        int right = height.length - 1;

        int max = Integer.MIN_VALUE;

        while(left < right){
          int curr = Math.min(height[right], height[left]) * (right - left); // 현재 넓이

          max = Math.max(max, curr);

          // 포인터 조정
          if(height[left] < height[right]) {
            left++; // 오른쪽이 더 크다면 -> 오른쪽을 조정해도 왼쪽이 낮으니 최댓값 갱신에 지장 X, 따라서 왼쪽을 조정해야 함
          } else {
            right--; // 마찬가지
          }
        }

        return max;
    }
}