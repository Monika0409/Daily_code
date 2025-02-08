package Daily_GFG;

import java.util.*;


public class TreeBoundry {
    ArrayList<Integer> boundaryTraversal(Node node) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        if(node.left != null || node.right != null){
            ans.add(node.data);
        }
        
        leftNode(node.left, ans);
        addLeaves(node, ans);
        rightNode(node.right, ans);
        
        return ans;
    }
    
    void leftNode(Node node, ArrayList<Integer> ans){
        if(node == null){
            return;
        }
        
        if(node.left != null){
            ans.add(node.data);
            leftNode(node.left, ans);
        }
        else if(node.right != null){
            ans.add(node.data);
            leftNode(node.right, ans);
        }
    }
    void addLeaves(Node node, ArrayList<Integer> ans){
        if(node == null){
            return;
        }
        addLeaves(node.left, ans);
        if(node.left == null && node.right == null){
            ans.add(node.data);
        }
        addLeaves(node.right, ans);
    }
    void rightNode(Node node, ArrayList<Integer> ans){
        if(node == null){
            return;
        }
        
        if(node.right != null){
            rightNode(node.right, ans);
            ans.add(node.data);
        }
        else if(node.left != null){
            rightNode(node.left, ans);
            ans.add(node.data);
        }
    }
}
