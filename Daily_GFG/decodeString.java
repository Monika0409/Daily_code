package Daily_GFG;

import java.util.Stack;

public class decodeString {
    static String decodeString(String s) {
        // code here
        Stack<String> st = new Stack<>();
        Stack<Integer> countSt = new Stack<>();
        
        String currString = "";
        int k = 0;
        
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                k = k * 10 + (ch - '0');
            }
            else if(ch == '['){
                countSt.push(k);
                st.push(currString);
                currString = "";
                k = 0;
            }
            else if(ch == ']'){
                StringBuilder decodeString = new StringBuilder(st.pop());
                int repeat = countSt.pop();
                for(int i=0; i<repeat; i++){
                    decodeString.append(currString);
                }
                currString = decodeString.toString();
            }
            else{
                currString += ch;
            }
        }
        
        return currString;
    }
}
