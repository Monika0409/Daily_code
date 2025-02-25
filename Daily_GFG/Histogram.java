package Daily_GFG;

import java.util.Stack;

public class Histogram {
    public static int getMaxArea(int arr[]) {
        // your code here
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        stack.push(0);
        
        for(int i=1; i<arr.length; i++){
            while(!stack.isEmpty() && arr[i] < arr[stack.peek()]){
                max = getMax(arr, stack, max, i);
            }
            stack.push(i);
        }
        
        int i = arr.length;
        while(!stack.isEmpty()){
            max = getMax(arr, stack, max, i);
        }
        
        return max;
    }
    private static int getMax(int[] arr, Stack<Integer> stack, int max, int i){
        int area;
        int popped = stack.pop();
        if(stack.isEmpty()){
            area = arr[popped] * i;
        }
        else{
            area = arr[popped] * (i-1-stack.peek());
        }
        return Math.max(max,area);
    }
}
