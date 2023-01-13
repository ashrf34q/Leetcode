package main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            if(hashMap.containsKey(nums[i])) {

                return new int[]{hashMap.get(nums[i]), i};
            }
            else{
                int numToFind = target - nums[i];
                hashMap.put(numToFind, i);
            }
        }

        return null;
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 7, 9, 2};

       int[] result = twoSum(nums, 11);

        System.out.println(Arrays.toString(result));

    }

}
