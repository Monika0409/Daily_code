package Daily_LeetCode;

public class blackBlock {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();

        int minCount = Integer.MAX_VALUE;

        for(int i=0; i<n-k+1; i++){
            int cnt = 0;
            for(int j=i; j<k+i; j++){
                if(blocks.charAt(j) == 'W'){
                    cnt++;
                }
            }

            minCount = Math.min(minCount , cnt);
        }

        return minCount;
    }
}
