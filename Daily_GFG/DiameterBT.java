package Daily_GFG;

public class DiameterBT {
    int dp = 0;
    int diameter(Node root) {
        // Your code here
        depth(root);
        return dp;
    }
    int depth(Node root){
        if(root == null){
            return 0;
        }
        
        int lD = depth(root.left);
        int rD = depth(root.right);
        dp = Math.max(dp, lD+rD);
        
        return Math.max(lD, rD) + 1;
    }
}
