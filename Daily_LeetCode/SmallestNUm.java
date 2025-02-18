package Daily_LeetCode;

import java.util.Stack;

public class SmallestNUm {
    public String smallestNumber(String pattern) {
        StringBuilder str = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int n = pattern.length();

        for(int i=0; i<=n; i++){
            stack.push(i+1);

            if(i == n || pattern.charAt(i) == 'I'){
                while(!stack.isEmpty()){
                    str.append(stack.pop());
                }
            }
        }

        return str.toString();
    }
}
