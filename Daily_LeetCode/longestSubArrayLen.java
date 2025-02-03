package Daily_LeetCode;

public class longestSubArrayLen {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;

        int increment = 1, decrement = 1;
        int maxLen = 1;

        for(int i=0; i<n-1; i++){
            if(nums[i+1] > nums[i]){
                increment++;
                decrement = 1;
            }
            else if(nums[i+1] < nums[i]){
                decrement++;
                increment = 1;
            }
            else{
                increment = 1;
                decrement = 1;
            }

            maxLen = Math.max(maxLen, Math.max(increment, decrement));
        }

        return maxLen;
    }
}
