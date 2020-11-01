import java.util.*;
class Solution {

    public int[] twoSum(int[] nums, int target) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int index=i;
            if(map.get(target-n)!=null){//
                return new int[]{map.get(target-n),i};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[]{0,0};
    }
}