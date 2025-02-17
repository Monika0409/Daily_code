package Daily_GFG;

import java.util.*;

public class KthLargest {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        
        Arrays.sort(arr);
        
        for(int i=arr.length-1; i>=0; i--){
            if(k > 0){
                list.add(arr[i]);
                k--;
            }
        }
        
        return list;
    }
}
