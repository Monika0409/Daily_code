package Daily_GFG;

import java.util.Stack;

public class parenthesis {
    static boolean isBalanced(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        int n = s.length();
        
        for(int i=0;i <n; i++){
            char ch = s.charAt(i);
            
            if(ch == '[' || ch == '{' || ch == '('){
                st.push(ch);
            }
            else{
                
                if(st.isEmpty()) return false;
                char p = st.peek();
                
                if(ch == ')' && p != '(') return false;
                else if(ch == '}' && p != '{') return false;
                else if(ch == ']' && p != '[') return false;
                else st.pop();
            }
        }
        
        return st.isEmpty();
    }
}
