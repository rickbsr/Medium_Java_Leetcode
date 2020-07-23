package com.rick.problems;

public class MaximumAverageSubarrayI {

    public static void main(String[] args) {
        int nums[] = {1, 12, -5, -6, 50, 3}, k = 4;
        double res = new MaximumAverageSubarrayI().findMaxAverage(nums, k);
        System.out.println(res);
    }

    public double findMaxAverage(int[] nums, int k) {
        double sum = 0, res = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += (i <= k - 1) ? nums[i] : nums[i] - nums[i - k];
            if (i >= k - 1 && sum > res) res = sum;
        }
        return res / k;
    }
}
