package Daily_LeetCode;

import java.util.Arrays;

public class equalString {
     public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }

        char[] s1freq = new char[26];
        char[] s2freq = new char[26];
        int count = 0;

        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                count++;

                if(count > 2) return false;
            }

            s1freq[s1.charAt(i) - 'a']++;
            s2freq[s2.charAt(i) - 'a']++;
        }
        return Arrays.equals(s1freq, s2freq);
    }
}
