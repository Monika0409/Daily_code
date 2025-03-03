package Daily_GFG;

import java.util.*;

public class LongSubArray {
    public ArrayList<Integer> longestSubarray(int[] arr, int x) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        
        Deque<Integer> maxDq = new LinkedList<>();
        Deque<Integer> minDq = new LinkedList<>();
        
        int str = 0, maxLen = 0, ansStr = 0;
        
        for(int i=0; i<arr.length; i++){
            while(!maxDq.isEmpty() && arr[maxDq.peekLast()] <= arr[i]){
                maxDq.pollLast();
            }
            maxDq.addLast(i);
            while(!minDq.isEmpty() && arr[minDq.peekLast()] >= arr[i]){
                minDq.pollLast();
            }
            minDq.addLast(i);
            
            while(arr[maxDq.peekFirst()] - arr[minDq.peekFirst()] > x){
                str++;
                if(maxDq.peekFirst() < str) maxDq.pollFirst();
                if(minDq.peekFirst() < str) minDq.pollFirst();
            }
            
            if(i-str + 1 > maxLen){
                maxLen = i-str + 1;
                ansStr = str;
            }
        }
        
        for(int i=ansStr; i<ansStr+maxLen; i++){
            list.add(arr[i]);
        }
        
        return list;
    }
}
