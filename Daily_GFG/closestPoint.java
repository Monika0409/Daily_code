package Daily_GFG;

import java.util.PriorityQueue;

public class closestPoint {
     public int[][] kClosest(int[][] points, int k) {
        // Your code here
        
        int n = points.length;
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) -> Integer.compare(distance(b), distance(a)));
        
        for(int[] pt : points){
            maxHeap.offer(pt);
            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }
        
        int[][] num = new int[k][2];
        
        for(int i=0; i<k; i++){
            num[i] = maxHeap.poll();
        }
        
        return num;
    }  
    
    int distance(int[] point){
        return point[0]*point[0] + point[1]*point[1];
    }
}
