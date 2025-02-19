package Daily_LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class happyString {
     public String getHappyString(int n, int k) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");

        int count = 0;
        while(!queue.isEmpty()){
            String curr = queue.poll();

            if(curr.length() == n){
                count++;
                if(count == k) return curr;
            }
            else{
                char[] chars = {'a', 'b', 'c'};

                for(char c : chars){
                    if(curr.charAt(curr.length() - 1) != c){
                        queue.offer(curr + c);
                    }
                } 
            }
        }

        return "";
    }
}
