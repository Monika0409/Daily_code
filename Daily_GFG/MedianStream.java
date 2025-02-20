package Daily_GFG;

import java.util.*;

public class MedianStream {
    public ArrayList<Double> getMedian(int[] arr) {
        // code here
        
        ArrayList<Double> result = new ArrayList<>();
        PriorityQueue<Integer> leftHalf = new PriorityQueue<>(Collections.reverseOrder()); // Max Heap
        PriorityQueue<Integer> rightHalf = new PriorityQueue<>(); 

        for (int num : arr) {
            if (leftHalf.isEmpty() || num <= leftHalf.peek()) {
                leftHalf.add(num);
            } else {
                rightHalf.add(num);
            }

         
            if (leftHalf.size() > rightHalf.size() + 1) {
                rightHalf.add(leftHalf.poll());
            } else if (rightHalf.size() > leftHalf.size()) {
                leftHalf.add(rightHalf.poll());
            }

        
            if (leftHalf.size() > rightHalf.size()) {
                result.add((double) leftHalf.peek());
            } else {
                result.add((leftHalf.peek() + rightHalf.peek()) / 2.0); 
            }
        }
        
        return result;   
    }
}
