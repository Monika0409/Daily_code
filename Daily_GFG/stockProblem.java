package Daily_GFG;

import java.util.*;

public class stockProblem {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // write code here
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        
        int count = 1;
        int j=0;
        
        for(int i=1; i<arr.length; i++){
            j = i - 1;
            
            while(j >= 0 && arr[i] >= arr[j]){
                count++;
                j--;
            }
            
            list.add(count);
            count = 1;
        }
        
        return list;
    }
}
