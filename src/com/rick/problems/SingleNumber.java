package com.rick.problems;

import java.util.Arrays;

public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = {4, 1, 4, 3, 2, 1, 2};
        int res = new SingleNumber().singleNumber(nums);
        System.out.println(res);
    }

    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 1 || nums[0] != nums[1]) return nums[0];
        for (int i = 1; i < nums.length - 1; i++) if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) return nums[i];
        return nums[nums.length - 1];
    }
}
