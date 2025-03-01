package Daily_LeetCode;

public class arrayOperation {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;

        int arr[] = new int[n];

        for(int i=0; i<n-1; i++){
            int j = i+1;

            if(nums[i] == nums[j]){
                nums[i] = nums[i] * 2;
                nums[j] = 0;
            }
        }

        int count = 0;
        for(int i=0; i<n; i++){
            if(nums[i] != 0){
                arr[count] = nums[i];
                count++;
            }
        }

        while(count < n){
            arr[count] = 0;
            count++;
        }

        return arr;
    }
}
