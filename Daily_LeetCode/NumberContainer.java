package Daily_LeetCode;

import java.util.HashMap;
import java.util.PriorityQueue;

public class NumberContainer {
    HashMap<Integer, PriorityQueue<Integer>> res;
    HashMap<Integer, Integer> indexVal;

    public NumberContainer() {
        res = new HashMap<>();
        indexVal = new HashMap<>();
    }
    
    public void change(int index, int number) {
        if(indexVal.containsKey(index)){
            int prevNum = indexVal.get(index);
            if(prevNum == number){
                return;
            }
            res.get(prevNum).remove(index);
        }
        res.computeIfAbsent(number, k -> new PriorityQueue<>()).offer(index);
        indexVal.put(index, number);
    }
    
    public int find(int number) {
        PriorityQueue<Integer> pq = res.getOrDefault(number, new PriorityQueue<>());
        return pq.isEmpty() ? -1 : pq.peek();
    }
}
