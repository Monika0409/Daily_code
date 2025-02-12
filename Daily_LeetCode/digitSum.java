package Daily_LeetCode;

import java.util.HashMap;

public class digitSum {
     public int maximumSum(int[] nums) {
        int n = nums.length;
        int maxVal = -1;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            int sumDigit = sumOfdigit(num);

            if(map.containsKey(sumDigit)){
                maxVal = Math.max(maxVal, num + map.get(sumDigit));
                map.put(sumDigit, Math.max(map.get(sumDigit), num));
            }
            else{
                map.put(sumDigit, num);
            }
        }

        return maxVal;
    }
    public int sumOfdigit(int num){
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
}
