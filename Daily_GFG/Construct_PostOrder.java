package Daily_GFG;

public class Construct_PostOrder {
    static int pos;
    public static Node buildTree(int inorder[], int preorder[]) {
        // code here
        pos = 0;
        return helper(inorder, preorder, 0, inorder.length-1);
    }
    
    public static Node helper(int[] inorder, int[] preorder, int left, int right){
        if(left > inorder.length || left > right){
            return null;
        }
        Node root = new Node(preorder[pos]);
        int div = 0;
        
        for(int i=left; i<=right; i++){
            if(preorder[pos] == inorder[i]){
                div = i;
                break;
            }
        }
        
        pos++;
        root.left = helper(inorder, preorder, left, div-1);
        root.right = helper(inorder, preorder, div+1, right);
        
        return root;
    }
}
