package com.sbp.datastructuresalgorithms.arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * Problem statement:
 * Given n non-negative integers representing an elevation map where the width of each bar is 1,
 * compute how much water it can trap after raining.
 *
 * Example 1:
 * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 * Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case,
 * 6 units of rain water (blue section) are being trapped.
 *
 * Example 2:
 * Input: height = [4,2,0,3,2,5]
 * Output: 9
 *
 * Constraints:
 * n == height.length
 * 1 <= n <= 2 * 104
 * 0 <= height[i] <= 105
 *
*/
public class TrappingRainWater {

    private static final Logger Log = LoggerFactory.getLogger(TrappingRainWater.class);

    /**
    Step-1: Constraint verification
    ==================================

     1.1: do the left or right sides of the graph count as walls?
    No, the sides are not walls.

    1.2: Will there be any negative integers?
    No, assume all integers are positive.
    */

    /**
     Step-2: Write out some test cases
     ==================================

     2.1) [0, 1, 0, 2, 1, 0, 3, 1, 0, 1, 2] ==> 1 + 1 +2 +1 + 2 +1 = 8 unit.

     2.2) [] ==> 0 unit

     2.3) [5] ==> 0 unit

     2.4) [3, 4, 3] ==> 0 unit
     */

    /**
     Step-3: Figure out a solution without code
     ===========================================

     */

    public void getTrappedRainwater() {
        int[] heights = {0, 1, 0, 2, 1, 0, 3, 1, 0, 1, 2};
        Log.info("1. TotalWater: " + getTrappedRainwater(heights));

        int[] heights2 = {3,5,3};
        Log.info("2. TotalWater: " + getTrappedRainwater(heights2));

        int[] heights3 = {6,3,5,3,10};
        Log.info("2. TotalWater: " + getTrappedRainwater(heights3));

    }

    private int getTrappedRainwater(int[] heights) {
        int left = 0, right = heights.length - 1;
        int totalWater = 0, maxLeft = 0, maxRight = 0;

        while(left < right) {

            if(heights[left] <= heights[right]) {
                if(heights[left] >= maxLeft) {
                    maxLeft = heights[left];
                } else {
                    totalWater += maxLeft - heights[left];
                }
                left++;
            } else {
                if(heights[right] >= maxRight) {
                    maxRight = heights[right];
                } else {
                    totalWater += maxRight - heights[right];
                }

                right--;
            }
        }
        return totalWater;
    }
}
