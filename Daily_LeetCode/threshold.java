package Daily_LeetCode;

import java.util.PriorityQueue;

public class threshold {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> minHeap = new PriorityQueue<>();

        for(int num : nums){
            minHeap.add((long) num);
        }

        int count = 0;

        while(minHeap.size() > 1 && minHeap.peek() < k){
            long x = minHeap.poll();
            long y = minHeap.poll();

            long newEle = Math.min(x, y) * 2 + Math.max(x,y);
            minHeap.add(newEle);

            count++;
        }

        return count;
    }

}
