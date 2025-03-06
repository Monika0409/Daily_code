package Daily_LeetCode;


class  missRepeatNum {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;

        int repeat = -1;
        int missing = -1;

        int[] freq = new int[n * n + 1];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                freq[grid[i][j]]++;  
            }
        }

        for(int i=1; i<freq.length; i++){
            if(freq[i] == 0){
                missing = i;
            }
            else if(freq[i] == 2){
                repeat = i;
            }
        }

        return new int[]{repeat, missing};
    }
}


