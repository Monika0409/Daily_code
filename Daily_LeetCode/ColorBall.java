package Daily_LeetCode;

import java.util.HashMap;
import java.util.Map;

public class ColorBall {
    public int[] queryResults(int limit, int[][] queries) {
        int n = queries.length;
        int[] arr = new int[n];

        Map<Integer, Integer> colorMap = new HashMap<>();
        Map<Integer, Integer> ballMap = new HashMap<>();

        for(int i=0; i<n; i++){
            int ball = queries[i][0];
            int color = queries[i][1];

            if(ballMap.containsKey(ball)){
                int prevColor = ballMap.get(ball);
                colorMap.put(prevColor, colorMap.get(prevColor) - 1);

                if(colorMap.get(prevColor) == 0){
                    colorMap.remove(prevColor);
                }
            }

            ballMap.put(ball, color);
            colorMap.put(color, colorMap.getOrDefault(color, 0)+1);

            arr[i] = colorMap.size();
        }

        return arr;
    }
}
