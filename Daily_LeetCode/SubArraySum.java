package Daily_LeetCode;

public class SubArraySum {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;

        int maxSum = 0;
        int currSum = nums[0];

        for(int i=1; i<n; i++){
            if(nums[i] <= nums[i-1]){
                maxSum = Math.max(maxSum, currSum);
                currSum = 0;
            }
            currSum += nums[i];
        }
        maxSum = Math.max(maxSum, currSum);

        return maxSum;
    }
}
