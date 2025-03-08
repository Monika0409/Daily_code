package Daily_GFG;

public class LPalindromString {
    static String longestPalindrome(String s) {
        // code here
        int n = s.length();
        
        if(n == 0) return "";
        int start = 0, end = 0, maxLen = 1;
        
        for(int i=0; i<n; i++){
            int l = i, r = i;
            
            while(l >= 0 && r < n && s.charAt(l) == s.charAt(r)){
                l--;
                r++;
            }
            
            int len = r - l - 1;
            
            if(len > maxLen){
                maxLen = len;
                start = l + 1;
                end = r - 1;
            }
        }
        
        for(int i=0; i<n; i++){
            int l = i, r = i+1;
            
            while(l >= 0 && r < n && s.charAt(l) == s.charAt(r)){
                l--;
                r++;
            }
            int len = r - l - 1;
            if(len > maxLen){
                maxLen = len;
                start = l + 1;
                end = r - 1;
            }
        }
        
        return s.substring(start, start+maxLen);
    }
}
