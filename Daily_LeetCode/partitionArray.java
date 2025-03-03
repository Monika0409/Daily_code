package Daily_LeetCode;

import java.util.ArrayList;

public class partitionArray {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(nums[i] < pivot){
                list1.add(nums[i]);
            }
            else if(nums[i] > pivot){
                list3.add(nums[i]);
            }
            else{
                list2.add(nums[i]);
            }
        }
        list1.addAll(list2);
        list1.addAll(list3);

        int i=0;
        int[] arr = new int[nums.length];
        for(int num : list1){
            arr[i++] = num;
        }
        return arr;
    }
}
