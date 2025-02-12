package Daily_GFG;

import java.util.ArrayList;

public class kthsmall {
    public int kthSmallest(Node root, int k) {
        // Write your code here
        
        ArrayList<Integer> list = new ArrayList<>();
        solve(root, list);
        
        if(k > list.size()){
            return -1;
        }
        
        for(int i=0; i<list.size(); i++){
            if(i == k-1){
                return list.get(i);
            }
        }
        
        return -1;
        
    }
    private void solve(Node node, ArrayList<Integer> list){
        if(node == null){
            return;
        }
        
        solve(node.left, list);
        list.add(node.data);
        solve(node.right, list);
    }
}
