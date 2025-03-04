package Daily_GFG;

import java.util.ArrayList;
import java.util.Collections;

public class longSubsequence {
    static int lis(int arr[]) {
        // code here
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int num : arr){
            int pos = Collections.binarySearch(list, num);
            
            if(pos < 0){
                pos = -(pos + 1);
            }
            
            if(pos == list.size()){
                list.add(num);
            }
            else{
                list.set(pos, num);
            }
        }
        
        return list.size();
    }
}
