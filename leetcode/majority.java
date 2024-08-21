package leetcode;

import java.util.HashMap;

public class majority {


    public static void main(String[] args) {
        int [] nums =  {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }   
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> h1 = new HashMap<>();

        for (int i : nums) {
            h1.put(i, h1.getOrDefault(i, 0) + 1); 
            // get default value if it has else value is 0 + 1 and ins

            if (h1.get(i) > nums.length / 2) {
                return i;
            }
        }
        return 0; 
    }


    public static int majorityVoting(int[] nums) {
        int count = 0;
        Integer candidate = null;
        //{2,2,1,1,1,2,2};
        // First pass to find the candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Second pass to verify the candidate
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        // Ensure the candidate is the majority element
        if (count > nums.length / 2) {
            return candidate;
        } else {
            return 0;  // Return 0 if no majority element found, though per problem constraints, this case won't occur
        }
    }
}
