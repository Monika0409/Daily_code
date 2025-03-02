package Daily_GFG;

import java.util.ArrayList;

public class maxSubarray {
    public ArrayList<Integer> maxOfSubarrays(int arr[], int k) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < k; i++) {
           if (arr[i] > max) {
              max = arr[i];
           }
        }
        list.add(max);
    
        for(int i=k; i<n; i++){
            
            if (arr[i - k] == max) {
                max = Integer.MIN_VALUE;
                
                for (int j = i - k + 1; j <= i; j++) {
                   if (arr[j] > max) {
                      max = arr[j];
                   }
                }
            } 
            else {
               if (arr[i] > max) {
                  max = arr[i];
               }
            }
            
            list.add(max);
        }
        
        return list;
    }
}
