package Daily_GFG;

import java.util.ArrayList;

public class PairSum {
    boolean findTarget(Node root, int target) {
        // Write your code here
        ArrayList<Integer> list =  new ArrayList<>();
        
        helper(root, list);
        
        int left = 0, right = list.size()-1;
        
        while(left < right){
            int sum = list.get(left) + list.get(right);
            
            if(sum == target){
                return true;
            }
            else if(sum < target){
                left++;
            }
            else{
                right--;
            }
        }
        
        return false;
    }
    void helper(Node root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        
        helper(root.left, list);
        list.add(root.data);
        helper(root.right, list);
    }
}
