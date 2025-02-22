package Daily_GFG;

import java.util.*;

public class LongParanthesis {
    static int maxLength(String s) {
        // code here
        Stack<Integer> st = new Stack<>();
        
        st.push(-1);
        int maxlen = 0;
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch == '('){
                st.push(i);
            }
            else{
                st.pop();
                
                if(st.isEmpty()){
                    st.push(i);
                }
                else{
                    maxlen = Math.max(maxlen, i-st.peek());
                }
            }
        }
        
        return maxlen;
    }
}
