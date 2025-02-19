package Daily_GFG;

import java.util.List;
import java.util.PriorityQueue;

class Node
{
    int data;
    Node next;

    Node(int key)
    {
        data = key;
        next = null;
    }
}

public class mergeList {
     Node mergeKLists(List<Node> arr) {
        // Add your code here.
        
        Node dummy = new Node(-1);
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        for(Node root : arr){
            while(root != null){
                queue.add(root.data);
                root = root.next;
            }
        }
        
        Node curr = dummy;
        while(!queue.isEmpty()){
            Node node = new Node(queue.poll());
            curr.next = node;
            curr = curr.next;
        }
        
        return dummy.next;
    }
}
