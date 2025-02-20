package Daily_LeetCode;

public class UniqueString {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder ans = new StringBuilder();
        int n = nums.length;

        for(int i=0; i<n; i++){
            Character ch = nums[i].charAt(i);

            ans.append(ch == '0' ? '1' : '0');
        }

        return ans.toString();
    }
}
