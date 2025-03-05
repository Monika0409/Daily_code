package Daily_GFG;

import java.util.*;

public class StringChain {
    public int longestStringChain(String words[]) {
        // code here
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        Map<String , Integer> map = new HashMap<>();
        int maxLen = 1;
        
        for(String word : words){
            int maxChain = 1;
            for(int i=0; i<word.length(); i++){
                String predecessor = word.substring(0, i) + word.substring(i+1);
                
                if(map.containsKey(predecessor)){
                    maxChain = Math.max(maxChain, map.get(predecessor) + 1);
                }
            } 
            
            map.put(word, maxChain);
            
            maxLen = Math.max(maxLen, maxChain);
        }
        return maxLen;
    }
}
