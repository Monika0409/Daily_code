package Daily_GFG;

public class pathSumTree {
    int findMaxSum(Node node) {
        // your code goes here
        int maxSum[] = {Integer.MIN_VALUE};
        
        pathSum(node, maxSum);
        
        return maxSum[0];
    }
    
    int pathSum(Node node, int maxSum[]){
        if(node == null){
            return 0;
        }
        
        int left = Math.max(0, pathSum(node.left, maxSum));
        int right = Math.max(0, pathSum(node.right, maxSum));
        
        maxSum[0] = Math.max(maxSum[0], node.data + left + right);
        
        return node.data + Math.max(left, right);
    }
}
