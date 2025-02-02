package Daily_GFG;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class levelOrderTrav {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // Your code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        if(root == null){
            return list;
        }
        
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            ArrayList<Integer> currLevel = new ArrayList<>();
            
            for(int i=0; i<levelSize; i++){
                Node currNode = queue.poll();
                currLevel.add(currNode.data);
                
                if(currNode.left != null){
                    queue.offer(currNode.left);
                }
                
                if(currNode.right != null){
                    queue.offer(currNode.right);
                }
            }
            list.add(currLevel);
        }
        
        return list;
    }
}

