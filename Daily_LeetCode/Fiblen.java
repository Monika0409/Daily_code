package Daily_LeetCode;

import java.util.*;

public class Fiblen {
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;

        Set<Integer> set = new HashSet<>();

        for(int num : arr){
            set.add(num);
        }

        int maxlen = 0;

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                int x = arr[i], y = arr[j];
                int len = 2;

                while(set.contains(x+y)){
                    int temp = y;
                    y = x + y;
                    x = temp;
                    len++;
                }
                maxlen = Math.max(maxlen, len);
            }
        }

        return maxlen >= 3 ? maxlen : 0;
    }
}
