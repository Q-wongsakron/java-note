package leetcode;

import java.util.HashMap;

public class twosum {
    
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int complement = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n ; i++){
            map.put(nums[i] , i);
        }

        for(int j = 0; j < n; j++){
            complement = target - nums[j];
            if(map.containsKey(complement) && map.get(complement) != j)
            {
                return new int[]{j, map.get(complement)};
            }
        }
        return new int[]{};
    }
}
