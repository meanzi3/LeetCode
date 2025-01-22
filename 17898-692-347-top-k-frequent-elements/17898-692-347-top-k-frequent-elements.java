import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
          map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        } // 숫자 - 갯수 맵

        // value값을 기준으로 내림차순으로 저장하는 최대 힙
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
          maxHeap.offer(entry);
        }

        // 정답 배열
        int[] answer = new int[k];

        for(int i = 0; i < answer.length; i++){
          answer[i] = maxHeap.poll().getKey();
        }

        return answer;
    }
}