package Daily_GFG;

public class LCA_BST {
    Node LCA(Node root, Node n1, Node n2) {
        // your code here.
        int min = Math.min(n1.data, n2.data);
        int max = Math.max(n1.data, n2.data);
        
        while(root != null){
            int val = root.data;
            
            if(val < min){
                root = root.right;
            }
            else if(val > max){
                root = root.left;
            }
            else{
                return root;
            }
        }
        
        return null;
    }
}
