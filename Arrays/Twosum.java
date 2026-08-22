import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>  map= new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int complement=target-nums[i];
            if(map.containsKey(complement)){
            return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        
        return new int[]{};
    }
    public static void main(String[] args) {
        Solution ob=new Solution();
        int[] nums={1,2,3,4};
        int target=5;
       int result[]= ob.twoSum(nums, target);
        System.out.println(Arrays.toString(result));

    }
}