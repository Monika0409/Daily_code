package Daily_LeetCode;

import java.util.HashSet;

public class letterPossible {
    public int numTilePossibilities(String tiles) {
        int n = tiles.length();

        HashSet<String> seq = new HashSet<>();
        boolean[] used = new boolean[n];

        generate(tiles, "", used, seq);

        return seq.size();
    }
    public void generate(String titles, String curr, boolean[] used, HashSet<String> set){
        if(!curr.isEmpty()){
            set.add(curr);
        }

        for(int i=0; i<titles.length(); i++){
            if(!used[i]){
                used[i] = true;
                generate(titles, curr+titles.charAt(i), used, set);
                used[i] = false;
            }
        }
    }
}
